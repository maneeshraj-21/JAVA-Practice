import java.util.*;
class Abc{
public static void main(String[] ab){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter number :");
int a = Sc.nextInt();
int temp = 0;
int even = 0;
int odd = 0;
while(a != 0){
temp = a%10;
if(temp%2 == 0)
even++;

else
odd++;
a = a/10;
}

System.out.println(even);
System.out.println(odd);

}
}
