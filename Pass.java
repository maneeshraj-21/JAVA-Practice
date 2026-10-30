import java.util.*;
class Pass{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
String password = "qwerty";
String b = "";

do{
System.out.println("Enter password :");
b = Sc.nextLine();
}

while(!b.equals(password));
System.out.println("password correct.");
}
}