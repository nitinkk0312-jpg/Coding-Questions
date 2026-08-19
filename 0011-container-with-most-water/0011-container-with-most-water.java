class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        //l is the left pointer 
        //r is the right pointer
        int l = 0, r = n - 1;
        int maxarea = 0;
        while (l < r) {

            int h = Math.min(height[l], height[r]);
            int w = r - l;
            int area = h * w;
            maxarea = Math.max(area, maxarea);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxarea;
    }

    public void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        maxArea(height);
    }
}