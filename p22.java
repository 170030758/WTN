import java.io.*;
import java.util.*;
class p22
{
	public static void main(String arg[])
	{
		int i,c=0;
	        	if(arg.length==0)
			System.out.println("An integer number as argument is expected");
		else
		{
			for(i=2;i<Integer.parseInt(arg[0]);i++)
			{
				if(Integer.parseInt(arg[0])%i==0)
				c++;	
			}
			if(Integer.parseInt(arg[0])==1 || Integer.parseInt(arg[0])==0)
			System.out.println(Integer.parseInt(arg[0])+" is neither prime nor composite");	
			else{	
			if(c==0)
			System.out.println(Integer.parseInt(arg[0])+" is a prime number");
			else
			System.out.println(Integer.parseInt(arg[0])+" is not a prime number");
			}
		}
		System.exit(0);
	}
}
