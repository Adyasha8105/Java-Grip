import java.util.*;

class ArithmeticException1 {
	public static void main(String[] args) 
	{
		double result=0.0;
	   Scanner	sc=new	Scanner(System.in);
	   System.out.println("Enter the numerator:");
	   int numerator=sc.nextInt();
	   System.out.println("Enter the Denominartor:");
	   int divisor=sc.nextInt();
	   try
	   {
		 result=numerator/divisor;
		  System.out.println("The division value is:"+result);
	   }
	   catch (ArithmeticException e)
	   {
		   System.out.println("Exception caught: Division by zero.");
	   }
	}
}
