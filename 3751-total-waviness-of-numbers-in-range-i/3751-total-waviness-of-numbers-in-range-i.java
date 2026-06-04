class Solution {

    // Function to calculate total waviness
    public int totalWaviness(int num1, int num2) {

        int sum = 0;

        // Traverse all numbers in range
        for (int i = num1; i <= num2; i++) {

            String s = String.valueOf(i);

            // Numbers with less than 3 digits have waviness 0
            if (s.length() < 3) {
                continue;
            }

            // Check middle digits
            for (int j = 1; j < s.length() - 1; j++) {

                int prev = s.charAt(j - 1) - '0';
                int curr = s.charAt(j) - '0';
                int next = s.charAt(j + 1) - '0';

                // Peak
                if (curr > prev && curr > next) {
                    sum++;
                }

                // Valley
                else if (curr < prev && curr < next) {
                    sum++;
                }
            }
        }

        return sum;
    }
}