// Important :)

#include <iostream>
#include <vector>
using namespace std;

vector<int> SpiralTraversal ( vector<vector<int>> &matrix ){
    vector<int> ans;
                                                                //   __        __
                                                                //  |            |
    int row = matrix.size();                                    //  | -> -> -> | |
    int col = matrix[0].size();                                 //  | ^        v |
                                                                //  | |        | |
    int count = 0;                                              //  | <- <- <- v_|
    int total = row * col;                                      //  |__        __|

    int startrow=0;
    int endcol=col-1;
    int endrow=row-1;
    int startcol=0;

    while(count<total){

        // Printing Starting Row
        for(int i = startcol; i<= endcol && count<total ; i++){
            ans.push_back(matrix[startrow][i]);
            count++;
        }
        startrow++;

        // Printng Ending Column
        for(int i = startrow; i<=endrow && count<total; i++){
            ans.push_back(matrix[i][endcol]);
            count++;
        }
        endcol--;

        // Printing Ending Row
        for(int i = endcol; i>=startcol && count<total; i--){
            ans.push_back(matrix[endrow][i]);
            count++;
        }
        endrow--;

        // Printing Starting Column
        for(int i = endrow; i>=startrow && count<total; i--){
            ans.push_back(matrix[i][startcol]);
            count++;
        }
        startcol++;
    }
    return ans;
    
}
int main(){
    vector<vector<int>> sample={{1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                {13, 14, 15, 16}};
    
    vector<int> ans = SpiralTraversal(sample);
    cout<<"Spiral Traversal = ";
    for(int i=0; i<ans.size(); i++){
        cout<< ans[i]<<" ";
    }
    return 0;
}
