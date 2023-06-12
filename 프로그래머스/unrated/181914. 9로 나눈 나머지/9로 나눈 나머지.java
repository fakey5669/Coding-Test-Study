class Solution {
    public int solution(String number) {
        int sum=0;
        String[] arr=number.split("");
        for(int i=0;i<number.length();i++){
            sum+=Integer.valueOf(arr[i]);
        }
        int answer = sum%9;
        return answer;
    }
}