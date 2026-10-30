import java.util.*;
class Checkprime{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter number :");
int n = Sc.nextInt();
System.out.println(checkPrime(n));
}

public static boolean checkPrime(int a){
if(a==1)
return false;
for(int i = 2; i < a; i++){
if(a%i==0)
return false;
}
return true;

}
}