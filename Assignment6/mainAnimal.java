class animal
{
public int breed;
public int color;
public void speak()
{
System.out.println("languages");
}
}
class Dog extends animal
{
public void speak()
{
System.out.println("bhow");
}
}
class Cat extends animal
{
public void speak()
{
System.out.println("meow");
}
}
class mainAnimal
{
public static void main(String args[])
{
animal a=new animal();
a.speak();
a=new Dog();
a.speak();
a=new Cat();
a.speak();
}
}
