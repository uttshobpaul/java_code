import java.util.*;
public class fun_GCD{

    public static int GCD(int x , int y){
       int reminder=y;
       while(reminder!=0){
        reminder=x%y;
        if(reminder==0)
             return y;
        x=y;    
        y=reminder;
      
       }
       return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enetr two number for calculate the GCD by enter press : ");
        int a=sc.nextInt();
        int b = sc.nextInt();
        System.out.print("the GCD of this two number is : "+GCD(a,b));
    }
}
    