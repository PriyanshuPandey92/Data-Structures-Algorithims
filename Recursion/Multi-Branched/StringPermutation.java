public class StringPermutation {
    static void permutation(String str, String result){
        if(str.length()==0){
            System.out.print(result+",");
            return ;
        }
        permutation(str.substring(1), result); //not take it
        permutation(str.substring(1), result+str.charAt(0)); // take it 
    }
    public static void main(String[] args) {
        permutation("ABC", "");
    }
}
