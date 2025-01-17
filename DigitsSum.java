package Test;

import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) 
	{
		 Scanner sc= new Scanner(System.in);
	     System.out.println("Enter a number:");
	     int n=sc.nextInt();
		int sum = 0;
        while (n != 0) {

            
            int last = n % 10;

            
            sum += last;

            
            n /= 10;
        }
         System.out.println(sum);
	}

}
