import java.util.*;
public class r{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=sc.nextInt();
        if(n==0) System.out.println(1);
        else if(n==1) System.out.println(1);
        else 
        System.out.println(fact(n));
        // fact(n);
    }
    public static int  fact(int n){
      if(n==1) return 1;  
      return n*fact(n-1);
    }

}