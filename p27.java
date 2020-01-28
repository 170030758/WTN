import java.io.*;
import java.util.*;
import java.lang.*;
class p27
{
public static void main(String args[])
{
int i,j;
if(args.length==0)
System.out.println("An integer number as argument is expected");
else
{
for(i=0;i<Integer.parseInt(args[0]);i++)
{
for(j=0;j<i;j++)
System.out.print("*");
System.out.println();
}
}
}
}