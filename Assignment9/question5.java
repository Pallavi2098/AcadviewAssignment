import java.util.*;
class question5{
public static void main(String[] args) {
int i=0,count=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter A String : ");
String s=sc.nextLine();
while(i<s.length()){
if(s.charAt(i)==' '){
count++;
}
i++;
}
count=count+1;
System.out.println("Total words present in string are: "+count);
}
}