
public class Table {
    static String helper(int num , int val){
        if(val==0){
            // String str = new String(); // Here we don't have to create object for an empty string
            // return str;  
            return ""; 
        }
        String tableString = helper(num, val-1);
        String expression = num + " X " + val + " = " + (num*val) + "\n";
        tableString+= expression;
        return tableString;
    }
    static String createTable(int num){
        return helper(num, 10);
    }
    public static void main(String[] args) {
        System.out.println(createTable(5));
    }
}
