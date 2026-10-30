import java.util.*;
class Count{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter number :");
int count = 0;
int n;
while(true){
n = Sc.nextInt();
count++;
if(n%2 != 0){
break;
}
}
System.out.println(count);

}
}