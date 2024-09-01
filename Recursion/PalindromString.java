
public class PalindromString {
    static boolean palindrom(String name){
        if(name.charAt(0)!=name.charAt(name.length()-1)){
            return false;
        }
        boolean result =  palindrom(name.substring(1, name.length()));
        result =  name.charAt(0)==name.charAt(name.length()-1);
        return result;
    }

    public static void main(String[] args) {
        String name = "MADAM";
        System.out.println(palindrom(name));
    }
    
}
