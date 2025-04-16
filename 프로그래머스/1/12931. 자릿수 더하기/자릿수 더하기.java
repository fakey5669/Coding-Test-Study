import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;
        int tmp2 = n;
        
        while(tmp2 >= 10){
            tmp = tmp2%10;
            tmp2 = tmp2/10;
            answer+=tmp;
        }
        answer+=tmp2;
        return answer;
    }
}