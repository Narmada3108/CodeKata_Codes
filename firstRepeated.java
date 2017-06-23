import java.util.*;
public class firstRepeated {
	public static void main(String[] args)
	{
		int j,i,t=-1,flag=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Array size:");
		int size=s.nextInt(); 
		int [] a=new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(i!=0 && a[i]==a[i-1])
			{
				continue;
			}
			for(j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
				  t=a[i];
				  flag=1;
				  break;
				}
			}
			if(flag==1)
			{
				break;
			}
		}
		System.out.println(t);
	}
}
