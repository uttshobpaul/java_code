import java.util.*;
public class count{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pos=0;
        int neg=0;
        int zero=0;
        int i;
        // System.out.print("if want enter number then enter '1' || if you want to exit enter '0' ");
        // int i=sc.nextInt();
        do{
            System.out.print("enetr the/a number : ");
            int n=sc.nextInt();
            if(n<0)
                neg++;
            else if(n==0)
                zero++;
            else
                pos++;  
            System.out.print("if want enter number then enter '1' || if you want to exit enter '0' : ");
            i=sc.nextInt();
        }while(i==1);

        System.out.print("total positive number is : "+pos+"\ntotal negative number is : "+neg+"\ntotal zero is enter : "+zero);
    }
    
}