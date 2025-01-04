// class Solution {
//     public ArrayList<String> findPath(int[][] mat) {
//         // Your code here
//         int n = mat.length;
//         ArrayList <String> result = new ArrayList<>();
//         // Special Case
//         if(mat[0][0]==0 || mat[n-1][n-1]==0)return result;
        
//         boolean visited[][] = new boolean[n][n];
//         solveRatInAMaze(mat, 0 , 0 , n , "" , result , visited);
//         return result;
//     }
//     void solveRatInAMaze(int[][] mat , int row, int col, int n, String path,ArrayList <String> result ,boolean visited[][]  ){
//         //Base condition
//         if(row == n-1 && col == n-1){
//             result.add(path);
//             return;
//         }
//         visited[row][col] = true;
        
//         if(isSafe(mat , visited , row+1 , col , n)){
//             solveRatInAMaze(mat , row+1, col, n ,path+"D",result, visited);
//         }
//         if(isSafe(mat , visited , row-1 , col , n)){
//             solveRatInAMaze(mat , row-1, col, n ,path+"U",result, visited);
//         }
//         if(isSafe(mat , visited , row , col+1 , n)){
//             solveRatInAMaze(mat , row, col+1, n ,path+"R" ,result, visited);
//         }
//         if(isSafe(mat , visited , row , col-1 , n)){
//             solveRatInAMaze(mat , row, col-1, n ,path+"L",result, visited);
//         }
        
//         //BackTrack
//         visited[row][col] = false;
//     }
    
//     boolean isSafe(int[][] mat , boolean visited[][] , int row, int col, int n){
//         return (row>=0 && row<n && col>=0 && col<n && mat[row][col]==1 && !visited[row][col]);
//     }
    
// }