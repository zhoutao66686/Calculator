package ch2.view;
import ch2.music.Play;

import javax.swing.JButton;
import java.awt.event.*;
public class HandleDigit extends HandleEvent{
    HandleDigit(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       JButton b = (JButton)e.getSource();
       String  buttomName = b.getText().trim();//去除前后空白区
       char digit = buttomName.charAt(0);
        Play play = new Play();
        switch (digit){
            case '0':
                play.num0_music();
                break;
            case '1':
                play.num1_music();
                break;
            case '2':
                play.num2_music();
                break;
            case '3':
                play.num3_music();
                break;
            case '4':
                play.num4_music();
                break;
            case '5':
                play.num5_music();
                break;
            case '6':
                play.num6_music();
                break;
            case '7':
                play.num7_music();
                break;
            case '8':
                play.num8_music();
                break;
            case '9':
                play.num9_music();
                break;
            case '.':
                play.point_music();
                break;

        }
       window.computer.setDataItem(digit);
       showMess();
       if(digit == '.'){
         String s= get(window.computer.computerDataItem());
         window.showDataItem.setText("  "+s+"."); 
       } 
    }
}
