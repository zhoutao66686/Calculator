package ch2.view;
import ch2.music.Play;

import java.awt.event.*;
public class HandleClear extends HandleEvent{
    HandleClear(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       window.computer.init();
       showMess();
        Play play = new Play();
        play.clear_music();
    }
}