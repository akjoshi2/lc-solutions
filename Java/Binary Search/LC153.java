// Solution to LeetCode 153: Find Minimum in Rotated Sorted Array
// Category: Binary Search
// Difficulty: Medium

public class LC153 {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        while (low < high)
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high])
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        return nums[low];
    }
}
