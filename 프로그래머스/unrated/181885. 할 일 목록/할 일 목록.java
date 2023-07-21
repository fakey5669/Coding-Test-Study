import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> unfinishedList = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                unfinishedList.add(todo_list[i]);
            }
        }

        return unfinishedList.toArray(new String[0]);
    }
}