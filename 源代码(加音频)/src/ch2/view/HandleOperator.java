package ch2.view;
import ch2.music.Play;

import javax.swing.JButton;
import java.awt.event.*;
public class HandleOperator extends HandleEvent{
    HandleOperator(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       JButton b = (JButton)e.getSource();
       String  buttomName = b.getText().trim();//去除前后空白区
       char operator = buttomName.charAt(0);
        Play play = new Play();
        switch (operator){
           case '+':
               play.plus_music();
               break;
           case '-':
               play.minus_music();
               break;
           case '*':
               play.multiply_music();
               break;
           case '/':
               play.divide_music();
               break;
       }
       window.computer.setOperator(operator);
       showMess();
   }
}