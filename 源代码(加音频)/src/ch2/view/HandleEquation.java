package ch2.view;
import ch2.music.Play;

import java.awt.event.*;
public class HandleEquation extends HandleEvent{
    HandleEquation(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       String mess=" "+window.computer.getTempResult()+" "+
                     window.computer.getOperator()+" "+
                     window.computer.computerDataItem()+" = "+
                     window.computer.getResult();
       window.saveComputerProcess.append("\n"+mess);
        Play play = new Play();
        play.equal_music();
   }
}