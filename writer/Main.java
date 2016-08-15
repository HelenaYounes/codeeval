import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] data=line.split("\\|");
      String name=data[0];
      String key=data[1];
      key= key.trim();
      String[] key1=key.split(" ");
      String solution="";
      int position=0;
      for (int i=0; i<key1.length; i++) {
        position=Integer.parseInt(key1[i]);
        solution+=name.charAt(position-1);
      }
      System.out.println(solution);
    }
  }
}
