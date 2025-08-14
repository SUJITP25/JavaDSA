public class Recursion {
    public static int findFactorial(int n){
        if (n<=1) return 1;
        int factorial= n*findFactorial(n-1); 
        return factorial;
    }

    // Given the Integer,find the sum of its digits using Recursion
    public static int digitSum(int n){
        if (n<=0) return 0;
        int lastDigit = n % 10;
        return lastDigit + digitSum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
        System.out.println(digitSum(125));
    }
}


