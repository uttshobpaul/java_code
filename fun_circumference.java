import java.util.*;
public class fun_circumference{
    public static double circumference(int n){
        return (2*3.14*n);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius : ");
        int n=sc.nextInt();
        System.out.print("the circumference of the circle is :"+circumference(n));
    }
    
}