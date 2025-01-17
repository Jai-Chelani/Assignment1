package Test;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		String str=Integer.toString(n);
		int power=str.length();
		int sum=0;
		int curr=n;
       
		while(curr>0)
		{
			int r=curr%10;
			sum+=Math.pow(r,power);
			curr=curr/10;
		}
		if(sum==n)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
	}

}
