import java.util.*;
class question3{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter the String : ");
String str1 =s.next();
String str2 = str1.replaceAll("[aeiouAEIOU]", "");
System.out.println(str2);
}
}