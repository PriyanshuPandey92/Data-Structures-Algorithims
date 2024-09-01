
public class Palindrom {
    // Method 1
    static void palindrom(int org, int val , int result){
        if(val == 0){
            System.out.println(org == result);
            return ;
        }
        int digit = val%10;
        result = (result*10)+digit;
        palindrom(org, val/10, result);
    }

    // Method 2
    static boolean palindrom2(int org, int val , int result){
        if(val == 0){
            return org == result;
        }
        int digit = val%10;
        result = (result*10)+digit;
        return palindrom2(org, val/10, result); 
    }

    public static void main(String[] args) {
        int num = 2212122;
        int result = 0;
        palindrom(num ,num, result);
        System.out.println(palindrom2(num, num, result)?"Palindrom":"Not a Palindrom");
    }
}
