public class ArmStrongNumber {
    static int count(int num , int length){
        if(num==0){
            return 0;
        }
        int result = count(num/10, length);
        return result+1;
    }


    //Method 1
    public static void method1(int val, int org, int result, int length){
        if(val==0){
            System.out.println(result==org);
            return;
        }
        int digit = val%10;
        result = result+(int)Math.pow(digit,length);
        method1(val/10, org, result, length);
    }
    //Method 2
    public static boolean method2(int val, int org, int result, int length){
        if(val==0){
            return result == org;
        }
        int digit = val%10;
        result+=(int)Math.pow(digit,length);
        return method2(val/10, org, result, length);
    }
    
    public static void main(String[] args) {
        int num = 370;
        int result = 0;
        int length = 0;
        length = count(num , length);
        method1(num, num, result, length);
        System.out.println(method2(length, num, result, length));
    }
}
