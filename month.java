import java.util.*;
public class month {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the month number 1-12 : ");
        int a = sc.nextInt();
        if(a==1){
            System.out.println("its janaury ");
        }else if(a==2){
            System.out.println("its february ");
        }else if(a==3){
            System.out.println("its maarch ");
        }else if(a==4){
            System.out.println("its april ");
        }else if(a==5){
            System.out.println("its may ");
        }else if(a==6){
            System.out.println("its june ");
        }else if(a==7){
            System.out.println("its july ");
        }else if(a==8){
            System.out.println("its august ");
        }else if(a==9){
            System.out.println("its september ");
        }else if(a==10){
            System.out.println("its october ");
        }else if(a==11){
            System.out.println("its november ");
        }else if(a==12){
            System.out.println("its december ");
        }else{
            System.out.print("please enter in the rage of 1 to 12 . thank you");
        }
        sc.close();

    }
    
}
