import java.util.*;
public class arr_max_min{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size : ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.print("enter array element : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        System.out.print("the max and min from the array is : ");
        for(int i=0; i<size; i++){
            if(arr[i]>b) b=arr[i];
            if(arr[i]<a) a=arr[i];
        }
        System.out.print(b+" &  "+a);
    }
}