public class reverse_string{
    public static void rev(int n, String str){
       if(n<0){
        return;
       }
       System.out.print(str.charAt(n));
       rev(n-1,str);
    }

    public static void main(String[] args){
        String str="paul";
        int n=str.length();
        rev(n-1,str);
    }
}