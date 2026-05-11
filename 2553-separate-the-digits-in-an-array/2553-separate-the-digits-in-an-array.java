class Solution {
    public int[] separateDigits(int[] nums) {
        // count total digits
        int total = 0;
        for (int x : nums) total += String.valueOf(x).length();

        int[] ans = new int[total];
        int idx = 0;

        for (int x : nums) {
            for (char c : String.valueOf(x).toCharArray()) {
                ans[idx++] = c - '0'; // directly add digit
            }
        }
        return ans;
    }
}
