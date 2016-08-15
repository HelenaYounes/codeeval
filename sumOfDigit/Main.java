import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] data = line.split(" ");
      int a= Integer.parseInt(data[0]);
      int l = data.length;
      int X = Integer.parseInt(data[0]);
      int Y = 0;
      int sum = 0;
      while(X>0){
        Y = X % 10;
        sum+=Y;
        X = X / 10;
      }
      System.out.println(sum);

    }
  }
}
