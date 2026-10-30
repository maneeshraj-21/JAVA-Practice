import java.util.*;
class Fact {
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter number : ");
int n = Sc.nextInt();
int sum = 1;

for(int i = 1; i <= n; i++){
 sum = sum * i;
}
System.out.println("Factorial is :"+sum);

}
}
