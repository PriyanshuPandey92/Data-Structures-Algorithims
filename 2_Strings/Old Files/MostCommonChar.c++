#include <iostream>
#include <string>
using namespace std;


char MostCommomCharacter(string str){
    
    // Calculating counts for each 26 alphabets
    int count[26]={0};    // count[0]->'a'  count[1]->'b' .........
    for (int i=0;i<str.length();i++){
        count[str[i]-'a']++;  //str[i]-'a' will provide an integer for respective charater in count[26] array
    }
    // for finding the character with highest count
    int maxi=count[0];
    int ans;
    for(int j=1;j<26;j++){
        if(count[j]>maxi){
            maxi=count[j];
            ans=j;
        }
    }
    int finalans='a'+ans; // 'a' is an INTEGER for character a
    return finalans;

}

int main(){

    string str;
    cout<<"Enter an String "<<endl;
    cin>>str;
    
    char result=MostCommomCharacter(str);  // remember here function is returing an INTEGER but since 
    cout<<result;                          // we have initialized "result" as CHAR hence it is giving CHAR according to that INTEGER
    
    return 0;
}
