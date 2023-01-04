package com.arrays;


public class WindChil 
{
	public double windChill(double tempinfahernheit,double windSpeed)
	{
		double windChill,a,b,c;
		 a=(0.6215*tempinfahernheit);
	     b=(0.4275*tempinfahernheit);
	     c=(b-35.75);

	      windChill=35.75 + a + c * (Math.pow(windSpeed,0.16));
	      return windChill;
	}

	public static void main(String[] args) 
	{
		double windSpeed,windChill,tempinfahernheit=0;
		
		tempinfahernheit=Double.parseDouble(args[0]);
		windSpeed=Double.parseDouble(args[1]);
		
		WindChil wn=new WindChil();
		windChill=wn.windChill(tempinfahernheit, windSpeed);
		System.out.println("After Calculating wind chill:"+windChill);
		

	}

}
