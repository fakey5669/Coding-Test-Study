import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        int i = 0;
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int minGreater = Integer.MAX_VALUE;
            boolean found = false;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < minGreater) {
                    minGreater = arr[j];
                    found = true;
                }
            }

            result[i++] = found ? minGreater : -1;
        }

        return result;
    }
}