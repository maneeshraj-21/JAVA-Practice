import java.util.*;
public class Stbig {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        String a = Sc.nextLine();
        String b = Sc.nextLine();
        int x = 0;
        int y = 0;
        for(int i=0; i<a.length(); i++){
            x = x * 10 + (a.charAt(i) - 48);

        }
        for(int j=0; j<b.length(); j++){
            y = y * 10 + (b.charAt(j) - 48);
        }
        if(x>y)
            System.out.println("The first number is bigger.");
        else if(x<y)
            System.out.println("The second number is bigger.");
        else
            System.out.println("Both numbers are equal.");


}
}
