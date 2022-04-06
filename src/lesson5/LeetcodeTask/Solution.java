package lesson5.LeetcodeTask;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] solution = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) solution[i] = nums[i];
            else solution[i] = solution[i - 1] + nums[i];
        }
        return solution;
    }
}