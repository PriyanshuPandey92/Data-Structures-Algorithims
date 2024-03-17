bool searchMatrix(vector<vector<int>>& matrix, int target) {
	int rows = matrix.size();
	int cols = matrix[0].size();

	int currRow = 0;
    int currCol = cols-1;
	
	while(currCol>=0 && currRow<rows){
		if(matrix[currRow][currCol] == target){
			return true;
        }
		if(matrix[currRow][currCol] > target){
            currCol--;
        }
		else{
			currRow++;
        }
    }
    return false;        
}
