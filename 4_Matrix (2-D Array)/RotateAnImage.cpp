void rotate(vector<vector<int>>& matrix) {

        // TRANSPOSE OF MATRIX
        for(int i=0; i<matrix.size(); i++){
            for(int j=0; j<i; j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        // SWAPPING THE COLUMNS
        for(int i=0; i<matrix.size(); i++){
            reverse(matrix[i].begin(),matrix[i].end());
        }
    }
