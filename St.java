import java.util.Scanner;
public class St{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        String a = Sc.nextLine();
        int len = a.length();
        int sum = 0;
        for(int i=0; i<len; i++){
            sum += a.charAt(i) - 48;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
