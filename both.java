/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			String s;
		int letter=0;
		int number=0;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if((a[i]>'A'&&a[i]<'Z')||(a[i]>'a'&&a[i]<'z'))
			{
				letter=1;
			}
			else if(a[i]>'0'&&a[i]<'9')
			{
				number=1;
			}
		}
		int sum=letter+number;
		if(sum==2)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}// your code goes here
// your code goes here
	}
}
