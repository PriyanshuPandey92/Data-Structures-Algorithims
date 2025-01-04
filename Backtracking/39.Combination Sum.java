// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> bigList = new ArrayList<>();
//         List<Integer> smallList = new ArrayList<>();
//         helper(candidates, 0, smallList , bigList ,target);
//         return bigList;
//     }
//     int findSum(List<Integer> smallList){
//         int sum = 0;
//         for(int i = 0; i<smallList.size(); i++){
//             sum+=smallList.get(i);
//         }
//         return sum;
//     }
//     void helper(int[] candidates, int index, List<Integer> smallList, List<List<Integer>> bigList, int target){
//         //base case
//         if(findSum(smallList)==target){
//             bigList.add(new ArrayList<>(smallList));
//             return;
//         }
//         if(findSum(smallList)>target){
//             return;
//         }
//         for(int i = index; i<candidates.length; i++){
//             smallList.add(candidates[i]);
//             helper(candidates,i, smallList, bigList, target);

//             //backtracking
//             smallList.remove(smallList.size()-1);

//         }
//     }
// }