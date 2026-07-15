class Solution {
    public int reverse(int x) {
        int sum = 0;

        while (x != 0) {
            int m = x % 10;

            // Check for overflow before updating sum
            if (sum > Integer.MAX_VALUE / 10 || 
               (sum == Integer.MAX_VALUE / 10 && m > 7))
                return 0;

            if (sum < Integer.MIN_VALUE / 10 || 
               (sum == Integer.MIN_VALUE / 10 && m < -8))
                return 0;

            sum = sum * 10 + m;
            x /= 10;
        }

        return sum;
    }
}