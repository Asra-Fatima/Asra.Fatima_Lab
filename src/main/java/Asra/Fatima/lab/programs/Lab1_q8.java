package Asra.Fatima.lab.programs;

public class Lab1_q8 {
	static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
          
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }   
     public static void main(String args[])
    {
    	 int n=8;
    	 if (isPowerOfTwo(n))
             System.out.println(" The given number " +n + " is power of two " );
         else
             System.out.println("The given number " +n + " is not power of two ");		
    }

}
