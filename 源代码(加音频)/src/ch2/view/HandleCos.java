package ch2.view;
import java.awt.event.*;
import ch2.data.Cos;
import ch2.music.Play;

public class HandleCos extends HandleEvent{
    HandleCos(CalculatorWindow window) {
        super(window);
    }
    public void actionPerformed(ActionEvent e){
        window.computer.initDataItemByMath(new Cos());
        Play play = new Play();
        play.cos_music();
        showMess();
    }
}