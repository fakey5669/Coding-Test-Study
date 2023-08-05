class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        int answer = numStr.indexOf(kStr);
        if(answer!=-1)
            answer+=1;
        
        return answer;
    }
}