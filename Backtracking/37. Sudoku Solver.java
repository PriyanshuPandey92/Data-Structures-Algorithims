// class Solution {
//     char[][] board; // Member Var
//     final int MAX = 9;

//     boolean checkInRow(int row , char value){
//         for(int i = 0; i<MAX; i++){
//             if(board[row][i]==value){
//                 return true;
//             }
//         }
//         return false;
//     }

//     boolean checkInCol(int col, char value){
//          for(int i = 0; i<MAX; i++){
//             if(board[i][col]==value){
//                 return true;
//             }
//         }
//         return false;

//     }

//     boolean checkInGrid(int row, int col, char value){
//         int startRow = row - row % 3;
//         int startCol = col - col % 3;
//         for(int i = startRow; i<startRow+3; i++){
//             for(int j = startCol; j<startCol+3; j++){
//                 if(board[i][j] == value){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     boolean canIPlace(int row, int col, char value){
//         return !checkInRow(row, value) && !checkInCol(col, value) && !checkInGrid(row, col, value);
//     }

//     public void solveSudoku(char[][] board) {
//         // Member Variable = Local Variable
//         this.board = board;
//         // start from 0,0 
//         helper(0,0);

//     }
//     // function - check in row
//     // function - check in col
//     // function - check in subgrid
//     // caniplace function - call all three
//     boolean helper(int row, int col){
//          // col == board[0].length row++
//         if(col == MAX){
//             row++;
//             col = 0;
//         }
//          // base case row == board.length (Board Solve)
//         if(row == MAX){
//             return true;
//         }
//          // board[row][col]!='.' col + 1
//         if(board[row][col]!='.'){
//             return helper(row, col + 1);
//         }
       
        
       

//         // Start from the first row and move to each col and on empty cell , 
//         // place number b/w 1 to 9
//         for(int i = 1 ; i<=MAX; i++){
//              // before place check not exist in row , not in col , not in subgrid
//             if(canIPlace(row, col, (char)(i +'0'))){
//             // Place it
//             board[row][col] = (char)(i +'0');
//             boolean result = helper(row, col + 1);
//             if(result){
//                 return true;
//             }
//             // Undo (BackTrack) UnPlace
//             board[row][col] = '.';
//             }
//         }
//         return false;
       
//     }
// }