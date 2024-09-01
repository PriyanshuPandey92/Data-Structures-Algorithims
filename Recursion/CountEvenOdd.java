
public class CountEvenOdd {
    //Method 1
    static void countEO(int range , int val, int result[]){
        //result[0] = Even Count
        //result[1] = Odd count
        if(range==val){
            System.out.println("Even : "+result[0]);
            System.out.println("Odd : "+result[1]);
            return;
        }
        if(range%2==0){
            result[0]++;
        }else{
            result[1]++;
        }
        countEO(range-1, val, result);
    }

    //Method 2
    static int[] countEO(int range){
        if(range == 0){
            int arr[] = new int[2];
            return arr;
        }
        int result[] = countEO(range-1);
        if(range%2==0){
            result[0]++;
        }
        else{
            result[1]++;
        }
        return result;
    }
    public static void main(String[] args) {
        // int[] count = new int[2];
        // countEO(100, 1, count);
        int arr[] = countEO(100);
        System.out.println("Even: "+arr[0]);
        System.out.println("Odd: "+arr[1]);
    }
}
