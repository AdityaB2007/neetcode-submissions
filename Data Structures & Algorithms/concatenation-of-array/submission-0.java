class Solution {
    public int[] getConcatenation(int[] nums) {
        int N = nums.length;
        int[] ans = new int[2 * N];
        for (int i = 0; i < N; i++) {
            ans[i] == nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}