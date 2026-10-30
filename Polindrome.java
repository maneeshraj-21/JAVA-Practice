import java.util.*;
class Polindrome{
public static void main(String[] mv){
Scanner Sc = new Scanner(System.in);
System.out.println("input:");
int a = Sc.nextInt();
int org=a;
int rev=0;
for(;a>0;a/=10){
int p=a%10;
rev=rev*10+p;
}
if(org==rev){
System.out.print("palindrom");
}
else
{
System.out.print("not a palindrome");
}
}
}
