package com.brizlabs;

import java.util.Scanner;
class Daily_salary
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the wage per hour");
  int basic = sc.nextInt();
  Salary sal = new Salary();
  sal.calculateTotal(basic);
 }
}

class Salary
{
 private double da;

 void calculateTotal(int basic)
 {
  da = 8 * basic;
  
  double total = (da)*30;
  
  System.out.println("Basic hours:\t" + basic);
  System.out.println("Daily Employee Wage:\t" + da);
  
  System.out.println("Total Salary is: " + total);
 }
}
