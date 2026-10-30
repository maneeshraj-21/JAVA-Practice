import java.util.*;
class Dtob{
public static void decimalToBinary(int n){
if(n==0){
System.out.println(0);
return;
}
while(n>0){
System.out.println(n%2);
n/=2;
}
return;
}

public static void main(String[] ab){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number :");
int n = sc.nextInt();
decimalToBinary(n);
}
}

