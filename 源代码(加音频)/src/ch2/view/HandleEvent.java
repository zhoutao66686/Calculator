package ch2.view;
import java.awt.event.*;
public class HandleEvent implements ActionListener{
    CalculatorWindow window;
    HandleEvent(CalculatorWindow window) {
       this.window=window;
    }
    public void showMess() {
       window.resultShow.setText(" =  "+get(window.computer.getResult()));
       window.showTempResult.setText(get(window.computer.getTempResult())+" ");
       window.showOperator.setText("  "+window.computer.getOperator()+" ");
       window.showDataItem.setText("  "+get(window.computer.computerDataItem()));
    }
    public String get(double r){//返回浮点数的串表示，如果小数部分是0,省略小数
       String s="";
       Double d = new Double(r);
       long n = d.longValue();//得到r整数部分
       if(Math.abs(r-n)>0)
            s =""+r;
       else
            s =""+n;
       return s;
    }
    public void actionPerformed(ActionEvent e){}
}