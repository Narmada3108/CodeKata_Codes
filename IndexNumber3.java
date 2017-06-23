import java.util.*;
public class IndexNumber3 {
	public static void main(String[] args)
	{
		System.out.println("size:");
		Scanner s=new Scanner(System.in);
		int s1=s.nextInt();
		int i,j,con1=0;
		int a1 []=new int [s1];
		for(i=0;i<s1;i++)
		{
			a1[i]=s.nextInt();
		}
		int Array1notunique=0;
		for(i=0;i<s1;i++){
		for(j=i+1;j<s1;j++)
		{
			if(a1[i]==a1[j])
			{
				Array1notunique++;
			}
		}	}
		if(s1==(s1-Array1notunique))
		{
			con1=1;
		}
		int x=0,con2=0;
		for(i=0;i<s1-1;i++)
		{
			if(a1[i]<a1[i+1])
			{
				x++;
			}
		}
		if(x==s1-1)
		{
			con2=1;
		}int y=0;
		int same_array[]=new int [100];
		if(con1==1&&con2==1)
		{

			for(i=0;i<s1;i++)
			{
				if(a1[i]==i)
				{
					same_array[y]=a1[i];
				 	y++;
				 	
				}
			}
			if(y>0){
			for(i=0;i<y;i++)
			{
				System.out.print(same_array[i]+" ");
			}}
			else
			{
				System.out.println("Index and number in the index is not same for any of the elements");
			}
		}
		else
			System.out.println("Array values must be unique and it must be in increasing order");
	}

}
