import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim(); // " a b c " => "a b c"
      String[] data = line.split(","); //["12", "12", "34"]

      int X = Integer.parseInt(data[0]);
      int p1 = Integer.parseInt(data[1]);
      int p2 = Integer.parseInt(data[2]);
      boolean output = false;

      String binary = Integer.toBinaryString(X);
      int l = binary.length();
      if (binary.charAt(l - p1) == binary.charAt(l - p2)) {
        output = true;
      }

      System.out.println(output);
    }
  }
}
