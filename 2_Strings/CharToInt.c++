#include <iostream>
#include <string>
using namespace std;

void converter(string str,int n){
    
   if(n<str.length()){
        cout<<str[n]-'0';

        n++;
        converter(str,n);
    }
}

int main(){
    string str;
    cout<<"Enter a string"<<endl;
    getline(cin,str);

    converter(str,0);

    return 0;
}
