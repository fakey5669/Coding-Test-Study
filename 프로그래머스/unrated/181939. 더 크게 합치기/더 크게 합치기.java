class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = ""+a+b;
        String ba = ""+b+a;
        return answer=(Integer.valueOf(ab)>=Integer.valueOf(ba))?Integer.valueOf(ab):Integer.valueOf(ba);
    }
}