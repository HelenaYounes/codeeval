import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] data = line.split(" ");
      int n= Integer.parseInt(data[0]);
      System.out.println(Fibonacci(n));

    }
  }

  public static String Fibonacci(int n){
    String[] answer= new String[n+1];
    for (int i = 0; i<=n;i++ ) {
      if (i==0) {
          answer[0] = "0";
      }
      if (i==1){
      answer[1] = "1";
      }
      if(i>1){
      int X=Integer.parseInt(answer[i-1])+Integer.parseInt(answer[i-2]);
      answer[i]=Integer.toString(X);
      }
    }
    return answer[n];
  }
}
