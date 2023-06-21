import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] arr = new int[1000];
        
        if (n < 1) {
            return new int[0];
        }

        arr[0] = n;
        int i = 0;

        while (true) {
            if (n == 1) {
                break;
            }

            i++;

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

            arr[i] = n;
        }

        int[] answer = Arrays.copyOf(arr, i + 1);
        return answer;
    }
}