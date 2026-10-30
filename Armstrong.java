import java.util.*;
public class Armstrong{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("input:");
int a = Sc.nextInt();
int copy = a;
int arm = 0;
int count = 0;
for( ; a>0; a /= 10){
count = a%10;
arm += count * count * count;

}

if(arm == copy)
System.out.println("Armstrong number!");
else
System.out.println("Not Armstrong number!");
}
}