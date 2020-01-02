package ch2.view;
import java.awt.event.*;
import ch2.data.PorN;
public class HandlePN extends HandleEvent{
    HandlePN(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       window.computer.initDataItemByMath(new PorN());
       showMess();
   }
}