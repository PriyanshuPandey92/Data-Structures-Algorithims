#include <iostream>
#include <string>
using namespace std;

void reverse(string &name){
    int s=0; //start            
    int e=(name.length())-1; //end                                 
    while(s<e){
        swap(name[s++],name[e--]);
    }
}

int ReverseWords(string str){
    string temp;
    for(int i=0;i<str.length();i++){
        if (str[i]!=' '){
            temp.push_back(str[i]);
        
        }
        else{
            reverse(temp);
            cout<<temp<<" ";
            temp.clear();
        }
    }
    //for the last word (becoz we can't access null character in String class)
    reverse(temp);
    cout<<temp;

    return 0;
}

int main(){
    string input;
    cout<<"Enter a string:"<<endl;
    getline(cin, input);

    ReverseWords(input);

    return 0;
}



// if((str[i]>='a' && str[i]<='z')||(str[i]>='A' && str[i]<='Z')){
