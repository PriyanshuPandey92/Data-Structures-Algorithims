public class DynamicWindow {
    // Print the length of longest substring whose sum of values is less than or equal to "target"

    // THIS IS THE GENERAL TEMPLATE FOR DYNAMIC WINDOW SLIDING PROBLEMS
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 7;
        int max = 0;
        int sum = 0;
        int left= 0;
        for(int right = 0; right<arr.length; right++){
            sum = sum + arr[right];
            // while Window is Invalid
            while(sum>target){ 
                sum = sum - arr[left];
                left++;
            }
            // while Window is Valid
            int subArrayLen = right - left + 1;
            max = Math.max(max, subArrayLen);
        }
        System.out.println(max);
    }
}