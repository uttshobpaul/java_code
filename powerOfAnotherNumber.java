import java.util.Scanner;

public class powerOfAnotherNumber{
     public static double power(int x,int n){
        int value=1;
        for(int i=1;i<=n;i++){
            value=value*x;
        }
        return value;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enetr the basse number : ");
        int x=sc.nextInt();
        System.out.print("enetr the power number : ");
        int n=sc.nextInt();
        System.out.print("the ans of "+x+"^"+n+"is : "+power(x,n));
    }
   
}