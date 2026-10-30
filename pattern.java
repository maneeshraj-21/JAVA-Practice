import java.util.*;
class pattern{
public static void main(String[] ab){
Scanner sc = new Scanner(System.in);

System.out.println("Enter number :");
int n = sc.nextInt();

for(int i = 1; i <= n; i++){
for(int j = n; j >= i; j--){
System.out.print("*");
}
System.out.println();
}
}
}