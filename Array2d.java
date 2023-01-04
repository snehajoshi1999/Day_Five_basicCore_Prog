package com.arrays;

public class Array2d 
{
	public static void main(String[] args) 
	{
		
		int[][][] c= {{{10,20},{30,40,50,60},{70,80,90}}};
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				for(int k=0;k<c[i][j].length;k++)
				{
					System.out.print(c[i][j][k]+" ");
				}
				System.out.println(" ");
			}
		}
	
	}}
		/*
		 * int[] a={20,30,40};
		 * 
		 * //System.out.println(a[0].length);
		 * 
		 * for(int i=0;i<=a.length;i++) {
		 * 
		 * System.out.println(a[i]); }
		 */
	
	
		/*
		 * int[][] b= {{10,20,30},{30,40},{50,60}};
		 * 
		 * for(int i=0;i<=b.length;i++) { for(int j=0;j<b[i].length;j++) {
		 * System.out.print(b[i][j]);
		 * 
		 * } System.out.println(); }
		 * 
		 */
	/*int[][][] c= {{{10,20},{30,40,50,60},{70,80,90}}};
	
	for(int )
*/