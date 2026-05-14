import java.util.*;
public class radius_area {
   public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the radius of circel");
    double r=sc.nextInt();
    double ans=(3.14)*(r*r);
    System.out.print("the area of the give radius is : ");
    System.out.print(ans);
   sc.close();

}
}
