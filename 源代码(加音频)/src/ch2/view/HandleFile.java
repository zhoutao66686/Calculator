package ch2.view;
import java.awt.event.*;
import java.io.*;
import javax.swing.JFileChooser;
public class HandleFile extends HandleEvent{
    HandleFile(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       if(e.getSource()==window.copyButton)
           window.saveComputerProcess.copy();//复制选中的文本
       if(e.getSource()==window.clearTextButton)
           window.saveComputerProcess.setText(null);
       if(e.getSource()==window.saveButton){
           JFileChooser chooser=new JFileChooser();
           int state=chooser.showSaveDialog(null);
           File file=chooser.getSelectedFile();
           if(file!=null&&state==JFileChooser.APPROVE_OPTION){
             try{  String content=window.saveComputerProcess.getText();
                   StringReader read=new StringReader(content);
                   BufferedReader in= new BufferedReader(read);
                   FileWriter outOne=new FileWriter(file);
                   BufferedWriter out= new BufferedWriter(outOne);
                   String str=null;
                   while((str=in.readLine())!=null){
                      out.write(str);
                      out.newLine();
                   }
                  in.close();
                  out.close();
             } 
             catch(IOException e1){}
           }
       }
    }
}