class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        String my_string1 = my_string.substring(0, s);
        String my_string2 = my_string.substring(s, e+1);
        String my_string3 = my_string.substring(e+1, my_string.length()); 

        StringBuffer sb = new StringBuffer(my_string2);
        String reverse = sb.reverse().toString();

        answer = my_string1 + reverse + my_string3;
        return answer;
    }
}