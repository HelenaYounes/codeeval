import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      int sum=0;
      int n=line.length();
      for (int i=0; i<line.length(); i++) {
        int digit= Character.getNumericValue(line.charAt(i));
        sum+=Math.pow(digit,n);
      }
      int nombre=Integer.parseInt(line);
      if (sum==nombre){
        System.out.println("True");
      }
      else{
        System.out.println("False");
      }
    }
  }
}
