import java.util.*;
public class sum{
public static void main(String[] args){
Scanner bd = new Scanner(System.in);
System.out.println("Enter the first number:");
int a= bd.nextInt();
System.out.println("Enter the Second number:");
int b= bd.nextInt();
System.out.println("Enter the third number:");
int c= bd.nextInt();

if(a>b && a>c){if(b>c){
System.out.println("Largest number is a:\nMid  no is b\n Smllest no is c ");
}
}
else if(b>a&& b>c){
System.out.print("largest no is b");
}
else{
System.out.println("Largest no is c");
}

}
}