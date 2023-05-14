import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();
        for(int i=0;i<my_string.length();i++){
            if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
                ;
            else
                answer=answer+array[i];
        }
        return answer;
    }
}