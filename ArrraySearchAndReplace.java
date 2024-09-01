
public class ArrraySearchAndReplace {
    static int[] SearchAndReplace(int[] arr, int index, int searchVal, int replaceVal){
        if(index == arr.length){
            int [] faltu = new int[arr.length];
            return faltu;
        }
        int [] result = SearchAndReplace(arr, index+1, searchVal, replaceVal);
        if(arr[index]==searchVal){
            result[index] = replaceVal;
        }
        else{
            result[index] = arr[index];
        }
        return result; 
    }
    public static void main(String[] args) {
        int[] arr = {10,20,50,40,50};
        int[] ans = SearchAndReplace(arr, 0, 50, 100);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
