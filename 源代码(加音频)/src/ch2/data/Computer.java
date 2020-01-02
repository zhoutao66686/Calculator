package ch2.data;
import java.util.*;
public class Computer {
   public double result;    //计算所得结果
   public Stack<Character>  dataItem;  //参与运算的数据项
   public Stack<Double>  tempResult;   //用堆栈存放临时结果
   public Stack<Character>  operator;  //存放运算符号
   public Computer(){
       init();
   }
   public void init() {
       dataItem = new Stack<Character>();
       tempResult = new Stack<Double>();
       dataItem.push('0');
       operator = new Stack<Character>();  
   }
   public void setDataItem(char c){ 
       if(c!='.')
         dataItem.push(c);
       else {
          if(!dataItem.contains('.'))
             dataItem.push(c);
       }
   }
   public void setOperator(char p){ 
       if(dataItem.empty()){   //如果没有数据项
          operator.clear();//防止用户不断更换或反复单击一个运算符
          operator.push(p);//堆栈压入运算符，即保留用户最后确定的运算符
          return;
       }
       if(operator.empty()) {     //如果没有运算符
          operator.push(p);       //堆栈压入运算符
          double m = computerDataItem(); //计算数据项
          dataItem.removeAllElements();  //将数据项中的数字清空
          tempResult.push(m);           //把临时结果m压入tempResult
       } 
       else {                     //如果有运算符
          double mData = computerDataItem(); //计算数据项
          dataItem.removeAllElements();  //将数据项中的数字清空
          char yuansuan =operator.pop(); //弹出已有的运算符
          double rTemp =tempResult.pop();     //弹出临时结果
          if(yuansuan == '+'){
             rTemp = rTemp+mData;
          }
          else if(yuansuan == '-') {
             rTemp = rTemp-mData;
          }
          else if(yuansuan == '*') {
             rTemp = rTemp*mData;
          }
          else if(yuansuan == '/') {
             rTemp = rTemp/mData;
          }
          tempResult.push(rTemp);  //把新临时结果rTemp压入tempResult
          operator.push(p);        //新运算符压入operator
       }
   }
   public char getOperator() {
      if(operator.empty()){
         return '\0';
      }
      return operator.peek();
   }
   public void backspace() {
      if(dataItem.size()>=1){
         dataItem.pop();
      }
   }
   public void initDataItemByMath(MathComputer computer){ 
       computer.handle(this);     //对compter中的数据项进行数学计算
   }
   public double getResult() {    //得到计算结果
      double endItem = 0;
      if(dataItem.empty()){
         endItem = tempResult.peek();
      }
      else {
         endItem = computerDataItem();
      }
      if(operator.empty()) {
         result = endItem;
         return result;
      }
      char yuansuan =operator.peek(); //最后的运算符
      if(yuansuan == '+'){
          result = tempResult.peek()+endItem;
      }
      else if(yuansuan == '-') {
          result = tempResult.peek()-endItem;
      }
      else if(yuansuan == '*') {
          result = tempResult.peek()*endItem;
      }
      else if(yuansuan == '/') {
          result = tempResult.peek()/endItem;
      }
      return result;
   }
   public double getTempResult() {    //得到临时结果
      double r = 0;
      if(tempResult.empty()){
         r = computerDataItem();
      }
      else {
         r= tempResult.peek();
      }
      return r;
   }
   public double computerDataItem(){  //计算出数据项的double型结果
      if(dataItem.empty()){
         return tempResult.peek();
      }
      StringBuffer str = new StringBuffer();
      double doubleData = 0;
      for(int i=0;i<dataItem.size();i++) {
          str.append(dataItem.get(i));//获取堆栈中的数字(但不弹栈)
      }
      try{
         doubleData = Double.parseDouble(str.toString());
      }
      catch(NumberFormatException exp){
          doubleData = 0;
      }
      return doubleData;
  }
}
