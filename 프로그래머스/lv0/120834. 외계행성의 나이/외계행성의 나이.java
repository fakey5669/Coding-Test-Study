import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(int age) {
        String answer = "";
        char ch='a';
        int num = 0;
        Map<Integer,Character> map= new HashMap<>();
        for(int i = 0;i<10;i++){
            map.put(num++,ch++);
        }
        int hund=age/100, ten = (age % 100) / 10, one = age % 10;
        if(age==1000)
            answer="baaa";

        else if(hund!=0){
            answer+=map.get(hund).toString()+map.get(ten)+map.get(one);
        }else if(ten!=0){
            answer+=map.get(ten).toString()+map.get(one);
        }else
            answer+=map.get(one);
        return answer;
    }
}