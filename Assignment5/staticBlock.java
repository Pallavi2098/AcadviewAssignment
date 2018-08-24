class staticBlock
{
static int num;
static String mystr;
static{
num = 97;
mystr = "Static keyword in Java";
}
public static void main(String args[])
{
System.out.println("value of num: "+num);
System.out.println("value of mystr: "+mystr);
}
}