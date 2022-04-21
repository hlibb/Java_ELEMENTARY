package lesson8.Solution;

class Solution {
    int result;

    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n >= 0) return (fib(n - 1) + fib(n - 2));
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.fib(3));
    }
}
