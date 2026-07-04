public class subsequence{
    public static void subsequence(String str ,int n, String newString){
        if(n==str.length()){
            System.out.println(newString);
            return;
        }
        //to be
        subsequence(str, n+1, newString+str.charAt(n));

        //not to be
        subsequence(str, n+1, newString);
    }

    public static void main(String[] args){
        String str ="abc";
        subsequence(str  , 0, "");
    }
}