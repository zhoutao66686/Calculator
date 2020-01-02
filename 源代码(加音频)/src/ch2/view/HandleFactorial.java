package ch2.view;
import java.awt.event.*;
import ch2.data.Factoral;
public class HandleFactorial extends HandleEvent{
    HandleFactorial(CalculatorWindow window) {
        super(window);
    }
    public void actionPerformed(ActionEvent e){
        window.computer.initDataItemByMath(new Factoral());
        showMess();
    }
}