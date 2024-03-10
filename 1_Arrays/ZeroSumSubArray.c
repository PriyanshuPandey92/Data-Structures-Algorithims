// Tells if is there exist a sub array in provided array whoes sum of elements equal to '0'

#include <stdio.h>
int ZeroSumSubArray(int arr[],int size){
    int sum;
    for(int i=0;i<size;i++){
        sum=arr[i];
        for(int j=i+1;j<size;j++){
            sum=sum+arr[j];
            if (sum==0){
                return 1;
            }
        }
    }
    return -1;
}
int main(){
    int array[5]={4,2,3,1,6};
    int ans=ZeroSumSubArray(array,5);
    if(ans==1){
        printf("TRUE");
    }
    if (ans==-1){
        printf("FALSE");
    }
    
    return 0;
}
