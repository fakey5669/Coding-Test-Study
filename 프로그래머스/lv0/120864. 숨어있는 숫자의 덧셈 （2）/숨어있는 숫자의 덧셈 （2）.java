class Solution {
    public int solution(String my_string) {
        String[] numbers = my_string.split("\\D+");

        int sum = 0;
        for (String num : numbers) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }

        return sum;
    }
    
}