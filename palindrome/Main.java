import java.io.*;
public class Main {

  // MAIN FUNCTION
  // JUST DECONSTRUCT YOUR VALUE HERE
  public static void main (String[] args) throws IOException {
    // Method Invocation
    // methodName(argument)

    int answer = maxPrimePalindromeUnder(1000000000);
    System.out.println(answer);
  }

  // HELPER METHODS HERE
  // ALL LOGIC GOES DOWN HERE
  public static boolean isPrime(int n){
    for (int i = 2; i<n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static boolean isPalindrome(int n){
    String w = String.valueOf(n);

    int L = w.length();
    for (int i = 0; i < L / 2; i++ ) {
      int j = L - 1 - i;
      if (w.charAt(i) != w.charAt(j)) {
        return false;
      }
    }
    return true;
  }
  // Method Signature [private/public] [static/__] [boolean/string/int/void] functionName(argumentType argumentName)
  public static int maxPrimePalindromeUnder(int n){
    // method body
    for (int i=n; i>0; i--) {
      if ( isPalindrome(i) == true && isPrime(i) == true ) {
        return i;
      }
    }
    return 0;
  }
}
