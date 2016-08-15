import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      int sum=0;
      for (int y=100; y>0; y--) {
        for (int i=0; i<line.length(); i++) {
          char digit= line.charAt(i);
          int chiffre= Character.getNumericValue(digit);
          chiffre= chiffre*chiffre;
          sum+=chiffre;
        }
        if (sum>1) {
          line=Integer.toString(sum);
          sum=0;
        }
        else{
          break;
        }
      }
      if (sum==1){
        System.out.println("1");
      }
      else{
        System.out.println("0");
      }
    }
  }
}










// if (isHappy(n)==true) {
//   System.out.println("1");
// }
// else{
//   System.out.println("0");
// }
//
// int r;
// int sum=0;
// int count=0;
// int test= Integer.parseInt(line);
//   while(sum!=1 && count<100){
//     System.out.println(sum);
//     r= test % 10;
//     sum+=Math.pow(r,2);
//     System.out.println(sum);
//
//     test/= 10;
//     System.out.println(test);
//     if(test<=1 && count<100){
//       test=sum;
//       System.out.println(test);
//       sum=0;
//       count++;
//     }
//   }
//   if (sum==1){
//     System.out.println("1");
//   }
//   else{
//     System.out.println("0");
//   }
