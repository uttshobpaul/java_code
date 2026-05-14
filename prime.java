import java.util.*;
public class prime {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int n=sc.nextInt();
    int count=0;
    if(n<=1 ){
        System.out.printf(" %d is not a prime number ",n);
    }else if(n>=2){
        for(int i=2; i<=n/2; i++){ // imporement --> (i<=n/2) insted of this we can use --> (i*i<=n)
                if(n%i==0){
                    count++;
                    break;
                }
        }
        if(count !=0){
            System.out.print(" not a prime number ");
        }else{
             System.out.print(" this is a prime number ");
        }
    }

    
    sc.close();
   } 
}
