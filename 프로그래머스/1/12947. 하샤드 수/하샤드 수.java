class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int tmp = 0;
        int tmp2 = x;
        int sum = 0;
        
        while(tmp2>=10){
            tmp=tmp2%10;
            tmp2=tmp2/10;
            sum += tmp;
        }
        sum += tmp2;
        
        return x%sum==0;
    }
}