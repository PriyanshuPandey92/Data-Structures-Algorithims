
public class NumberToString {
    static String numbers [] = {"zero", "one" ,"two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String numToString(int num){
        if(num==0){
            return "";
        }
        String str = numToString(num/10);
        return str + numbers[num%10] + " ";
    }
    public static void main(String[] args) {
        System.out.println(numToString(436)); // four three six 
    }    
}
