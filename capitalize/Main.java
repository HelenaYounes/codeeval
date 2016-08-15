import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String solution="";
      int first= (int)line.charAt(0);
      if (first>96) {
        first-=32;
      }
      char prem= (char) first;
      solution+=prem;
        for (int i=1; i<line.length(); i++) {
        char x=line.charAt(i);
        int cap= (int)line.charAt(i);
        int space=(int) line.charAt(i-1);
        if (space==32 && cap>96 && cap<123) {
          cap-=32;
        }
        char letter= (char) cap;
        solution+=letter;
      }
      System.out.println(solution);
    }
  }
}
