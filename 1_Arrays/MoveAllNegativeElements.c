#include <stdio.h>
//to do => eg.[1,2,3,-4,5,-6,7]-->[1,2,3,5,7,-4,-7]
void seperateNegative(int arr[], int size){
    
    int temp=0;
    for(int i=0;i<size;i++){
        int j=size -1;                                                    
        if(arr[i]<0){                                                                
            while(arr[j]<0){
                j=j-1;
            }
            //swapping -ve no. with any first +ve no. from left   
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //checking if all -ve nos. are sperated or not
        int count=0;
        for(int k=i+1;k<size;k++){
            if(arr[k]<0){
                count=count+1;
            }
        }
        if(count==(size-i)-1){
            break;
        }
    }
}
int main(){
    int size;
    printf("Enter Size of Array=");
    scanf("%d",&size);
    
    int array[size];
    for(int i=0;i<size;i++){
        printf("Enter value for Array[%d]",i);
        scanf("%d",&array[i]);
    }
    seperateNegative(array,size);
    for(int j=0;j<size;j++){
        printf("%d ",array[j]);
    }
    return 0;
}
