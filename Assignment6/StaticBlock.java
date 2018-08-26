class StaticBlock
{
static int num;
static String str;
static
{
System.out.println("block1");
num=12;
str="block1";
}
static
{
System.out.println("block2");
num=16;
str="block2";
}
public static void main(String args[])
{
System.out.println("num " +num);
System.out.println("string " +str);
}
}
