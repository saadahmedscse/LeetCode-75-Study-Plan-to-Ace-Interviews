/**
 * Author: Saad Ahmed
 * Date: 12-Oct-2022
 * Problem: 1480. Running Sum of 1d Array
 * Time Complexity: O(n)
 */

public class Running_Sum_Of_1D_Array {

    public int[] runningSum(int[] nums) {
        int res [] = new int[nums.length];
        res[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = res[i] + nums[i];
            } else {
                res[i] = res[i-1] + nums[i];
            }
        
        }

        return res;
    }
}