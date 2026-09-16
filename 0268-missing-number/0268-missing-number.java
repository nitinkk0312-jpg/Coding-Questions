class Solution {
    public int missingNumber(int[] nums) {
        int xorsum = 0;
        for (int i = 0; i < nums.length; i++) {
            xorsum = xorsum ^ nums[i];
        }
        int n = nums.length;
        for (int j = 0; j <= n; j++) {
            xorsum = xorsum ^ j;
        }
        return xorsum;
    }
}