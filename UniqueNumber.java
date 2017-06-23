import java.util.*;
public class UniqueNumber {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Array size:");
		int size=s.nextInt(); 
		int [] a=new int[size];
		System.out.println("*Array should have exactly 2 elemets equal and 1 element unique");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		int t=-1,i,count=0,flag=-1;
		for(i=0;i<size;i++)
		{
			if(i!=0 && a[i]==a[i-1])
			{
				continue;
			}
			for(int j=i+1;j<size;j++){
				if(a[i]==a[j])
				{
					count=1;
					break;
				}
				else
				{
					count=0;
				}
			}
			if(count==0)
			{
				t=i;
				break;
			}
		}
		System.out.println(a[t]);
	}
	
}
