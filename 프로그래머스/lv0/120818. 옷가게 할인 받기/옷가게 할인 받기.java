class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(500000<=price)
            return answer=(int)(0.8*price);
        else if(300000<=price&&price<500000)
            return answer=(int)(0.9*price);
       
        else if(100000<=price&&price<300000)
            return answer=(int)(0.95*price);
     
        return price;
    }
}

class Main{
    public static void main(String args[]){
        Solution s=new Solution();
        int result=s.solution(1);
        System.out.print(result);
    }
}