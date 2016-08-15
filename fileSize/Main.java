import java.io.*;
public class Main {
  //String[] args = {"input.txt", "Hello"}
  public static void main (String[] args) throws IOException {
    // args[0] == "input.txt"
    File file = new File(args[0]);
    System.out.println(file.length());

  }
}
