public class Strings {
    // Question 1: Count the Vowels in the String
    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'o') {
                count++;
            }
        }
        return count;
    }

    // Question 2: Check if the String is Palindrome or not.
    public static boolean checkIfStringPalindrome (String s){
        int i =0; 
        int j = s.length()-1; 
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false; 
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        // char[] arr = {'p','r','i','y','a'};
        // for(char ele:arr){
        // System.out.println(ele+" ");
        // }
        String s = "shruti is a good girl and vineet also good";
        String name = "daad";
        // System.out.println(s);
        // Strings methods
        // (int i = 0; i < s.length(); i++) {
        //     System.out.println(s.charAt(i));
        // }
        System.out.println(s.charAt(4));
        System.out.println(s.length());
        System.out.println(countVowels(s));
        System.out.println(checkIfStringPalindrome(name));
    }
}