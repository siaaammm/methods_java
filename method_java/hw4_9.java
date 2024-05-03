/*
  Write a method called oneToN that prints 1 till N recursively.
*/

import java.util.Scanner;

public class hw4_9 {
  
  public static void oneToN(int st, int n) {
    
    if (st > n) {
      return;
    }
    
    System.out.print(st + " ");
    oneToN(st + 1, n);
    
  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int N = sc.nextInt();
    oneToN(1, N);
    sc.close ();
  }
  
}
