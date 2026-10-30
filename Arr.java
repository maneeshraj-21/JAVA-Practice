import java.util.*;
public class Arr{
    public static void main(String [] args){
    int arr[] ={12,35,1,10,34,1,56,23,45,67,89,90,100};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }
        System.out.println(second);
}
}
