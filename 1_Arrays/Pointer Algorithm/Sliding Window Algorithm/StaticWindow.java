class StaticWindow{
    // Find the maximum Sum of Subarrays of Size 3

    // THIS IS THE GENERAL TEMPLATE FOR STATIC/FIXED WINDOW SLIDING PROBLEMS
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,2,5,8,7,6};
        int k =3;
        
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum+=arr[i];
        }
        int max = sum;
        for(int i = k; i<arr.length; i++){
            sum -= arr[i-k];
            sum += arr[i];
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}