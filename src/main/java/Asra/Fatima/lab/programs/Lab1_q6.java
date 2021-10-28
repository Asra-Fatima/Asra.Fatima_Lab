package Asra.Fatima.lab.programs;
import java.util.Scanner;

public class Lab1_q6 {
	public static void main (String[] args) 
	{
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = calculateDifference(n);
		System.out.println("Output :" +sum);
	}
	    static int calculateDifference(int n)
	    {
	        int a = n * (n+1) / 2;
	        int b = n * (n+1) * (2*n + 1) / 6;
	        int sum=a*a-b;
	        return sum;
	    }

}
