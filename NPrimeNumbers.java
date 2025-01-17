package Test;

import java.util.Scanner;

public class NPrimeNumbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{ 
			int temp=i;
			int f=0;
			for(int j=2;j<Math.sqrt(temp);j++)
			{
				if(temp%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
