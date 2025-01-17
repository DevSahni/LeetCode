class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0]; // Start of the current range

        for (int i = 1; i <= nums.length; i++) {
            // Check if we reached the end of the array or a gap in the range
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                // Add the range to the result
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start)); // Single number range
                } else {
                    result.add(start + \->\ + nums[i - 1]); // Multi-number range
                }

                // Update start for the next range
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return result;
    }
}