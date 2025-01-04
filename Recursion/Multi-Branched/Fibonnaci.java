public class Fibonnaci {
    static int fibonnaci(int len){
        if(len==0){
            return 0;
        }
        if(len==1){
            return 1;
        }
        int a = fibonnaci(len-2);
        int b = fibonnaci(len-1);
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(fibonnaci(6));
    }
}
