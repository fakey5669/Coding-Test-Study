class Solution {
    public long solution(long n) {
        long x = 1;
        while (x * x <= n) {
            if (x * x == n) return (x + 1) * (x + 1);  // 바로 리턴!
            x++;
        }
        return -1;
    }
}