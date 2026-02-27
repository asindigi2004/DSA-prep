public class Solution {
    public static void main(String[] args){
        String s = "m om";
        boolean result = validPalindrome(s);
        System.out.println(result);
    }

    private static boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1;

        
        while(i<j){
            while(i<j && !isAlphaNum(s.charAt(i)))i++;
        while(i<j && !isAlphaNum(s.charAt(j)))j--;
            if(s.charAt(i)!= s.charAt(j))return false;
            i++;
            j--;
        }
        return true;

    }

    private static boolean isAlphaNum(char c){
        return (c >= 'a' && c <= 'z' ||
            c >= 'A' && c <= 'Z' ||
            c >= '0' && c <= '9'
        );
    }
}
