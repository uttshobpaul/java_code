import java.util.*;
public class table_of_a_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number , which you want to print the table : ");
        int a = sc.nextInt();
        for(int i=1; i<=10 ; i++){
            int b= a*i;
            // System.out.print(a); System.out.print(" * "); System.out.print(i);System.out.print(" = ");System.out.println(b);
                System.out.printf(" %d * %d = %d",a,i,b);
                            System.out.println();
        }
            sc.close();

    } 
}
