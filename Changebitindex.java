import java.util.*;
class Changebitindex{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter number :");
int n = Sc.nextInt();
int a;
a = 1<<2;
n = n^a;
System.out.println(n);
}
}