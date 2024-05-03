/*
  Write a method called calcYearlyTax that takes no arguments. 
  Inside the method it should take first input as your age and then 1
  2 other inputs as income of each month of the year. The method must 
  calculate and print Tax for each month and finally print the total Tax of 
  the whole year based on the HW-3A conditions.
  Note: You must call the method written in task HW-3A, 
  otherwise this task would be considered invalid.
*/

import java.util.Scanner;
public class hw3B_9 {
  
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
  
  public static double calcYearlyTax(int age) { 
    
    Scanner sc = new Scanner(System.in);
    double totalTax = 0.0;
    for (int month = 1; month <= 12; month++) { 
      double income = sc.nextDouble(); 
      double monthTax = calcTax(age, income); 
      System.out.println("month " + month + " tax: " + monthTax); 
      totalTax += monthTax; 
    }
    return totalTax;
    
  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("your age: ");
    int age = sc.nextInt(); 
    double totalTax = calcYearlyTax(age);
    System.out.println("Total Yearly Tax: " + totalTax);
    sc.close();
  }
  
}
