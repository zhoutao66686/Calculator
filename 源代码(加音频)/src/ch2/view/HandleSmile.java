package ch2.view;
import javax.swing.JButton;
import java.awt.event.*;
public class HandleSmile extends HandleEvent{
    HandleSmile(CalculatorWindow window) {
        super(window);
    }
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton)e.getSource();
        String  buttomName = b.getText().trim();//去除前后空白区
        String s1 = "Hello, are you OK?";
        String s2 = "Welcome to use ";
        String s3 = "this smart calculator.";
        window.showTempResult.setText(s1);

        window.showDataItem.setText(s2);
        window.resultShow.setText(s3);
//        showMess();
    }
}