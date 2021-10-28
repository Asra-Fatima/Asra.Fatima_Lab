package Asra.Fatima.lab.programs;
import java.util.Scanner;

public class Lab1_q3 {
	public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        short a=sc.nextShort();
        Series sc1=new Series();
        long b=sc1.input(a);
        System.out.println("The "+a+"th number of the faboniccs series is "+b);
    }
}

 class Series {
    int a=1,b=1,c=0,count;
    int input(int a){
        count=a;
        count=fab(count);
        return count ; 
    }
    int fab(int count) {
        if(count!=2){
            c=a+b;
            a=b;
            b=c;
            fab(--count);
        }
        return c;
    }

}
