import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public String solution(String s) {
        String answer = ""; 
		char[] charArr = s.toCharArray();
		Arrays.sort(charArr); 
		
		List list = new ArrayList<>();
		for (int i = 0; i < charArr.length; i++) {
			list.add(String.valueOf(charArr[i]));
		}

		int start_idx = 0;
		int end_idx = 1;
		
		while(start_idx < end_idx && end_idx < list.size()) { 
			if(list.get(start_idx).equals(list.get(end_idx))) {
				list.removeAll(Arrays.asList(list.get(start_idx)));
			}
			else if(list.get(start_idx) != list.get(end_idx) ) {
				start_idx++;
				end_idx++;
			}
		}
        return String.join("", list);
    }
}