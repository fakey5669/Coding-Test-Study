class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] array = new int[signs.length];
        for(int i = 0 ; i<array.length ; i++){
            if(signs[i]){
                array[i]=absolutes[i];
            } else {
                array[i]=-absolutes[i];
            }
        }
        for(int i = 0 ; i<array.length ; i++){
            answer+=array[i];
        }
        return answer;
    }
}