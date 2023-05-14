class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a=0; int b=0; int c=0;
        a=hp/5; answer=hp%5;
        b=answer/3; answer=answer%3;
        c=answer/1;
        return a+b+c;
    }
}