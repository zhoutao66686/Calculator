package ch2.view;
import java.awt.event.*;
import ch2.data.Sqrt;
import ch2.music.Play;

public class HandleSqrt extends HandleEvent{
    HandleSqrt(CalculatorWindow window) {
        super(window);
    }
    public void actionPerformed(ActionEvent e){
        window.computer.initDataItemByMath(new Sqrt());
        showMess();
        Play play = new Play();
        play.kaifang_music();
    }
}