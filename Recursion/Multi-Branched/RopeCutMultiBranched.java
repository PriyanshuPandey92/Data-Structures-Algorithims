public class RopeCutMultiBranched {
    static int numberofpieces(int ropeLen){
        if(ropeLen == 0){
            return 0;
        }
        if(ropeLen < 0){
            return -1;
        }
        int option1 = numberofpieces(ropeLen-3);
        int option2 = numberofpieces(ropeLen-2);
        int option3 = numberofpieces(ropeLen-1);
        int result = Math.max(Math.max(option1,option2),option3);
        if(result == -1){
            return -1;
        }
        return result+1;
    }
    public static void main(String[] args) {
        System.out.println(numberofpieces(3));
    }
}
