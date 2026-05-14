import java.util.*;
public class arr_checkOrder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size : ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.print("enter array element : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<size-1;i++){
            if(arr[i]<arr[i+1]) count++;
        }
        if(count==size-1)
            System.out.print("the array is in accending order ");
        else 
            System.out.print("the array is not in a accending order  ");
    }
}