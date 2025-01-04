// class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         List<List<Integer>> bigList = new ArrayList<>();
//         List<Integer> smallList = new ArrayList<>();
//         boolean []isVisited = new boolean[nums.length];
//         helper(nums,smallList, bigList, isVisited);
//         return bigList;
//     }
//     void helper(int [] nums, List<Integer> smallList, List<List<Integer>> bigList , boolean[] isVisited){
//         // base case
//         if(smallList.size()==nums.length && !bigList.contains(smallList)){
//             bigList.add(new ArrayList<>(smallList));
//             return;
//         }
//         for(int i = 0; i<nums.length; i++){
//             if(!isVisited[i]){
//                 smallList.add(nums[i]);
//                 isVisited[i]=true;
//                 helper(nums , smallList , bigList , isVisited);
//                 // stack fall
//                 smallList.remove(smallList.size()-1);
//                 isVisited[i] = false;
//             }
            
//         }
//     }
// }