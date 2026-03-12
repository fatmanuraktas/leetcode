class Solution {
    public int removeDuplicates(int[] nums) {
        
        // Edge case: if the array is empty, return 0
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initialize the slow pointer
        int slow = 0;

        // Iterate with the fast pointer starting from the second element
        for (int fast = 1; fast < nums.length; fast++) {
            // If the current element is different from the last unique element found
            if (nums[fast] != nums[slow]) {
                // Move the slow pointer forward
                slow++;
                // Update the position with the new unique element
                nums[slow] = nums[fast];
            }
        }

        // The number of unique elements is slow + 1 (since index is 0-based)
        return slow + 1;
    }

    
}