import java.util.*;
public class Subset {
public static void main(String[] args)
{
	int i,j,count=0,flag=0;
	System.out.println("size1:");
	Scanner s=new Scanner(System.in);
	int s1=s.nextInt();
	System.out.println("size2:");
	int s2=s.nextInt();
	int [] a1=new int [s1];
	int [] a2=new int [s2];
	for(i=0;i<s1;i++)
	{
		a1[i]=s.nextInt();
	}
	for(i=0;i<s2;i++)
	{
		a2[i]=s.nextInt();
	}
	for(i=0;i<s1;i++)
	{
		if(i!=0 && a1[i]==a1[i-1])
		{
			continue;
		}
	}
	for(i=0;i<s1;i++)
	{
		count=0;
		if(i!=0 && a1[i]==a1[i-1])
		{
			flag++;
			continue;
		}
		for(j=0;j<s2;j++)
		{
			if(a1[i]==a2[j])
			{
				count++;
			}
			if(count>0)
			{
				flag++;
				break;
			}
		}
	}
	if(flag==s1)
	{
		System.out.println("Array 1 is subset of Array 2");
	}
	else
	{
		System.out.println("Array 1 is not a subset of Array 2");
	}

  }
}
