    class Solution {
        public int solution(int a, int b) {
            String sum = ""+a+b;
            int answer = Integer.valueOf(sum);
            int mul=2*a*b;

            return (answer>=mul)?answer:(mul);
        }
    }