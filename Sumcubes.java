import java.util.*;
class SumCubes{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter number :");
int n = Sc.nextInt();
int sum = 0;

for(int i = 0; i <= n; i++){
   sum = sum + (i*i*i);
}
System.out.println("Sum of number cubes is : "+sum);

}
}