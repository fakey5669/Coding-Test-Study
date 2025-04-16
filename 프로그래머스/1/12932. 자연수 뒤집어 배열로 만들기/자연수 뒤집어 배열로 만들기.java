import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] array = str.split("");
        int[] answer = new int[str.length()];

        for(int i=0;i<str.length();i++){
            answer[i]=Integer.valueOf(array[str.length()-1-i]);
        }
        return answer;
    }
}