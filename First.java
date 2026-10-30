import java.util.*;
public class First{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.print("enter first num : ");
int a = Sc.nextInt();
System.out.print("enter second num : ");
int b = Sc.nextInt();
System.out.print("enter third num : ");
int c = Sc.nextInt();

if(a>b && a>c){
if(b>c){
System.out.print("a,b,c");
}
else{
System.out.print("a,c,b");
}
}

else if(b>a && b>c){
if(c>a){
System.out.print("b,c,a");
}
else{
System.out.print("b,a,c");
}
}

else{
if(a>b){
System.out.print("c,a,b");
}

else{
System.out.print("c,b,a");
}
}

}}