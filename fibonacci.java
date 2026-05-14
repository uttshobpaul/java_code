import java.util.*;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print("the fibonacci seris is ");
        if(n==0){
            System.out.print(a);
            return;
        }else if(n==1){
            System.out.print(a+" "+b);
            return;
        }else {
            System.out.print(a+" "+b);
            for(int i=1;i<=(n-1); i++){
                int sum=a+b;
                a=b;
                b=sum;
                System.out.print(" "+sum);

            }

        }
       
        
    }
}