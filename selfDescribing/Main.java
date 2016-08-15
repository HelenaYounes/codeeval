import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] data=line.split("");
      String solution="";
      //String line convert en array of string
      int[] element=new int[data.length];

      //Convert the []String en int[]
      for (int i=0; i<data.length;i++ ) {
        element[i]=Integer.parseInt(data[i]);
      }
      //Count occurence of positon number in the int[]
      for (int i=0; i<element.length; i++) {
        int count=0;
        for (int y=0; y<element.length; y++) {
          if (i==element[y]) {
            count++;
          }
        }
        solution+=Integer.toString(count);
      }
      if (solution.equals(line)) {
        System.out.println("1");
      }
      else{
        System.out.println("0");
      }
    }
  }
}
