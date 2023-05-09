import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] numbers, int num1, int num2) {
        List<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }
        return list.subList(num1, num2 + 1);
    }
}