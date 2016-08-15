import java.io.*;
public class Main {
  public static void main (String args[]) throws IOException {
    int answer = SumOfPrimeUnder(1000);
    System.out.println(answer);
  }
  public static boolean isPrime(int n){
    if ( n < 2 ) {
      return false;
    }
    for (int i = 2; i<n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int SumOfPrimeUnder(int n){
    int sum=0;
    int i = 0;
    while (n > 0) {
      if (isPrime(i) == true) {
        sum+=i;
        n--;
      }
      i++;
    }
    return sum;
  }
}
