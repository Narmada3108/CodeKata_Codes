import java.util.*;
public class RepeatedNum1 {
	public static void main(String[] args)
	{
		int i,j;
		System.out.println("size:");
		Scanner s=new Scanner(System.in);
		int s1=s.nextInt();
		int a1 []=new int [s1];
		for(i=0;i<s1;i++)
		{
			a1[i]=s.nextInt();
		}
		int v=0;
		int a2[]=new int[30];
		for(i=0;i<s1;i++)
		{
			for(j=i+1;j<s1;j++)
			{
				if(a1[i]==a1[j])
				{
					 
				  a2[v]=a1[i];
				  v++;
				}
			}	
		 }
		for(i=0;i<v;i++)
		{
			System.out.print(a2[i]+ " ");
		}
		if(v==0)
		{
			System.out.println("No number is repeated");
		}
	}
}
