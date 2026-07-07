class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        int sum = 0;

        String str = Integer.toString(n);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                int digit = str.charAt(i) - '0';
                x = x * 10 + digit;
                sum += digit;
            }
        }

        return x * sum;
    }
}