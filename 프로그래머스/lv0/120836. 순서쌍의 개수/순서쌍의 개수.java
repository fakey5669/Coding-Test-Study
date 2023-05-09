class Solution {
    int answer = 0;
    public int solution(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0)
                this.answer++;
        }
        return this.answer;
    }
}

class Main{
    static public void main(String args[]){
        Solution s = new Solution();
        s.solution(1);
    }
}