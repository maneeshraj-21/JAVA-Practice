import java.util.*;
class Continuous{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter string :");
String a = Sc.nextLine();
int max = 1;
int count = 1;

for(int i = 1; i < a.length(); i++){
if(a.charAt(i) == a.charAt(i-1)){
count++;
}
else{
count = 1;
}
if(count > max){
max = count;
}
}
System.out.println(max);
}
}


