class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 0;
        for (int r = 1; r < n; r++) {
            if (nums[r] != nums[l]) {
                l++;
                nums[l] = nums[r];
            }
        }
        int k=l+1;
        return k;
    }

    public void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        removeDuplicates(nums);
    }
}