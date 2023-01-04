package com.arrays;


import java.util.Scanner;

public class QuadraticEqution 
{
	 public double findDelta(int a, int b , int c){
	        double delta=(b*b - 4*a*c);
	        return delta;
	    }

	 
	public double quadracticEquation1(int a, int b,int c)
	    {

	       double sqrtOfDelta=Math.sqrt(findDelta(a,b,c));
	        double equation1=(-b + sqrtOfDelta )/(2*a);
	        return equation1;
	    }
	public double quadracticEquation2(int a, int b,int c)
    {

       double sqrtOfDelta=Math.sqrt(findDelta(a,b,c));
        double equation2=(-b + sqrtOfDelta )/(2*a);
        return equation2;
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Values:");
		int a=sc.nextInt();
		System.out.println("Enter B Values:");
		int b=sc.nextInt();
		System.out.println("Enter C values:");
		int c=sc.nextInt();
		
		
		QuadraticEqution qa=new QuadraticEqution();
		
		double equation1=qa.findDelta(a, b, c);
		double equation2=qa.quadracticEquation2(a, b, c);
		
		
		System.out.println("Root of X:"+equation1);
		
		System.out.println("Root of X:-"+equation2);
		
	}
	

}
