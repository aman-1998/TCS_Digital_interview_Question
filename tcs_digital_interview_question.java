import java.util.*;
import java.lang.*;

class digital_question
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no. of inputs: ");
		n=in.nextInt();
		int[] a=new int[n];
		String[] s=new String[n];
		String temp;
		for(i=0;i<=n-1;i++)
		{
			System.out.print("Enter "+(i+1)+" input: ");
			a[i]=in.nextInt();
			s[i]=String.valueOf(a[i]);
		}
		for(i=0;i<=n-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				if(j!=i)
				{
					if(s[i].length()>s[j].length())
						break;
					else
					{
						temp=s[j].substring(0,s[i].length());
						if(temp.equals(s[i])==true)
						{
							System.out.println("NO");
							System.exit(0);
						}
					}
				}
			}
		}
		System.out.println("YES");
	}
}