package ch2.view;
import java.awt.event.*;
import ch2.data.Sin;
import ch2.music.Play;

public class HandleSin extends HandleEvent{
    HandleSin(CalculatorWindow window) {
        super(window);
    }
    public void actionPerformed(ActionEvent e){
        window.computer.initDataItemByMath(new Sin());
        Play play = new Play();
        play.sin_music();
        showMess();
    }
}