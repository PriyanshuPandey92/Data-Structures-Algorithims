int rowWithMax1s(vector<vector<int> > arr, int n, int m) {
	int currRow=0;
	int currCol=0;
	int maxi=0;
	int temp=0;
	int ans=0;
	while(currRow<n){
		if(currCol<m){
			if(arr[currRow][currCol]==1){
				temp++;
	        }
			currCol++;
	    }
		else{
			if(temp>maxi){
				maxi=temp;
				ans=currRow;
	        }
			currCol=0;
			temp=0;
			currRow++;
	    }
	}
	if(temp>maxi){
		maxi=temp;
		ans=currRow;
	}
	if(maxi==0){
       return -1;
	}
	return ans;
}
