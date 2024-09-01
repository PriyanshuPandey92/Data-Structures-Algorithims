public class ReverseAString{
    static String reverse(String name){
        if(name.length()==0){
            return "";
        }
        String solution = reverse(name.substring(1));
        return solution + name.charAt(0);
    }
    public static void main(String[] args) {
        String name = "Amit";
        System.out.println(reverse(name));
        
    }
}