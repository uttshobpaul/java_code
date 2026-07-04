public class add_x_last{
    public static void last(String str, int n , int count , String newString){
        if(n>=str.length()){
            for(int i=1; i<=count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(n) == 'x'){
            count++;
            last(str,n+1,count,newString);
        }else{
            newString += str.charAt(n);
            last(str, n+1, count , newString);

        }
    }

    public static void main(String[] args){
        String str = "axaxax";
        last(str, 0, 0, "");

    }
}