import java.io.*;
import java.util.*;
class p24
{
public static void main(String arg[])
{
int p=Integer.parseInt(arg[0]);
int sum=0;
while(p!=0)
{
int r=p%10;
sum=sum+r;
p=p/10;
}
System.out.println(" The sum of the digits of :"+Integer.parseInt(arg[0])+" is "+sum);
}
}