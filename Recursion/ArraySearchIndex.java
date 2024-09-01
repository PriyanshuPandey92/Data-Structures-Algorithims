
import java.util.Arrays;

public class ArraySearchIndex {
   
    //(Creating a new array every time we get searchval and merging it with returning array)
    static int[] findAll(int arr[], int index, int searchVal){
        if(index == arr.length){
            int[] faltu = {};
            return faltu;
        }
        int [] result = findAll(arr, index+1, searchVal);
        if(arr[index]==searchVal){
            int[] extra = {index};
            int [] merged = new int[result.length + 1];
            System.arraycopy(extra, 0, merged , 0, 1);
            System.arraycopy(result, 0, merged , 1, result.length);
            return merged;
        }
        else{
            return result;
        }
    }


    public static void main(String[] args) {
        int arr[] = {10,20,50,90,100,50};
        int output[] = findAll(arr, 0, 50);
        System.out.println(Arrays.toString(output));
       
    }
}

// Q. search an element and replace with the new value  eg. arr = {10,20,30,40,50} element to seacrh 50, replace with 500 o/p = [10,20,500,40,500].

