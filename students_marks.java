import java.util.Scanner;

public class students_marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int a=-1;
        do{
        System.out.println("enter '1' for input marks  OR enter '0' for stop :");
         a=sc.nextInt();
         if(a==0) break;
        System.out.println("enter subject number between (0-100):");
        int marks=sc.nextInt();
        if(marks >= 90){
            System.out.println(" this is good ");
        }else if(89 >= marks && marks >= 60){
            System.out.println("this is good as well ");
        }else{
            System.out.println("this is good as well beacuse marks dont matter efforts matter ");
        }
        
        }
        while(a==1);
          

        
     sc.close();   
    }
       
}
