import java.util.*;
public class fun_sum_of_two_number{

    public static int printSum(int x, int y){
        int c=x+y;
        return c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // printSum(a,b);
        System.out.print(printSum(a,b));
    }
}