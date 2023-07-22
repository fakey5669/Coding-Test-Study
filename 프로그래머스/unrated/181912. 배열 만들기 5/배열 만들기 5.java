import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        int idx=0;
        for(String str : intStrs){
            int a=Integer.valueOf(str.substring(s,s+l));
            if(a>k){
                list.add(a);
                }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}