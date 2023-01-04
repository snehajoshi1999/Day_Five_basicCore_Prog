package com.arrays;

public class Distance {

	  public static void main(String args[]) 
	  {
		  double x = Integer.parseInt(args[0]);
	        double y= Integer.parseInt(args[1]);

	        double distance = Math.pow(x*x,+ y*y);

	        System.out.println("Distance From (" + x + " , " + y + " ) to ( 0 , 0 ) = " + distance);
	    }

}
