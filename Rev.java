import java.util.*;
class Rev{
public static void main(String[] mv){
Scanner Sc = new Scanner(System.in);
System.out.println("input:");
int a = Sc.nextInt();
int rev=0;
for(;a>0;a/=10){
int p=a%10;
rev=rev*10+p;
}
System.out.println(rev);

}
}
