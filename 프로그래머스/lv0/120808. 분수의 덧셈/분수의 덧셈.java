class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int boy = numer1*denom2+denom1*numer2;
        int mom = denom1*denom2;
        int a=56465;
        for(int i=1;i<=boy&&i<=mom;i++){
            if(boy%i==0&&mom%i==0)
                a=i;
        }
        boy=boy/a;
        mom=mom/a;
        int[] answer = {boy, mom};
        return answer;
    }
}