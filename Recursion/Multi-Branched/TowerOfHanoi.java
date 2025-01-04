public class TowerOfHanoi {
    static void tower(int n, char source, char auxillary, char destination){
        if(n==1){
            System.out.println("move disk 1 from rod "+source+" to "+destination);
            return;
        }
        tower(n-1, source, destination, auxillary);
        System.out.println("move disk "+n+" from rod "+source+" to "+destination);

        tower(n-1, auxillary, source, destination);
    }
    public static void main(String[] args) {
        tower(3, 'A', 'B', 'C');
    }
}
