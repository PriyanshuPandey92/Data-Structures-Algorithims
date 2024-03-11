// for below pattern
//       1234554321
//       1234**4321
//       123****321
//       12******21
//       1********1



#include <iostream>
using namespace std;

int main(){
    int row=5;
    int value=1;
    
    for(int i=0; i<row; i++){
        for(int j=0; j<row-i;j++){
            cout<<value;
            value++;
        }
        for(int p=0; p<i; p++){
            cout<<'*';
            cout<<'*';
        }
        for(int k=0; k<row-i ;k++){
            cout<<value-1;
            value--;
        }
        value=1;
        cout<<endl;
    }

}
