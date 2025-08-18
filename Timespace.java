public class Timespace {
    public static int sumofArray(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = sumofArray(n);
        System.out.println("Sum of first " + n + " numbers is: " + result);

        // Time Compelxity Problems
        // Asymptotic Analysis
        int val = 0;
        for (int i = 1; i <= n; i += i) {
            val = val + 1;
        }
        // time complexity = o(logn)

        for (int i = 1; i <= n; i *= 2) {
            for (int j = 1; j <= i; j++) {
                val = val + 1;
            }
        }

        // Time Complexity =(o(logn)*o(n))
        // Time Complexity =(o(n))
        // Because we are also doing i iterations for j.
        // Outer loop = log n
        // Inner loop = up to n
        // → multiply to get n log n
        // The inner loop’s length depends on i, starting small and growing —
        // so total work is the sum of powers of 2 → O(n), not O(n log n).

        for (int i = 1; i <= n; i *= 2) {
            for (int j = 1; j <= n; j++) {
                val = val + 1;
            }
        }

        // Time complexity = o(n*logn)
        // Because this timne j is not depending upon i that's why the
        // time complexity wlll be multiplies.

        // You multiply loop counts when both loops are independent.
        // You don’t multiply when loops are sequential, not nested.

        // Question : find the first Duplicate

        int[] arr = { 1, 2, 3, 4, 5, 6, 4 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("first duplicate element is " + arr[i]);
                }
            }
        }

        // approach2
        int s = arr.length;
        boolean[] flag = new boolean[n + 1];
        for (int i = 0; i < s; i++) {
            int ele = arr[i];
            if (flag[ele] == true) {
                System.out.println("duplicate element is " + ele);
            } else {
                flag[ele] = true;
            }
        }

    }
}

// What is Time Complexity?
// Overall Running Time Depends upon the multiple factors
// (1) What is the Logic of an algorithm?
// (2) Programming Language
// (3) Machine Dependent
// Overall Running Time is not time Complexity
// Time Complexity depends upon the number of Operations.
// Number of Operation - function of the Input
// Asymptotic Analysis - No of Operation - Function Input - Analysis

// Probems on Time Complexity
//
