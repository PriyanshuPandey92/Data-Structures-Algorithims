//Refer Question Link for Problem Statement "@READ ME"
#include <stdio.h>
int MinJumps(int arr[], int n) {
    int count=1;
    int current=1;
    while(current<n){
        count=count+1;
        current=current+arr[current];
    }
    return count;
}
    int main(){
    int arr[5]={3, 9, 12, 16, 20};
    int ans=MinJumps(arr,5);
    printf("No. of minimum jumps req.=%d",ans);
    return 0;
}
