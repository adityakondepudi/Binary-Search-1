//Time Complexity : O(logn)
//Space Complexity: O(1)
//Did it run on Leetcode : Yes
//Any issues : N/A


class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length ==0)
        {
            return -1;
        }
        int low = 0; int high = nums.length-1;
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if (nums[mid] == target){return mid;}
            else if (nums[low] <= nums[mid])
            {
                if (nums[low]<=target && target <= nums[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else 
            {
                if (nums[mid] <= target && target <= nums[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
