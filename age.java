import java.util.*;
public class age{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age : ");
        int n=sc.nextInt();
        if(n>=18)
            System.out.print("eligible for vote ");
        else
            System.out.print(" not eligible for vote ");

    }
    
}