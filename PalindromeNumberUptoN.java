package Test;

import java.util.Scanner;

public class PalindromeNumberUptoN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{ 
			int reverse=0;
			int j=i;
            while(j!=0)
			{
			int lastDig=j%10;
			reverse= reverse*10 + lastDig;
			j=j/10;
            }
            if(i== reverse)
            {
            	System.out.println(i);
            }
            
		}   

	}

}
