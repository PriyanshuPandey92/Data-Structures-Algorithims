class Naive{
    public static void main(String[] args) {
        String text = "abcdefabctype";
        String pattern = "abc";
        // Slide the pattern on top of the text , pick one letter each time
        for(int i = 0; i<=text.length() - pattern.length(); i++){
            int j;
            for( j = 0; j<pattern.length(); j++){
                if(text.charAt(i + j)!=pattern.charAt(j)){
                    break ; // break from the inner loop 
                    // (break the pattern loop and reach to the text loop)
                }
            }
            if(j== pattern.length()){
                System.out.println("Found Pattern at "+i);
            }
        }
    }
}