import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      int[] list=new int[line.length()];
      for (int i=0; i<line.length(); i++) {
        int ascii=(int) line.charAt(i);
        if(ascii>96){
        ascii-=32;
        }
        // if (ascii!=32){
           list[i]=ascii;
        // }
      }
      //count occurence;
      int a=0;
      int[] solution=new int[list.length];
      for (int y=65; y<91; y++ ) {
        int count=0;
        for (int i=0; i<list.length; i++){
          if (list[i]==y) {
            count++;
          }
        }
        if (count>0){
          solution[a]=count;
          a++;
        }
      }
      // //Sort the list

      for (int i=0; i<solution.length; i++ ) {
        for (int y=list.length-1; y>i; y--) {
          if(solution[i]<solution[y]){
            int temp=solution[i];
            solution[i]=solution[y];
            solution[y]=temp;
          }
        }
      }
      int answer=0;
      int beauty=26;
      for(int i=0; i<solution.length; i++){
        int multiplication=solution[i]*beauty;
        answer+= multiplication;
        beauty--;
      }
      System.out.println(answer);
    }
  }
}
