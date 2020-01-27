import java.io.*;
import java.util.*;
class p23
{
public static void main(String arg[])
{
int temp=Integer.parseInt(arg[0]);
int p=Integer.parseInt(arg[0]);
int sum=0;
while(p!=0)
{
int r=p%10;
sum=(sum*10)+r;
p=p/10;
}
if(temp==sum)
System.out.println(Integer.parseInt(arg[0])+" is a palindrome");
else
System.out.println(Integer.parseInt(arg[0])+" is not a palindrome");
}
}