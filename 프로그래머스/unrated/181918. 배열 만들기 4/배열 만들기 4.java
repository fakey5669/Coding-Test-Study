import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int i=0;
        ArrayList<Integer> stk2 = new ArrayList<Integer>();
        
        while(i<arr.length){

        if(stk2.isEmpty()||stk2.get(stk2.size()-1)<arr[i]){
            stk2.add(arr[i]);
            i++;
        }
        else if(stk2.get(stk2.size()-1)>=arr[i]){
            stk2.remove(stk2.size()-1);
        }
    }
        
        int[] stk=new int[stk2.size()];
        for(int j=0;j<stk.length;j++){
            stk[j]=stk2.get(j);
        }
        return stk;
        
    }
}