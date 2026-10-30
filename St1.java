import java.util.*;
class St1{
public static void main(String[] ab){
String a = "185469";
int add = 0;
int multi = 1;
int i = 0;
int j = a.length()-1;
while(i < j){
int x = a.charAt(i)-48;
int y = a.charAt(j)-48;
add += x;
multi *= y;
i++;
j--;
}
System.out.println(add);
System.out.println(multi);


}
}