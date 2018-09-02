interface animal
{
void speak();
void eat();
}
class cat implements animal
{
public void speak()
{
System.out.println("inside animal speak");
}
public void eat()
{
System.out.println("inside animal eat");
}
}class dog implements animal
{
public void speak()
{
System.out.println("inside dog speak");
}
public void eat()
{
System.out.println("inside dog eat");
}
}
class ques1
{
public static void main(String args[])
{
animal a= new cat();
a.speak();
a.eat();
}
}