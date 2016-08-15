import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] data= line.split(",");
      int count=0;
      char[] element=data[0].toCharArray();
      char[] letter=data[1].toCharArray();
      String result="";
      for (int i=0; i<element.length; i++){
        if(element[i]== letter[0]){
          result=Integer.toString(i);
          count++;
        }
      }
      if (count==0){
        System.out.println("-1");
      }
      else{
      System.out.println(result);
      }
    }
  }
}
// line,
// split line en 2 Strings
// String 1= [] de char
// string 2=[] char
// for loop, de i justqua []char 1 length
// si char de la stirng 2 est dans char de la geuche, print i a tostring
