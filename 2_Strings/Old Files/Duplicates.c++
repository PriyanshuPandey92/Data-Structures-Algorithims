#include <iostream>
#include <string>
using namespace std;

void duplicates(string str){
    
    int count[26]={0};
    for(int i=0;i<str.length();i++){
        count[str[i]-'a']++;
    }
    char ans;
    for(int j=0;j<26;j++){
        if(count[j]>1){
            ans='a'+j;
            cout<<ans<<",count="<<count[j]<<endl;
        }
    }
}

int main(){
    
    string str;
    cout<<"Enter a string"<<endl;
    getline(cin,str);

    duplicates(str);
    
    return 0 ;

}
