package lesson7.Solution;

class Solution {
    int max = 0;
    int idx = 0;
    public int maxDepth(String s) {
        char[] arr =  s.toCharArray();
        for (char c : arr) {
            if (c == '(') {
                idx ++;
                if (idx > max) max = idx;
            }
            if (c == ')') {
                idx --;
                if (idx > max) max = idx;
            }

        }
        return max;
    }
}

