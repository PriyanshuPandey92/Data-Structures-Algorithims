// 1--> TRUE
// 0--> FALSE

#include<iostream>
#include<vector>
using namespace std;


bool searchMatrix(vector<vector<int>>& matrix, int target) {
    int row = matrix.size();
    int col = matrix[0].size();
    
    int currRow=0;
    int currCol=0;
    int total=row*col;
    while(currRow<row){
        if(currCol<col){               
            // Check
            if(matrix[currRow][currCol] == target){
                return true;   
            }
            currCol++;
        }
        else{
            currCol=0;
            currRow++;
        }
    }
    return false;
}

int main(){
    vector<vector<int>> sample={{1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                {13, 14, 15, 16}};
                    
    cout<< searchMatrix(sample, 7);    
    return 0;                        
}
