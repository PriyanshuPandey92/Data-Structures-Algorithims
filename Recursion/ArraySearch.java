
public class ArraySearch {
    static boolean isFound(int arr[], int index, int searchVal){
        //base case
        if(index == arr.length){
            return false;
        }
        //compare
        if(arr[index]==searchVal){
            return true;
        }
        return isFound(arr, index+1, searchVal);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,80,1,2,5};
        System.out.println(isFound(arr, 0, 90)?"Found":"Not Found");
    }
}
