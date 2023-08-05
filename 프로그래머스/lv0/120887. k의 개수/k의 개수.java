public class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;

        for (int num = i; num <= j; num++) {
            count += countOccurrences(num, k);
        }

        return count;
    }

    private int countOccurrences(int number, int k) {
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit == k) {
                count++;
            }
            number /= 10;
        }

        return count;
    }
}