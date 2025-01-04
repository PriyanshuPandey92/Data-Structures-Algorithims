public class StairCase {
    static int climbStairs(int n) {
        if(n<=1){
            return 1;
        }
        int result1 = climbStairs(n-1);
        int result2 = climbStairs(n-2);
        return result1 + result2;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
