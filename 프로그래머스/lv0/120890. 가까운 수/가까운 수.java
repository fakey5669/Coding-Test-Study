class Solution {
    public int solution(int[] array, int n) {
        int closestNumber = array[0];
        int minDiff = Math.abs(n - closestNumber);

        for (int num : array) {
            int diff = Math.abs(n - num);
            if (diff < minDiff) {
                minDiff = diff;
                closestNumber = num;
            } else if(diff==minDiff){
                closestNumber = closestNumber>num ? num : closestNumber;
            }
        }

        return closestNumber;
    }
}