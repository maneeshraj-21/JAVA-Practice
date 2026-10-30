import java.util.*;
public class True {
public static void main(String[] ab) {
 int a = 56, c = ++a/3, d = a++/c++, e = (++a*c)/(++c);
 if(((++a&++c)>(++d&e++)) && ((++d&++c)>(++c&a++))){
    System.out.print("++c&d++");
 }
 else{
    System.out.print(a++ & c);
 }

} 
}