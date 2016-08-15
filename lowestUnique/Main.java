import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] arg=line.split(" ");
      int[] num= new int[arg.length];
      String solution="";
      for (int i=0; i<arg.length; i++) {
        num[i]=Integer.parseInt(arg[i]);
      }
      for (int i=0; i<arg.length; i++) {
        for (int y=num.length-1; y>i; y--) {
          if (num[i]>num[y]) {
            int temp=num[i];
            num[i]=num[y];
            num[y]=temp;
          }
        }
      }
      //problem ici, si je start at i=1 je skip si la reponse est a arg[0]...
      for (int i=0; i<num.length-1; i++) {
        if(num[i]!=num[i+1] || num[i]!=num[i-1]){
          solution+=num[i];
          break;
        }
      }
      if (solution==""){
        System.out.println("0");
      }
      System.out.println(solution);
      for (int i=0; i<arg.length; i++){
        if (arg[i].equals(solution)) {
          System.out.println(arg[i]);

        }
      }
    }
  }
}
