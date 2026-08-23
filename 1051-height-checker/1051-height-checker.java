class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = new int[n];
        for (int i = 0; i < n; i++) {
            expected[i] = heights[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j =i+1; j < n; j++) {
                if (expected[i] > expected[j]) {
                    int temp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = temp;
                }
            }
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                k++;
            }
        }
        return k;
    }

    public void main(String[] args) {
        int[] heights = { 5, 1, 2, 3, 4 };
        heightChecker(heights);
    }
}
