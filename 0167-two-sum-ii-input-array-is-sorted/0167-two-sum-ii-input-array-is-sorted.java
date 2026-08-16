class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==j){
                    continue;
                }
                if((numbers[i]+numbers[j])==target){
                    i++;
                    j++;
                    int[] nums={i,j};
                    return nums;
                }
            }
        }
        int[] nums={};
        return nums;
    }

    public void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(numbers, target);
    }
}