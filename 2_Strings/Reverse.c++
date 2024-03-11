#include <iostream>
using namespace std;
// void reverse(char name[],int size){
//     char temp;
//     for(int i=0;i<size/2;i++){                         // C language method
//         temp=name[i];
//         name[i]=name[size-i-1];
//         name[size-i-1]=temp;
//     }
// }

void reverse(char name[],int size){
    int s=0; //start            
    int e=size-1; //end                                  // C++ language method
    while(s<e){
        swap(name[s++],name[e--]);
    }
}


int main(){
    char name[20];
    cout<<"Enter your name"<<endl;
    cin>>name;

    int size=0;
    for(int i=0;name[i]!='\0';i++){
        size++;
    }
    
    reverse(name,size);
    cout<<"Reversed name="<<name;


    return 0;
}


