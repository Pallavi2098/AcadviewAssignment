import java.util.*;
class question2{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
  String s1=s.next();
  int i=0;
  while( i<s1.length()) {
   System.out.println(s1.charAt(i));
   i++;
}
for(i=0;i<s1.length();i++)
{
  for(int j=0;j<s1.length();j++) 
  {
    System.out.print(s1.charAt(i));
     System.out.println(s1.charAt(j));
  }
}
System.out.println(s1.substring(0,s1.length()));
}
}