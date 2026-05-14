import java.util.*;
public class recursion{
// print 5 to 1 (using recursion ) 

    // public static void main(String args[]) {
    //     print(5);
    // }
    // public static void print(int n){
    //     if(n==0) 
    //         return;
    //     System.out.println(n);
    //     print(n-1);
    //     System.out.println("recursion no : "+n);
    // }

//print 1 to 5 (usiing recursion )

//  public static void main(String args[]) {
//         print(1);
//     }
//     public static void print(int n){
//         if(n==6) 
//             return;
//         System.out.println(n);
//         print(n+1);
//         System.out.println("recursion no : "+n);
//     }

//print 1 to n natural number sum 

// public static void print(int st, int end, int sum){
//     if(st == end){
//         sum=sum+st;
//         System.out.println("total sum : "+sum);
//         return;
//     }
//     sum=sum+st;
//     print(st+1 , end, sum);
// }
//     public static void main(String[] args) {
//     print(1,3,0);
// }


//print (x^n) stack hight = n 

//  public static int cal(int x, int n){
//     if(x==0){ //base case 1
//         return 0;
//     }
//     if(n==0){ //base case 2
//         return 1;
//     }
//     int npownm1=cal(x,n-1);
//     int xpown= x * npownm1;
//     return xpown;
//  }
//  public static void main(String[] args){
//     int x=2,n=0;
//     int ans=cal(x,n);
//     System.out.println("the ans of "+x+"^"+n+" is "+ans);
//  }

 
//print (x^n) stack hight = log n 

 public static int cal(int x, int n){
    if(x==0){ //base case 1
        return 0;
    }
    if(n==0){ //base case 2
        return 1;
    }
    if(n%2 ==0 ){ //if power n is even --> x^(n/2) * x^(n/2) 
        return cal(x,n/2) * cal(x,n/2);
    }else{//if power is odd --> x^(n/2) * x^(n/2) * x
         return cal(x,n/2) * cal(x,n/2) *x;
    }
        
 }
 public static void main(String[] args){
    int x=2,n=5;
    int ans=cal(x,n);
    System.out.println("the ans of "+x+"^"+n+" is "+ans);
 }
}