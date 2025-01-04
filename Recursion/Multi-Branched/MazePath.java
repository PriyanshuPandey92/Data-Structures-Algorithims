public class MazePath {
    static void path(int startRow, int startCol, int tgtrow, int tgtcol, String result){
        if(startRow == tgtrow && startCol == tgtcol){
            System.out.println(result);
            return;
        }
        if(startRow>tgtrow || startCol>tgtcol ){
            return;
        }
        path(startRow+1, startCol,tgtrow ,tgtcol, result+'V');
        path(startRow, startCol+1,tgtrow ,tgtcol, result+'H');

    }
    public static void main(String[] args) {
        path(0, 0, 3, 3, "");
    }
}   


// do it by returning the count of poosible paths

