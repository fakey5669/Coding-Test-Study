class Solution {
    public int solution(int[] num_list) {
        int sum=0; int avg=1;
        for(int i=0;i<num_list.length;i++){
            sum=sum+num_list[i];
        }
        for(int i=0;i<num_list.length;i++){
            avg=avg*num_list[i];
        }
        if(avg<sum*sum)
            return 1;
        else
            return 0;
    }
}