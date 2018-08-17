/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0,temp=0;
		while(n!=0){
			a=n%10;
			n=n/10;
			temp=(temp*10)+a;
		}
		System.out.print(temp);
	}
}
