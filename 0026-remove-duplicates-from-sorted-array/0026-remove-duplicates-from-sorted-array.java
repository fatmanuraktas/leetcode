class Solution {
    public int removeDuplicates(int[] nums) {
        
       final int n = nums.length;
        if (n < 2) return n; // If 0 or 1 element, it's already unique

        int slow = 0;
        // Using a 'final' limit and starting from 1 to avoid redundant checks
        for (int fast = 1; fast < n; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                // Only write if the pointers are actually different
                // to avoid unnecessary memory bus traffic
                if (slow != fast) {
                    nums[slow] = nums[fast];
                }
            }
        }
        return slow + 1;
    }

    
}