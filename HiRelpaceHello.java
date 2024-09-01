public class HiRelpaceHello {
    static String ReplaceHiWithHello(String[] str , int index){
        if(str.length==index){
            return "";
        }
        String result = ReplaceHiWithHello(str,index+1);
        if(str[index].equals("Hi")){   // We cannot compare two string string using "==" because it will compare their reference value
            result = "Hello"+ " " + result;
        }
        else{
            result = str[index]+ " " +result;
        }
        return result;

    }
    public static void main(String[] args) {
        String str = "Hello Hi";
        String ans = ReplaceHiWithHello(str.split(" "), 0);
        System.out.println(ans);
    }
}
