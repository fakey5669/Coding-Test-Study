import java.util.HashSet;
import java.util.Set;
class Solution {
    public String solution(String my_string) {
        Set<Character> uniqueChars = new HashSet<>();
        
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}