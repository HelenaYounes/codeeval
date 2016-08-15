import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
  File file = new File(args[0]);
  BufferedReader buffer = new BufferedReader(new FileReader(file));
  String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] data=line.split(";");
      String first=data[0];
      String second=data[1];
      String solution="";
      String[] data0=data[0].split(",");
      String[] data1=data[1].split(",");
      for (int i=0; i<data0.length; i++) {
        for (int y=0; y<data1.length; y++) {
          if (data0[i].equals(data1[y])){
            System.out.println(data0[i]);
          }
        }
      }
    }
  }
}
