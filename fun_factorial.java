import java.util.*;
public class fun_factorial{
    public static int factorial(int n){
        int value=1;
        for(int i=1;i<=n;i++){
            value=value*i;
        }
        return value;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int a=sc.nextInt();
        if(a<0){
            System.out.print("please enter a valid number 0 to positive infinity.");

        }else if(a<=1){
            System.out.print("the factorial of "+a+" is : "+1);
        }else
        System.out.print("the factorial of "+a+" is : "+factorial(a));
    }
}