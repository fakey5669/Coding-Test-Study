import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int i : arr) {
            if (i % divisor == 0) count++;
        }

        if (count == 0) return new int[]{-1};

        int[] answer = new int[count];
        int idx = 0;
        for (int i : arr) {
            if (i % divisor == 0) answer[idx++] = i;
        }

        Arrays.sort(answer);
        return answer;
    }
}