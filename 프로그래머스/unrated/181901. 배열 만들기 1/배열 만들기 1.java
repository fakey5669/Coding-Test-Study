class Solution {
    public int[] solution(int n, int k) {
        int length=n/k, idx=0;
        int[] answer =new int[length];
        for(int i=1;i<=n;i++){
            if(i%k==0){
                answer[idx]=i;
                idx++;
            }
        }
        return answer;
    }
}