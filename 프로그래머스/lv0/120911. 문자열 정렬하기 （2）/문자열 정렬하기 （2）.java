import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string=my_string.toLowerCase();
        char[] newstr=my_string.toCharArray();
        Arrays.sort(newstr);
        String answer=new String(newstr);
        return answer;
    }
}