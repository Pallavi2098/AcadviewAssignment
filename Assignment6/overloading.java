class over
{
public void display(String a)
{
System.out.print(a);
}
public void display(int a)
{
System.out.print("integer no.: "+a);
}
public void display(float a)
{
System.out.print("float no.: "+a);
}
}
class overloading
{
public static void main(String args[])
{
over o=new over();
o.display(null);
o.display(12);
o.display(12.45f);
}
}