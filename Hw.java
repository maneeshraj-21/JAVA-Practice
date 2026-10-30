import java.util.*;
class Hw{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("input : ");
String str = Sc.nextLine();

int uppercase = 0;
int lowercase = 0;
int digits = 0;
int others = 0;

for(int i = 0; i < str.length(); i++){
char ch = str.charAt(i);

if(Character.isUpperCase(ch)){
uppercase++;
}

else if(Character.isLowerCase(ch)){
lowercase++;
}

else if(Character.isDigit(ch)){
digits++;
}

else{
others++;
}

}

System.out.println("Uppercase :"+uppercase);
System.out.println("Lowercase :"+lowercase);
System.out.println("digits :"+digits);
System.out.println("others :"+others);

}
}
