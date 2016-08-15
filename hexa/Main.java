import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      for (int i=line.length()-1;i<=0; i-- ) {
        int remainder=line.charAt(i)%16;
        System.out.println(remainder);
      }
    }
  }
}
