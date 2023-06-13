class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddsum = 0, evensum = 0;
        for(int i=0;i<num_list.length;i=i+2){
            oddsum+=num_list[i];
        }
        for(int i=1;i<num_list.length;i=i+2){
            evensum+=num_list[i];
        }
        if(oddsum>=evensum)
            answer=oddsum;
        else if(oddsum<evensum)
            answer=evensum;
        return answer;
    }
}