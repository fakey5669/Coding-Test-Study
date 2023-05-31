import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] arr = Arrays.copyOf(num_list, 5);
        return arr;
    }
}