// class Solution {
//     boolean[][] board;
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> bigList = new ArrayList<>();
//         List<String> smallList = new ArrayList<>();
//         board = new boolean[n][n];
//         paths(0,n,smallList,bigList);
//         return bigList;
//     }
//     boolean isSafeToPlaceQueen(int row, int col){
//         for(int i = row; i>=0; i--){
//             if(board[i][col])return false;
//         }
//         for(int j = col; j>=0; j--){
//             if(board[row][j])return false;
//         }
//         for(int i = row,j = col; i>=0&&j>=0; i--,j--){
//             if(board[i][j])return false;
//         }
//         for(int i = row,j = col; i>=0&&j<board.length; i--,j++){
//             if(board[i][j])return false;
//         }
//         return true;
//     }
//     void paths(int row , int n, List<String>smallList, List<List<String>> bigList){
//         if(smallList.size() == n){
//             bigList.add(new ArrayList<>(smallList));
//             return;
//         }
//         for(int col = 0; col<n; col++){
//             if(isSafeToPlaceQueen(row,col)){
//                 board[row][col] = true;
//                 String str = "";
//                 for(int i = 0; i<n; i++){
//                     if(i==col){
//                         str+='Q';
//                     }
//                     else{
//                         str+='.';
//                     }
//                 }
//                 smallList.add(str);
//                 paths(row+1, n, smallList, bigList);

//                 //BackTrack
//                 smallList.remove(smallList.size() - 1);
//                 board[row][col] = false;
//             }
//         }
//     }
// }