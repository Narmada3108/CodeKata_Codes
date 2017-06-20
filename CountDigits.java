import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the integer:");
		int number=s.nextInt();
		int temp,p;
		temp=number;
		int i=0;
		if(number==0)
			System.out.println("Number of digits in "+number +" is : "  + 1);
		else
		{
		while(temp!=0)
		{
			p=temp/10;
			temp=p;
			i++;
		}
		System.out.println("Number of digits in "+number +" is : "  + i);
	    }
	}
}
