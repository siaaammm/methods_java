/*
  Write a method called special_sum that calculates the sum of all numbers
  that are either prime numbers or perfect up till the integer value given in its 
  parameter. This integer value must be taken as user input and passed into 
  the method.
  Note: You must call the methods written in task HW-1A & HW-1B, 
  otherwise this task will be considered invalid.
  */

  import java.util.Scanner;

  public class hw1C_9 {
    
    public static boolean isPrime(int num) { 
      
      boolean isPrime = true;
      for (int i = 2; i <= num / 2; i++) { // 
        if (num % i == 0) {
          isPrime = false;
        }
      }
      return isPrime; 
      
    }
    
    public static boolean isPerfect(int num) { 
      
      int sum = 0;
      for (int i = 1; i < num; i++) {
        if (num % i == 0) {
          sum += i; 
        }
      }
      
      boolean isPerfect = sum == num; 
      return isPerfect; 
      
    }
    
    public static int special_sum(int n) { 
      
      int sum = 0;
      for (int i = 2; i <= n; i++) { 
        if (isPrime(i) || isPerfect(i)) { 
          sum += i; 
        }
      }
      int special_sum = sum; 
      return special_sum;
      
    }
    
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt(); 
      
      int result = special_sum(input); 
      System.out.println(result); 
      sc.close ();
    }
    
  }
  