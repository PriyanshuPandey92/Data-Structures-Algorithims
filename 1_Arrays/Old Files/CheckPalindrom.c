// It's gonna print "0"--> atleast one of the no. id NOT Palindrom
//And "1"--> all no. are Palindrom

#include <stdio.h>
int CheckForPalindrom(int arr[],int size){
    int remainder;
    int reversed;
    for(int i=0;i<size;i++){
        int original=arr[i];
        remainder=reversed=0;
        while (arr[i] != 0) {
            remainder = arr[i]% 10;
            reversed = reversed * 10 + remainder;
            arr[i] /= 10;
        }
        if (original!=reversed){
            return 0;
        }
    }
    return 1;
}    
int main(){
    int arr[5]={111,12321,14741,222,333};
    printf("%d",CheckForPalindrom(arr,5));
    return 0;
}
