
// class Solution {
//     public List<List<Integer>> permute(int[] nums) { 
//         List<Integer> smallList = new ArrayList<>();
//         List<List<Integer>> bigList = new ArrayList<>();  
//         helper(nums,smallList, bigList);
//         return bigList;
//     }
//     void helper(int nums[], List<Integer> smallList, List<List<Integer>> bigList){
//         //Base Case
//         if(nums.length == smallList.size()){
//             bigList.add(new ArrayList<>(smallList));
//             return;
//         }
//         for(int i = 0; i<nums.length ; i++){
//             if(!smallList.contains(nums[i])){
//                 smallList.add(nums[i]);
//                 helper(nums,smallList, bigList);
//                 //stack Fall
//                 smallList.remove(smallList.size()-1);
//             }
//         }
//     }
// }