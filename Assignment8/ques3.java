import java.lang.NumberFormatException;
import java.util.Scanner;
class ques3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String p,q;
int a,b;
System.out.println("enter two numbers");
p=s.next();
q=s.next();
a=Integer.parseInt(p);
b=Integer.parseInt(q);
if(a>b)
System.out.println(a+" is greatest");
else
System.out.println(b+" is greatest");
}
}