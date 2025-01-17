package Test;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args)
	{
		String arr[]= {"Zero","one","two","three","four","five","six","seven","eight","nine"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int reverse=0;
		    while(n!=0)
			{
			int lastDig=n%10;
			reverse= reverse*10 + lastDig;
			n=n/10;
			}
		    while(reverse!=0)
		    {
		    	int l=reverse%10;
				System.out.print(arr[l]+ " ");
				reverse=reverse/10;	
		    }
	}

}
