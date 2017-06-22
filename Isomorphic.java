import java.util.*;
public class Isomorphic {
public static void main(String[] args)
{
	int flag=0,i,j,k;
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	int l1=s1.length();
	int l2=s2.length();
	if (l1==l2)
	{
		for(i=0;i<l1;i++)
		{
			for(k=0;k<l1;k++)
			{
				if(s1.charAt(i)==s1.charAt(k))
				{
					if(s2.charAt(i)==s2.charAt(k))
					{
						break;
					}
					else
						flag=1;
				}
			}
		}
		if(flag!=1)
		{
			System.out.print("They are Isometric Strings");
		}
		else
		{
			System.out.print("They are not Isometric Strings");
		}
	}
	else
	{
		System.out.print("They are not Isometric Strings");
	}
	}
}
