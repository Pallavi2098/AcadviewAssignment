abstract class animal
{
String color,breed,name;
public void speak()
{
System.out.println("inside animal speak");
}
abstract void eat();
}
class cat extends animal
{
public void eat()
{
System.out.println("inside cat eat");
}
}
class ques2
{
public static void main(String args[])
{
animal a=new cat();
a.speak();
a.eat();
cat b =new cat();
b.speak();
b.eat();
}
}
 