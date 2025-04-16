class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String s2=s.toLowerCase();
        int pnum=0;
        int ynum=0;
        
        String[] sArray = s2.split("");
        
        for(int i = 0; i<sArray.length ; i++){
            if(sArray[i].equals("p")) pnum++;
            else if(sArray[i].equals("y")) ynum++;
        }

        if(pnum!=ynum) answer=false; 
        return answer;
    }
}