package ch2.view;
import java.awt.event.*;
import ch2.data.Reciprocal;
public class HandleReciprocal extends HandleEvent{
    HandleReciprocal(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       window.computer.initDataItemByMath(new Reciprocal());
       showMess();
    }
}