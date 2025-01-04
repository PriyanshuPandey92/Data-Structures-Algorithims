// Finds the Kth smallest int in an Array

#include <stdio.h>
void bubbleSort(int *A, int n){
    int temp;
    int isSorted = 0;
    for (int i = 0; i < n-1; i++) // For number of pass
    {
        
        for (int j = 0; j <n-1-i ; j++) // For comparison in each pass
        {
            if(A[j]>A[j+1]){
                temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp; 
            }
        }  
    } 
}
int kthSmallest(int arr[], int l, int r, int k){
    return arr[k-1];    
    }
 

int main(){
    int k,l,r;
    printf("Enter the Kth Min:");
    scanf("%d",&k);
    printf("Enter size of Array:");
    scanf("%d",&r);

    int array[r];
    for(int i=0;i<r;i++){
        printf("Enter value for Array[%d]:",i);
        scanf("%d",&array[i]);
    }

    bubbleSort(array,r+1);
    int Result=kthSmallest(array,l,r,k);
    printf("Kth Smallest Number=%d",Result);
    
    return 0;
}
