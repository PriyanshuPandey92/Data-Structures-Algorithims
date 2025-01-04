#include<stdio.h>
void rotate(int arr[],int size,int steps){
    int temp;
    for(int i=0 ; i<steps ; i++){
        temp=arr[0];
        for (int j =1; j< size; j++){
            arr[j-1]=arr[j];
        } 
        arr[size-1]=temp;   
        
    }    
}
int main(){
    int size;
    printf("Enter the size of Array=");
    scanf("%d",&size);
    
    int array[size];
    for(int i=0;i<size;i++){
        printf("Enter value for Array[%d]",i);
        scanf("%d",&array[i]);
    }

    int steps;
    printf("Enter no. of Steps to be Rotated=");
    scanf("%d",&steps);

    rotate(array,size,steps);

    for(int j=0;j<size;j++){
        printf("%d ",array[j]);    
    }
    return 0;

}
