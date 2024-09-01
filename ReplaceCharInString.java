public class ReplaceCharInString {
    static String searchAndReplace (String name , char search, char replace ){
        if( name.length() == 0){
            return "";
        }
        String result = searchAndReplace(name.substring(1), search, replace);
        if(name.charAt(0)==search){
            result = replace + result;
        }
        else{
            result = name.charAt(0) + result;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(searchAndReplace("Hello", 'l', 'w'));
    }
}
