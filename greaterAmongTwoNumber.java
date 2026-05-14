import java.util.Scanner;

public class greaterAmongTwoNumber{
     public static double greater(int x,int n){
        if(x>n)
            return x;
        else 
            return n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)  System.out.println("both number is same : "+a);
        else  System.out.print("greater among two number is : "+greater(a,b));
    }    
   
}