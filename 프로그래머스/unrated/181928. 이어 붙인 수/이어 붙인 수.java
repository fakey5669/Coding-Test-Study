class Solution {
    public int solution(int[] num_list) {
        String evensum=""; String oddsum="";
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0)
                evensum+=num_list[i];
            else if(num_list[i]%2!=0)
                oddsum+=num_list[i];
        }
        return Integer.valueOf(oddsum)+Integer.valueOf(evensum);
    }
}