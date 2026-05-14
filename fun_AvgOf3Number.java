import java.util.*;
public class fun_AvgOf3Number{
    public static void main(String avgs[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number : ");
        int a =sc.nextInt();
         System.out.print("enter 2nd number : ");
        int b=sc.nextInt();
         System.out.print("enter 3rd number : ");
        int c=sc.nextInt();

        System.out.print("the avarage og three number is : "+avg(a,b,c));
    }
    public static float avg(int x,int y,int z){
        return (x+y+z)/3;
    }

}