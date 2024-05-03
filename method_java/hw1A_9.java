/*
  Write a method called isPrime which takes an integer in its 
  parameter to check whether a number is prime or not. If the number
  is prime then the method returns boolean true otherwise it returns
  boolean false.
*/

public class hw1A_9 {
  
    public static boolean isPrime(int num) {
      
      boolean isPrime = true;
      for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
          isPrime = false;
        }
      }
      return isPrime;
      
    }
    
    public static void main(String[] args) {
      
      boolean check = isPrime(15);
      System.out.println(check);
      
    }
    
  }
  