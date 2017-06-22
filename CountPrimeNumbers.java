import java.util.Scanner;
public class CountPrimeNumbers {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int r1,r2,count=0,i,j;
		r1=s.nextInt();
		r2=s.nextInt();
		int num=r1;
		for(num=r1;num<=r2;num++)
		{
			boolean isPrime=true;
		    for(i=2;i<num;i++)
		    {
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			
		   }	
		if(isPrime) {
            count++;
        }
		}
		
		System.out.println(count);
     }
}

