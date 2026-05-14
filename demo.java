import java.util.*;
public class demo{
/**
 * @param args
 */
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

// //LECTURE-13 (20.03.2026)
//     StringBuilder sb=new StringBuilder("abcdefgh");

//     System.out.print(sb.charAt(0));
//     sb.setCharAt(0,'b');
//     System.out.print(sb);

    // sb.insert(1,'l');
    // System.out.print(sb);   
 
    // sb.delete(1,6);
    // System.out.print(sb);

    // sb.append("a");
    // sb.append("b");
    // sb.append("c");
    // sb.append("d");
    // System.out.print(sb.length());

//     for(int i=0;i<sb.length()/2; i++){
//         int front=i;
//         int back=sb.length()-1-i;

//         char fchar=sb.charAt(front);
//         char bchar=sb.charAt(back);

//         sb.setCharAt(front, bchar);
//         sb.setCharAt(back, fchar);

//     }
//     System.out.print(sb);

//LECTURE-14 (21.03.2026)
// int a=5;
// int b=a--;
// System.out.print(b+"  \n "+a);

//lecture-15 (22.03.2026)
// int n=5;
// int pos=1;
// int bitMask=1<<pos;

// int newNumber= n |  bitMask;
// System.out.print(newNumber);


// int n=5;
// int pos=2;
// int bitmask=1<<pos;

// int newnumber=n &  ~bitmask;
// System.out.print(newnumber);
// System.out.print("enter n : ");
// int n=sc.nextInt();
// System.out.print("entre position : ");
// int pos=sc.nextInt();
// int bitmask=1<<pos;
// System.out.print("enter update value '0' or '1' : ");
// int a=sc.nextInt();
// if(a==1){
//     int newnumber=n | bitmask;
//     System.out.print(newnumber);

// }else{
//     int newnumber=n & ~bitmask;
//     System.out.print(newnumber);

//lecture-16 (23.03.2026)

//bubble sort
// int[] arr={7,8,3,1};

// for(int i=4; i>1; i--){
//     for(int j=0; j<i-1; j++){
//         if(arr[j]>arr[j+1]){
//             int c=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=c;
//         }
//     }
// }
// for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i] +" ");
// }

//selectio sort
// int arr[]={7,8,3,1};

// for(int i=0; i<arr.length-1; i++){
//     for(int j=i+1; j<arr.length; j++){
//         if(arr[i]>arr[j]){
//             int c=arr[i];
//             arr[i]=arr[j];
//             arr[j]=c;
//         }
//     }
// }
// for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i]);
// }

// int arr[]={7,8,3,1,2};
// int j;
// for(int i =1; i<arr.length; i++){
//     int c=arr[i];
//     for(j=(i-1) ; j>=0 ; j--){
//         if(arr[j]>c){
//             arr[j+1]=arr[j];
//         }else{
//            break;
//         }
//     }
//     arr[j+1]=c;
// }
// for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i]);
// }
    }
}