import java.io.*;
public class Main {
  public static String printNumber(int n){
    String number ="";
    if(n<10){
      number +="   " + Integer.toString(n);
    }
    if(n>9 && n<100){
      number +="  "+Integer.toString(n);
    }
    if (n>99){
      number +=" "+Integer.toString(n);
    }

    return number;
  }
  public static void main (String[] args) throws IOException {

    for (int i=1; i<=12; i++) {
      String row = "";
      for ( int j =1; j<=12; j++){
        int X = i * j;
        row += printNumber(X);
      }
      System.out.println(row);
    }
  }
}
