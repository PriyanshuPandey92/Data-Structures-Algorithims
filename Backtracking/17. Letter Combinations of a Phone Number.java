// class Solution {
//     String keys [] = {"","","abc","def","ghi","jkl","mno","pqrs", "tuv", "wxyz"};
//     public List<String> letterCombinations(String digits) {
//         if(digits.length() ==0){
//             return new ArrayList<String>();
//         }
//         return helper(digits);
//     }
//     public List<String> helper(String digits) {
//         // base case
//         // digits exhaust so return the arraylist
//         if(digits.length()==0){
//             List<String> list = new ArrayList<>();
//             list.add("");
//             return list;
//         }
//         // number -> digit (charAt)
//         char ch = digits.charAt(0); // "23" , i get 2 
//         // char to integer '2' - '0' (Ascii) (50 - 48) = 2 (index)
//         int digit = ch - '0';
//          // based on index get the string
//         String str = keys[digit]; // if it is 2 so i get abc
//         List<String> bigList = new ArrayList<>();
//          // pick the char one by one from the string and do branching
//         for(int i = 0; i<str.length() ; i++){
//             List<String> smallList = helper(digits.substring(1)); // make digits small
           
//         // rec the arraylist and fill it and return it
//             for(String s : smallList){
//                 bigList.add(str.charAt(i) + s);
//             }
//         }
//        return bigList;
        
//     }
// }