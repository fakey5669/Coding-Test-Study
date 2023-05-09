class Solution {
    public String solution(String rsp) {
        String answer = "";
        char array[]=new char[rsp.length()];
        
        for(int i=0;i<rsp.length();i++){
        array[i]=rsp.charAt(i);
        }
        
        for(int i=0;i<rsp.length();i++){
            if(array[i]=='2')
                answer+='0';
            else if(array[i]=='0')
                answer+='5';
            else if(array[i]=='5')
                answer+='2';
        }
        return answer;
    }
}

