class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] num = new int[n];
        int j=0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
                k++;
            }
        }
        return k;
    }

    public void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        removeElement(nums, val);
    }
}