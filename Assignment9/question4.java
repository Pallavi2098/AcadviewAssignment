import java.util.*;
class question4{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter a String : ");
String s1=s.nextLine();
System.out.print("Enter a String to Check its Occurrence in previous String : ");
String s2=s.nextLine();
if(s1.contains(s2)==true){
System.out.println("String2 contains in String1");
}
else{
System.out.println("String2 doesn't contain in String1");
}
}
}