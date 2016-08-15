import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String fmt = "(\\(|\\)\\,\\()|(\\(|\\))";

    String tokens[] = line.split(fmt);
    for(String token: tokens) {
        System.out.print(token+" ");
      // String answer = line.substring(line.indexOf("(")+1,line.indexOf(")"));
      // String[] arg=line.split(line.charAt(6));
      // for (int i=0; i<args.length; i++) {
      //   // arg[i]=arg[i].trim();
      // System.out.println(answer);
    }
    }
  }
}
