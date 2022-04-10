package lesson6.Solution;

import java.util.Arrays;

public class Solution {
    int[] result;
    int[] tempArr;
    int[][] valuesOfResultArray; // []-length []-value
    int count = 0;

    public int[] decompressRLElist(int[] nums) {
        valuesOfResultArray = new int[nums.length / 2][2];
        for (int i = 0; i < nums.length; i += 2) {
            valuesOfResultArray[i / 2][0] = nums[i];
            valuesOfResultArray[i / 2][1] = nums[i + 1];       // {1, 2, 3, 4}  ->  {2, 4, 4, 4}         [1][2]  [3][4]
        }

        for (int[] ints : valuesOfResultArray) {
            count += ints[0];
        }

        result = new int[count];

        for (int i = 0; i < nums.length / 2; i++) {
            tempArr = new int[nums[i * 2]];
            Arrays.fill(tempArr, nums[(i * 2) + 1]);
            valuesOfResultArray[i] = tempArr;
        }

        int counter = 0;
        for (int i = 0; i < valuesOfResultArray.length; i++) {
            for (int j = 0; j < valuesOfResultArray[i].length; j++) {
                result[counter] = valuesOfResultArray[i][j];
                counter++;
                if (counter > valuesOfResultArray[i].length) break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{65,44,72,15};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.decompressRLElist(nums)));
    }
}