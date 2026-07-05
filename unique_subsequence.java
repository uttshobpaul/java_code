import java.util.HashSet;

public class unique_subsequence{
     public static void subsequence(String str ,int n, String newString , HashSet<String> set){
        if(n==str.length()){
            if(set.contains(newString))
                return;
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        //to be
        subsequence(str, n+1, newString+str.charAt(n) , set);

        //not to be
        subsequence(str, n+1, newString , set);
    }

    public static void main(String[] args){
        String str ="aaaaaaaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str  , 0, "" , set);
    }
}