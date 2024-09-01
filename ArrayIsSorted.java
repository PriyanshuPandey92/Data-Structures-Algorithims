public class ArrayIsSorted {

    static boolean isSorted(int arr[], int index){
        //base case
        if(index == arr.length-1){
            return true;
        }
        //logic
        if(arr[index]<arr[index-1]){
            return false;
        }
        return isSorted(arr, index+1);
    }


    public static void main(String[] args) {
        int [] arr = {10,20,90,40,20};
        System.out.println(isSorted(arr,1)?"Sorted":"Not Sorted");
    }
}
