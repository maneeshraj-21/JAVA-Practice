import java.util.*;
class Diamond{
public static void main(String[] ab){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number :");
int n = sc.nextInt();

for(int i = 1; i <= n; i++){
for(int j = 1; j <= n-i; j++){
System.out.print(" ");
}
for(int k = 1; k <= 2*i-1; k++){
if(k==1 || k==2*i-1){
System.out.print("*");
}else{System.out.print(" ");
}
}
System.out.println();
}

for(int i = n-1; i >=1; i--){
for(int j = 1; j <= n-i; j++){
System.out.print(" ");
}
for(int k = 1; k <= 2*i-1; k++){
if(k==1 || k==2*i-1){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();

}
}
}