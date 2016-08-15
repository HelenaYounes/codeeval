import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] data = line.split(" ");
      int l = data.length;
      String[] answer = new String[l];
      for (int i=0;i<l;i++) {
        String string = data[i];
        String word = "";
        for (int j=0; j<string.length();j++ ) {
          char k= string.charAt(j);
          char h= Character.toLowerCase(k);
          if ( k != h){
           k= h;
          }
          word+=k;
        }
        answer[i] = word;
      }
      System.out.println(String.join(" ", answer));
    }
  }
}
