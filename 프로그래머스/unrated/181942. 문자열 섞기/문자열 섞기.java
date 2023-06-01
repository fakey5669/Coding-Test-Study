class Solution {
    public String solution(String str1, String str2) {
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        int num1=0; int num2=0;
        String answer = "";
        for(int i=0;i<2*str1.length();i++){
            if(i%2==0){
                answer+=arr1[num1];
                num1++;
            }
            else if(i%2!=0){
                answer+=arr2[num2];
                num2++;
            }
        }
        return answer;
    }
}