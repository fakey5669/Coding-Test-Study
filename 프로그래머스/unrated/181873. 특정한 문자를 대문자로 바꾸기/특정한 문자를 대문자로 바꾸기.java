class Solution {
    public String solution(String my_string, String alp) {
        String alp2=alp.toUpperCase();
        String answer = my_string.replace(alp,alp2);
        return answer;
    }
}