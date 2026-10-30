import java.util.*;
public class hello{
public static void main(String[] ab){
Scanner bd = new Scanner(System.in);
System.out.println("Enter the first number:");
int a= bd.nextInt();
System.out.println("Enter the Second number:");
int b= bd.nextInt();

if(a>b){
System.out.println("Largest number is : "+a);
}

else{
System.out.println("Largest number is : "+b);
}

}
}