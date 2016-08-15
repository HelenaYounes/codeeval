
import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      char data[]=line.toCharArray();
      int count=0;
      for (int i=0; i<data.length; i++) {
        for (int y=0; y<data.length;y++ ) {
          int position= Character.getNumericValue(data[y]);
          System.out.print(position);
          System.out.print(i);
          if(position==i){
            count++;
          }
          System.out.println(count);
          System.out.println(data[i]);
        }

        if(data[i]==count){
          System.out.println("true");
        }
        else{
          System.out.println("false");
        }
      }

      for (int i=0; i<line.length(); i++) {
        String position=Integer.toString(i);
        for (int y=0; y<line.length(); y++) {
            if (line.charAt(i)==position) {
              count++;
            }
        }



      }
    }
  }
}
