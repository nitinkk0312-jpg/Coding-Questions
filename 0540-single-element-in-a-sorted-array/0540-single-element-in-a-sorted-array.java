class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xorsum=0;
        for(int n:nums){
            xorsum=xorsum^n;
        }
        return xorsum;
    }
}