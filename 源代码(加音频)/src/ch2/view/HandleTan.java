package ch2.view;
import java.awt.event.*;
import ch2.data.Tan;
import ch2.music.Play;

public class HandleTan extends HandleEvent{
    HandleTan(CalculatorWindow window) {
        super(window);
    }
    public void actionPerformed(ActionEvent e){
        window.computer.initDataItemByMath(new Tan());
        Play play = new Play();
        play.tan_music();
        showMess();
    }
}



