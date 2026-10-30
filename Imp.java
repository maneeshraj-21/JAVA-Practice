import java.util.*;
class Imp{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter Input :");
int x= Sc.nextInt();
int n=x;
int sum=0;
for (;n>0;n/=10){
int digit =n % 10;
if(digit==0)
continue;



if(x%digit==0){
sum=sum+digit;
}

System.out.println(sum);
}
System.out.println("sum="+sum);

}
}