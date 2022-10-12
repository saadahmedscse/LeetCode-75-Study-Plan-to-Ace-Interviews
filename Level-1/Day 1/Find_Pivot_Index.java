/**
 * Author: Saad Ahmed
 * Date: 12-Oct-2022
 * Problem: 724. Find Pivot Index
 * Time Complexity: O(n)
 */

public class Find_Pivot_Index {

    public int pivotIndex(int[] nums) {
        int sum = 0;

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;

        for (int i=0; i<nums.length; i++) {
            leftSum += nums[i];

            if (sum - leftSum == leftSum - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
