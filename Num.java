import java.util.*;
public class Num{
public static void main(String[] args){
int a = 1058;
int b = 2852;
int c = 3981;

a = a%10;
b = b%10;
c = c%10;

if(a>b && a>c){
System.out.print("a is largest!");
}
else if(b>a && b>c){
System.out.print("b is largest!");
}
else{
System.out.print("c is largest!");
}

}
}