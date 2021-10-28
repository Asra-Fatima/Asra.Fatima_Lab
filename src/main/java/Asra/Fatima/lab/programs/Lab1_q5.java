package Asra.Fatima.lab.programs;
import java.util.Scanner;

public class Lab1_q5 {
	public static void main (String[] args) 
	{
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = calculateSum(n);
		System.out.println("Output :" +sum);	
	}
	static int calculateSum(int n)
	{
	    int a=3, b=5, c;
	    a=  ((n / a)) * (2 * a + (n / a - 1) * a) / 2;
	    b = ((n / b)) * (2 * b + (n / b - 1) * b) / 2;
	    c = ((n / 15)) * (2 * 15 + (n / 15 - 1) * 15) / 2; 
	   int sum = a + b - c;
	   return sum;
	}

}
