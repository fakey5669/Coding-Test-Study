import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] firstInterval = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] secondInterval = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

        int[] result = new int[firstInterval.length + secondInterval.length];
        System.arraycopy(firstInterval, 0, result, 0, firstInterval.length);
        System.arraycopy(secondInterval, 0, result, firstInterval.length, secondInterval.length);

        return result;
    }
}