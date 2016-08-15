import java.io.*;
public class Main {
  //String[] args = {"input.txt", "Hello"}
  public static void main (String[] args) throws IOException {
    // args[0] == "input.txt"
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    int answer = 0;
    while ((line = buffer.readLine()) != null) {
      answer+=Integer.parseInt(line);
    }
    System.out.print(answer);
  }
}



/*
line == "12";
Y+ = Integer.parseInt(line); ==> Y=0 +12, Y=12;
line = "5";
Y+= Integer.parseInt(line); ===> y = 12 + 5 ; Y = 17;
line ="3";
Y+= Integer.parseInt(line) ===Y= 17+ 3 Y=20;
line = null===>break
System.out.print(Y);



*/
