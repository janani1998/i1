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
		int a=in.nextInt();
		int d=in.nextInt();
		int n=in.nextInt();
		System.out.print(n/2*(2*a+(n-1)*d));
	}
}
