import java.util.*;
public class Year{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.print("Enter year : ");
int y = Sc.nextInt();

if((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)){
System.out.print("y is Leapyear : ");
}
else{
System.out.print("y is not Leapyear!");
}

}
} 