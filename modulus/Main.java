import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] data=line.split(",");
      int a=Integer.parseInt(data[0]);
      int b=Integer.parseInt(data[1]);
      int division= a/b;
      int solution=b*division;
      int remainder=a-solution;
      System.out.println(remainder);
    }
  }
}
