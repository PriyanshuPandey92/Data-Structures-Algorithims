public class RabinKarp {
    public static void main(String[] args) {
        String text = "abcabdabcabe";
        String pattern = "abc"; // 97 + 98 + 99
        int textHash = 0;
        int patternHash = 0;
        int primeRange = 101;
        // Compute the hash for the pattern
        for(int i = 0; i<pattern.length(); i++){
            int ascii = pattern.charAt(i);
            patternHash = (patternHash + ascii) % primeRange; // Handle Overflow
            textHash = (textHash + text.charAt(i)) % primeRange; // initial text hash only
        }
        // Now slide the pattern on top of text
        for(int i = 0; i<=text.length() - pattern.length(); i++){
            if(textHash==patternHash){
                // now compare the value char by char
                if(text.substring(i, i + pattern.length()).equals(pattern)){
                    System.out.println("Pattern Found at "+i);
                }
            }
            if(i<text.length() - pattern.length()){ // for not go out of bound
            // now compute the next text hash (Rolling Hash)
            textHash = (textHash - text.charAt(i) + text.charAt(i+pattern.length())) % primeRange;
            }
        }
    }
}
