
public class SumofDigits {
    // Method 1 (When you don't return, i.e. void , then always use Tail Recusion)
    static void sumofDigits(int num, int sum){
        if(num==0){
            System.out.println(sum);
            return;
        } // // logic
        int digit = num%10;
        sum+=digit;
        num/=10;
        sumofDigits(num, sum);
    }
    // Method 2 (When you return then always use Head recursion)
    static int sumofDigits(int num){
        //Base case
        if(num==0){
            return 0;
        }
        int sum = sumofDigits(num/10);
        return sum+num%10; // logic
    }
    public static void main(String[] args) {
        int num = 123;

        int sum = 0;
        sumofDigits(num, sum);

        System.out.println(sumofDigits(num));
    }
}
