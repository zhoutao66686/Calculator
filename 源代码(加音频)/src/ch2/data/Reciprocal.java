package ch2.data;
public class Reciprocal implements MathComputer {
   public void handle(Computer data){
       String s ="";
       double r =data.computerDataItem();
       r =1/r;
       Double d = new Double(r);
       long n = d.longValue();//得到r整数部分
       if(Math.abs(r-n)>0)//小数部分不是0
            s =""+r;
       else
            s =""+n;//如果小数部分是0,省略小数
       data.dataItem.removeAllElements();
       for(int i = 0;i<s.length();i++){
          data.dataItem.push(s.charAt(i));
       }
   }
}