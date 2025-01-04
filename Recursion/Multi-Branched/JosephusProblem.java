public class JosephusProblem {
    static int IndexOfWhoWillLive(int n, int k){        
        if(n==1){
            return 0;
        }
        return (IndexOfWhoWillLive(n-1,k) + k ) % n;
    }
    public static void main(String[] args) {
        int n = 6;
        int k = 5;
        int ans = IndexOfWhoWillLive(n, k)+1;
        System.out.println(ans);  
    }
} 
