package ch2.view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import ch2.data.*;
public class CalculatorWindow extends JFrame {
    Computer  computer;     //需要提供视图的对象
    JButton numberButton[]; //数字按钮
    JButton operatorButton[];//加减乘除按钮
    JButton dot,pOrN,back,equation,clear;//小数点，正负号,退格,等号,清零; 
    JButton sqrt,reciprocal;//求平方根，求倒数按钮
    JButton sin,cos,tan;//求sin，cos，tan
    JButton smile;//表情
    JButton factorial;
    JTextField resultShow;          //显示计算结果
    JTextField showTempResult; //显示当前计算过程的临时结果
    JLabel     showOperator  ; //显示运算符号
    JTextField showDataItem; //显示当前参与运算的数据项
    JTextArea  saveComputerProcess; //显示计算步骤
    JButton saveButton,copyButton,clearTextButton;//保存计算过程等按钮
    public CalculatorWindow(){
        computer = new Computer();
        initView();             //设置界面
        initActionListener();  //注册监视器
    }
    public void initView(){
        setTitle("计算器");
        JPanel panelLeft,panelRight; 
        resultShow=new JTextField(10);
        resultShow.setHorizontalAlignment(JTextField.LEFT);
        resultShow.setForeground(Color.blue);
        resultShow.setFont(new Font("TimesRoman",Font.BOLD,14));
        resultShow.setEditable(false);
        resultShow.setBackground(Color.green);
        showTempResult=new JTextField();
        showTempResult.setHorizontalAlignment(JTextField.RIGHT);
        showTempResult.setFont(new Font("Arial",Font.BOLD,14));
        showTempResult.setBackground(Color.cyan);
        showTempResult.setEditable(false);
        showOperator = new JLabel();
        showOperator.setBackground(Color.pink);
        showOperator.setFont(new Font("Arial",Font.BOLD,18));
        showOperator.setHorizontalAlignment(JTextField.CENTER);
        showDataItem = new JTextField(); 
        showDataItem.setBackground(Color.white);
        showDataItem.setHorizontalAlignment(JTextField.LEFT);
        showDataItem.setFont(new Font("Arial",Font.BOLD,14));
        showDataItem.setEditable(false);
        saveComputerProcess=new JTextArea();
        saveComputerProcess.setEditable(false);
        saveComputerProcess.setFont(new Font("宋体",Font.PLAIN,14));
        numberButton=new JButton[10];
        for(int i=0;i<=9;i++) {
            numberButton[i] = new JButton("" + i);
            numberButton[i].setFont(new Font("Arial", Font.BOLD, 20));
        }
        operatorButton=new JButton[4];
        String 运算符号[]={"+","-","*","/"}; 
        for(int i=0;i<4;i++){
           operatorButton[i]=new JButton(运算符号[i]);
           operatorButton[i].setFont(new Font("Arial",Font.BOLD,20));
            operatorButton[i].setForeground(Color.RED);
        }
        dot=new JButton(".");
        pOrN=new JButton("+/-");
        pOrN.setForeground(Color.BLUE);
        equation=new JButton("=");
        equation.setForeground(Color.BLUE);
        back  = new JButton("退格");
        back.setForeground(Color.BLUE);
        clear = new JButton("C");
        clear.setForeground(Color.BLUE);
        sqrt=new JButton("sqrt");
        sqrt.setForeground(Color.BLUE);
        reciprocal=new JButton("1/x");
        reciprocal.setForeground(Color.BLUE);
        saveButton=new JButton("保存");
        copyButton=new JButton("复制");
        clearTextButton=new JButton("清除");

        sin=new JButton("sin");
        sin.setForeground(Color.BLUE);
        cos=new JButton("cos");
        cos.setForeground(Color.BLUE);
        tan=new JButton("tan");
        tan.setForeground(Color.BLUE);

        smile = new JButton("(●'~'●)");
        smile.setForeground(Color.BLUE);

        factorial = new JButton("!");
        factorial.setForeground(Color.BLUE);


        panelLeft=new JPanel(); //开始布局，创建布局需要的容器
        panelRight=new JPanel();
        panelLeft.setLayout(new BorderLayout()); 
        JPanel centerInLeft=new JPanel();
        Box boxH=Box.createHorizontalBox();
        boxH.add(showTempResult);
        boxH.add(showOperator);
        boxH.add(showDataItem);
        panelLeft.add(boxH,BorderLayout.NORTH);
        panelLeft.add(centerInLeft,BorderLayout.CENTER);
        centerInLeft.setLayout(new GridLayout(5,6));

        centerInLeft.add(numberButton[7]); //布局的第1行
        centerInLeft.add(numberButton[8]);
        centerInLeft.add(numberButton[9]);
        centerInLeft.add(operatorButton[0]);
        centerInLeft.add(back);
        centerInLeft.add(sin);

        centerInLeft.add(numberButton[4]);//布局的第2行
        centerInLeft.add(numberButton[5]);
        centerInLeft.add(numberButton[6]);
        centerInLeft.add(operatorButton[1]);
        centerInLeft.add(clear);
        centerInLeft.add(cos);

        centerInLeft.add(numberButton[1]);//第3行
        centerInLeft.add(numberButton[2]);
        centerInLeft.add(numberButton[3]);
        centerInLeft.add(operatorButton[2]);
        centerInLeft.add(reciprocal);
        centerInLeft.add(tan);

        centerInLeft.add(numberButton[0]); //第4行
        centerInLeft.add(pOrN);
        centerInLeft.add(dot);
        centerInLeft.add(operatorButton[3]);
        centerInLeft.add(sqrt);
        centerInLeft.add(equation);

        centerInLeft.add(new JLabel()); //第5行
        centerInLeft.add(new JLabel());
        centerInLeft.add(new JLabel());
        centerInLeft.add(new JLabel());
        centerInLeft.add(factorial);
        centerInLeft.add(smile);


        panelRight.setLayout(new BorderLayout());
        panelRight.add(resultShow,BorderLayout.NORTH);
        panelRight.add(
        new JScrollPane(saveComputerProcess),BorderLayout.CENTER);
        JPanel southInPanelRight=new JPanel();
        southInPanelRight.add(saveButton);
        southInPanelRight.add(copyButton);
        southInPanelRight.add(clearTextButton);
        panelRight.add(southInPanelRight,BorderLayout.SOUTH);
        JSplitPane split=new JSplitPane
                (JSplitPane.HORIZONTAL_SPLIT,panelLeft,panelRight);
        add(split,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(150,130,888,490);
        validate(); 
   }
   public void initActionListener(){
        HandleDigit handleDigit = new HandleDigit(this);
        for(int i=0;i<=9;i++){
          numberButton[i].addActionListener(handleDigit); //为数字按钮注册监视器
        } 
        dot.addActionListener(handleDigit);
        HandleOperator handleOperator = new HandleOperator(this);
        for(int i=0;i<4;i++){
          operatorButton[i].addActionListener(handleOperator);
        }
        pOrN.addActionListener(new HandlePN(this));
        sqrt.addActionListener(new HandleSqrt(this));
        reciprocal.addActionListener(new HandleReciprocal(this));
        back.addActionListener(new HandleBack(this));
       sin.addActionListener(new HandleSin(this));
       cos.addActionListener(new HandleCos(this));
       tan.addActionListener(new HandleTan(this));
       smile.addActionListener(new HandleSmile(this));
       factorial.addActionListener(new HandleFactorial(this));
       equation.addActionListener(new HandleEquation(this));
        clear.addActionListener(new HandleClear(this));
        HandleFile handleFile = new HandleFile(this);
        saveButton.addActionListener(handleFile);
        copyButton.addActionListener(handleFile);
        clearTextButton.addActionListener(handleFile);
   }

}
