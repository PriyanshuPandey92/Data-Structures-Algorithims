bool searchMatrix(vector<vector<int>>& matrix, int target) {
	int row = matrix.size();
    int col = matrix[0].size();
        
    int currRow=0;
	int currCol=0;
    int total=row*col;
	while(currRow<row){
		if(currCol<col){               
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
