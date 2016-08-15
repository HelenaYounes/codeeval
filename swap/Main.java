
import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String solution="";
      int letter;
      for (int i=0; i<line.length(); i++) {
        char lettre=line.charAt(i);
        int ascii=(int) line.charAt(i);
        if (ascii>96 && ascii<123) {
          // letter=ascii+32;
          lettre=Character.toUpperCase(lettre);
        }
        if(ascii>64 && ascii<91){
          lettre=Character.toLowerCase(lettre);
        }
      solution+=lettre;
      }
      System.out.println(solution);
    }
  }
}
