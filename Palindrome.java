package Test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int i=n;
		int reverse=0;
            while(i!=0)
			{
			int lastDig=i%10;
			reverse= reverse*10 + lastDig;
			i=i/10;
            }
            if(n==reverse)
            {
             System.out.println("Palindrome");
            }
            else
            {
             System.out.println("Not a Palindrome");
         	
            }
	}
}
