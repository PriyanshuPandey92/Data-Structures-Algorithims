public class StringConsecutiveDuplicates {
    static String RemoveConsecutiveDuplicates(String[] str , int index){
        if(index == str.length){
            return "";
        }
        String result = RemoveConsecutiveDuplicates(str, index+1);
        if(str[index].equals(str[index-1])){
            if(index==1){
                result = str[0]+result ;
            }
            return result;
        }
        result = str[index]+result ;
        if(index==1){
            result = str[0]+result ;
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = RemoveConsecutiveDuplicates(str.split(""), 1);
        System.out.println(ans);
    }
}
