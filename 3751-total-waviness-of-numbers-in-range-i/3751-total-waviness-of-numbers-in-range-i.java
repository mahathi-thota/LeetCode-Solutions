class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += waviness(i);
        }
        return sum;
    }

    private int waviness(int num) {
        // Collect digits into an array (least significant → most significant)
        int[] digits = new int[6]; // since num ≤ 10^5, max 6 digits
        int len = 0;
        int temp = num;
        while (temp > 0) {
            digits[len++] = temp % 10;
            temp /= 10;
        }

        if (len < 3) return 0; // fewer than 3 digits → no peaks/valleys

        int count = 0;
        // Traverse from second digit to second-last digit
        for (int i = len - 2; i >= 1; i--) {
            int prev = digits[i + 1]; // left neighbor
            int curr = digits[i];     // current digit
            int next = digits[i - 1]; // right neighbor

            if (curr > prev && curr > next) {
                count++; // peak
            } else if (curr < prev && curr < next) {
                count++; // valley
            }
        }
        return count;
    }
}
