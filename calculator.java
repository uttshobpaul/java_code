import java.util.*;
public class calculator {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter 1st number : ");
    int a=sc.nextInt();
    System.out.print("press '1' for addition \n press '2' for substraction \n press '3' for multiplication \n press '4' for division \n press '5' for modulo \n");
    int x=sc.nextInt();

    System.out.print("enter 2nd number : ");
    int b=sc.nextInt();
    int ans = 0;
        if(1>x || x>5){
        System.out.println("please enter in between 1 to 5 range , thank you");
    }
    else if(x==1){
      ans=a+b;  
    }else if(x==2){
        ans=a-b;
    }else if(x==3){
        ans=a*b;
    }else if (x==4){
        ans=a/b;
    }else{
        ans=a%b;
    }
    System.out.printf("the ans is : %d", ans );
    sc.close();

 }
}
