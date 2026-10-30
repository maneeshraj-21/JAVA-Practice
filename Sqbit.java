import java.util.*;
class Sqbit{
public static void main(String[] ab){

Scanner Sc = new Scanner(System.in);
System.out.println("Enter number :");
int n = Sc.nextInt();
int count = 0;

while(n > 0){
if((n&1) == 1){
count++;
}
n = n>>1;
}
if(count == 1){
System.out.println("True");
}else{
System.out.println("False");
}
}
}

