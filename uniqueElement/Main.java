import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
          line = line.trim();
          String[] data= line.split(",");
          String answer = "";
          int l = data.length;
          for (int i=0; i<l;i++ ) {
            if (i==0){
              String initial = data[i];
              answer+= initial;
            }
            if(i>0){
              String checkun= data[i];
              String checkdeux= data[i-1];
              if (!checkun.equals(checkdeux)) {
                answer+=","+checkun;
              }
            }

          }
          System.out.println(answer);
        }
    }
}


/*
@ i ==0 : String initial = data[0] = "1";
answer= ""+ initial : answer= "1 "
@i = 1 check un= data[1]= "1"
      checkdeux= data [0]="1"
      if(checkun pas egal a checkdeux)
    answer+= checkun;
@i = 2 check un= data[2]= "1"
      checkdeux= data [1]="1"
      if(checkun pas egal a checkdeux)
    answer+= checkun;
@i = 3 check un= data[3]= "3"
      checkdeux= data [2]="1"
      if(checkun pas egal a checkdeux)
    answer+= checkun;
    answer= "1 3 ";
@i = 4 check un= data[4]= "3"
      checkdeux= data [3]="3"
      if(checkun pas egal a checkdeux)
    answer+= checkun;

*/
