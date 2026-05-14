import java.util.*;
public class odd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        System.out.print("the sum of all odd number upto n is : ");
        int sum=0;
        for(int i=1; i<=n; i++){
                 if(i%2 != 0)
                     sum=sum+i;
        }
        System.out.print(sum);

    }   
}