import java.util.*;
class Sd{
public static void main(String[] mr){
Scanner cd=new Scanner(System.in);
int a=cd.nextInt();
int count=0;
for(; a>0;a=a/10){
count++;
}
System.out.println(count);
}
}