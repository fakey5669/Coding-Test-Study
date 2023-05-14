import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> dbmap=new HashMap<String, String>();
        
        for(String[] strings:db){
            dbmap.put(strings[0], strings[1]);
        }
        
        if(dbmap.containsKey(id_pw[0])){
            if(dbmap.get(id_pw[0]).equals(id_pw[1]))
              return "login";
            else
              return "wrong pw";
        }
        else
            return "fail";
    }
}