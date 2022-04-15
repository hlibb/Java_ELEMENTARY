package lesson5.LeetcodeTask;

<<<<<<< HEAD
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
=======
import java.util.Arrays;

public class Solution {

    public String[] strArray;
    public int[] intArray;

    public void getIntegerArray(String strIn) {
        System.out.println(strIn + " ->");
        String tempStr = strIn.substring(1, strIn.length() - 1);
        strArray = tempStr.split(",");
        int[] tempIntArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            tempIntArray[i] = Integer.parseInt(strArray[i]);
        }
        intArray = new int[tempIntArray.length];
        for (int i = 0; i < tempIntArray.length; i++) {
            if (i == 0) intArray[i] = tempIntArray[i];
            if (i > 0) intArray[i] = tempIntArray[i] + intArray[i - 1];
        }
        System.out.println(Arrays.toString(intArray) + "\n");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.getIntegerArray("[1,2,3,4]");
        solution.getIntegerArray("[1,1,1,1,1]");
        solution.getIntegerArray("[3,1,2,10,1]");
    }
}
>>>>>>> lesson4
