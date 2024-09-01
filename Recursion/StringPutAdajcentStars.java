public class StringPutAdajcentStars {
    static String PutAdajcentStars( String[] str, int index){
        if(index== str.length){
            return "";
        }
        String result = PutAdajcentStars(str, index+1);
        if(str[index].charAt(0)==str[index-1].charAt(0)){
            if(result == ""){
                result = str[index-1]+"*"+str[index]+ result;
            }
            else{
                result = str[index-1]+"*"+ result;
            }
               
        }else{
            if(result == ""){
                result = str[index-1]+str[index]+result;
            }
            else{
                result = str[index-1]+result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "AABBBA";
        String ans = PutAdajcentStars(str.split(""), 1);
        System.out.println(ans);
        
    }
}
