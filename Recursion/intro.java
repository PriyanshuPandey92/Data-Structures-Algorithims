
public class intro {
    static void showName(int num){
        //termination Case / Base Case
        if(num==0){
            System.out.println("Bye Bye"); // single time run
            return;
        }
        // every time run
        System.out.println("Amit");  // Logic  
        // Stack Building (UpTrack)
        showName(num-1);
        //Stack Fall (BackTrack)
        System.out.println("I am here after termination");
        // on termination...it returns to the position of caller therefore after num(0), it will reach here.
    }
    public static void main(String[] args) {
        showName(5);
    }
}
