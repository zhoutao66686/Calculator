package ch2.view;
import java.awt.event.*;
public class HandleBack extends HandleEvent{
    HandleBack(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       window.computer.backspace();
       showMess();
    }
}