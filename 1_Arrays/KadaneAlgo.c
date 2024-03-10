#include <stdio.h>
//Kadane's Algo-------> Maximum possible sum of a sub array derived from given array (condition is that element selected should be contiguous)
int KadaneAlgo(int arr[],int size){
    int sum=0;
    int maxi=arr[0];
    for (int i = 0; i < size; i++)
    {
        sum=sum+arr[i];
        if (sum>maxi){
            maxi=sum;
        }
        if (sum<0){
            sum=0;
        }
    }
    return maxi;
    

    
}
int main(){
    int array[5]={-1,58,-8,-98,-45};
    int max=KadaneAlgo(array,5);
    printf("Max value of out of all sub contiguous array=%d",max);
    return 0;
}
