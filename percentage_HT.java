package com.brizlabs;

import java.util.Scanner;

public class percentage_HT {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("value of itrations:");
		int x1=sc.nextInt();
		
		if(x1%2==0) 
		{
			System.out.println("heads");
		}
		else
		{
			System.out.println("tails");
		}
	}
}
