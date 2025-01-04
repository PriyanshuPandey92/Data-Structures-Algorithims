// class Solution {
//     public List<List<Integer>> combine(int n, int k) {
//         List<List<Integer>> bigList = new ArrayList<>();
//         List<Integer> smallList = new ArrayList<>();
//         helper(1,n ,k, smallList , bigList);
//         return bigList;
//     }
//     public void helper(int curr , int n , int k , List<Integer> smallList , List<List<Integer>> bigList){
//         //base case 
//         if(smallList.size()==k){
//             bigList.add(new ArrayList<>(smallList));
//             return;
//         }
//         for(int i = curr; i<=n; i++){
//             if(!smallList.contains(i)){
//                 smallList.add(i);
//                 helper(i,n,k,smallList, bigList);
//                 //Stack Fall
//                 smallList.remove(smallList.size()-1);
//             }
//         }
//     }
// }