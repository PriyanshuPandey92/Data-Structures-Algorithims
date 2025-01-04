#include <stdio.h>
int main(){
    int size;
    printf("Enter Size of Array:");
    scanf("%d",&size);

    int array[size];
    for(int p=0;p<=size-1;p++){
        printf("Enter integer Value for array[%d]",p);
        scanf("%d",&array[p]);
    }

    int tgt;
    printf("Enter Target:");
    scanf("%d",&tgt);

    int i,j;
    for(i=0;i<=size-1;i++){
        for(j=i+1;j<=size-1;j++){
            if (array[i]+array[j]==tgt){
                printf("Two Sum=(%d,%d)\n",i,j);
                   
            }
        }
    }
    
}
