import java.util.Arrays;

class Solution {
    public int solution(int n, String control){

        char[] charArray = new char[control.length()];
        for (int i = 0; i < control.length(); i++) {
            charArray[i] = control.charAt(i);
        }

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'w')
                n += 1;
            else if (charArray[i] == 's')
                n -= 1;
            else if (charArray[i] == 'd')
                n += 10;
            else if (charArray[i] == 'a')
                n -= 10;
        }
        return n;
    }
}
