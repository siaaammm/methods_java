/*
  Write a method called calcTax that takes 2 arguments which are your
  age then your salary. The method must calculate and return the tax as
  per the following conditions:
  a. No tax if you are less than 18 years old.
  b. No tax if you get paid less than 10,000
  c. 7% tax if you get paid between 10K and 20K
  d. 14% tax if you get paid more than 20K
*/

public class hw3A_9 {
  
    public static double calcTax(int age, double salary) {
      
      if (age < 18) {
        return 0.0;
      }
      if (salary < 10000) {
        return 0.0;
      }
      if (salary >= 10000 && salary <= 20000) {
        return 0.07 * salary;
      }
      return 0.14 * salary;
      
    }
    
    public static void main(String[] args) {
      
      double t = calcTax(20,18000);
      System.out.println(t);
      
    }
  }
  