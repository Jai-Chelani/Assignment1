package Test;



public class PrintArmstrongBtw {

	public static void main(String[] args)
	{
		
		
		
		int n;
		int sum=0;
		
       
		for(int i=1;i<=1000;i++)
		{ 
			n=i;
			String str=Integer.toString(i);
			int pow=str.length();
			while(n>0)
			{
			int r=n%10;
			sum+=Math.pow(r,pow);
			n=n/10;
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
			 sum=0;
		}
		

	}

}
