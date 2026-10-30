import java.util.*;
class Hollowsq{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter row :");
int n = Sc.nextInt();
System.out.println("Enter colonm :");
int c = Sc.nextInt();

for(int i = 1; i <= n; i++){
for(int j = 1; j <= c; j++){
if(i==1 || i==n || j==1 || j==c)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
