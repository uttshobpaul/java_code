import java.util.*;
public class arr_names{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String names[]=new String[n];

        for(int i=0;i<n;i++){
            System.out.print("enter names : ");
            names[i]=sc.next();
        }

         System.out.print("entered names is : ");

        for(int i=0;i<n;i++){
           System.out.print(names[i]+" ");
           
        }

    }
}