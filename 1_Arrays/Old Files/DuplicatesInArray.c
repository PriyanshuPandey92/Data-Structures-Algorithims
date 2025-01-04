#include<stdio.h>
void duplicate(int arr[],int size){
    printf("Duplicate elements are= ");
    for (int i = 0; i < size; i++)
    {
        for (int j = i+1; j <size; j++)
        {
            if(arr[i]==arr[j]){
                printf("%d ",arr[i]);
            }
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
    duplicate(array,size);
}
