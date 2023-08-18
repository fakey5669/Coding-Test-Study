import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
        String reversedString = new StringBuilder(String.valueOf(n)).reverse().toString();
        int[] answer = new int[reversedString.length()];
        
        for (int i = 0; i < reversedString.length(); i++) {
            answer[i] = Character.getNumericValue(reversedString.charAt(i));
        }
        
        return answer;
    }
}