import java.util.*;
class Butterfly{
public static void main(String[] ab){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number :");
int n = sc.nextInt();

//upper half
for(int i = 0; i <= n; i++){
//1st part
for(int j = 0; j <= i; j++){
System.out.print("*");
}
//spaces
int spaces = 2*(n-i);
for(int j = 0; j <= spaces; j++){
System.out.print(" ");
}
//2nd part
for(int j = 0; j <= i; j++){
System.out.print("*");
}
System.out.println();
}

//lower half
for(int i = n; i >= 0; i--){
//1st part
for(int j = 0; j <= i; j++){
System.out.print("*");
}
//spaces
int spaces = 2*(n-i);
for(int j = 0; j <= spaces; j++){
System.out.print(" ");
}
//2nd part
for(int j = 0; j <= i; j++){
System.out.print("*");
}
System.out.println();
}
}
}