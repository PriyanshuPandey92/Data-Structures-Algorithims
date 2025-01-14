// class Solution {
//     boolean[][] board;
//     public int totalNQueens(int n) {
//         board = new boolean[n][n];
//         return countPos(0,n);
//     }

//     boolean isSafeToPlaceQueen(int row , int col){
//         //same column
//         for(int i = row; i>=0 ; i--){
//             if(board[i][col])return false;
//         }
//         //left diagonal
//         for(int i = row , j = col; i>=0&&j>=0; i--,j--){
//             if(board[i][j])return false;
//         }
//         //right diagonal
//         for(int i = row , j = col; i>=0&&j<board.length; i--,j++){
//             if(board[i][j])return false;
//         }
//         return true;
//     }

//     int countPos(int row , int n){
//         if(row == n)return 1;
//         int count = 0;
//         for(int col = 0; col<n; col++){
//             if(isSafeToPlaceQueen(row,col)){
//                 board[row][col] = true;
//                 count += countPos(row+1 , n);
//                 board[row][col] = false;
//             }
//         }
//         return count;
//     }
    
// }