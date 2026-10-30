import java.util.*;
public class Sum1{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("input:");
int a = Sc.nextInt();
int sum=0;
for(;a>0;a/=10){
int p=a%10;
sum=sum+p;
}
System.out.println(sum);

}
}
