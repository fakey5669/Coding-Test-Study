class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] strArr = ("" + order).split("");
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("3") | strArr[i].equals("6") | strArr[i].equals("9")) answer++;
        }
        return answer;
    }
}