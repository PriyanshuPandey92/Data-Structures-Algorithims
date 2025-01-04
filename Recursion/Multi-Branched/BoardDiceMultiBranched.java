import java.util.ArrayList;

public class BoardDiceMultiBranched {

    // Returning the count possible paths 
    static int possibilities(int start, int target){
        if(start == target){
            return 1;
        }
        if(start>target){
            return 0;
        }
        return possibilities(start+6,target)+  
        possibilities(start+5,target)+
        possibilities(start+4,target)+
        possibilities(start+3,target)+
        possibilities(start+2,target)+
        possibilities(start+1,target);
    }

    // Returing a ArrayList containing all these paths
    static ArrayList<String> diceMove(int start , int end){
        if(start==end){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        } 
        if(start>end){
            ArrayList<String> list = new ArrayList<>();
            return list ;
        }
        ArrayList<String> finaList = new ArrayList<>();

        for(int dice = 1; dice<=6; dice++){
            ArrayList<String> list = diceMove(start+dice, end);
            for(String l:list){
                finaList.add(l+dice);
            }
        }
        return finaList;
        
    }

    public static void main(String[] args) {
        int target = 10;
        System.out.println(possibilities(0, target));
        ArrayList<String> result = diceMove(0, 10);
        System.out.println(result);
        
        
    }
}


