import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String arr = my_string.replaceAll("[^0-9]", "");
        String[] arr2 = arr.split("");
        Arrays.sort(arr2);
        int[] answer=new int[arr2.length];
        for(int i=0;i<arr2.length;i++){
            answer[i]=Integer.valueOf(arr2[i]);
        }
        return answer;
    }
}