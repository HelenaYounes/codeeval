
import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] data = line.split(" ");
      int n = data.length;// 1 2 3 4 5
      String[] solution= new String[n];
      //5
      for (int i=n-1; i>=0; i--){
        solution[(n-1) - i] = data[i];

      }
      System.out.println( String.join( " ", solution) );
    }
  }
}
