class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] arr=cipher.split("");
        for(int i=1;i<=cipher.length();i++){
            if(code*i>cipher.length())
                break;
            answer+=arr[code*i-1];
        }
        return answer;
    }
}