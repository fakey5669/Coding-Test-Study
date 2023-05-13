import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        return Arrays.stream(numbers).sorted().skip(numbers.length - 2).reduce((a, b) -> a * b).getAsInt();
    }
}