class Solution {
    public int[][] solution(int[] num_list, int n) {
        int num=0;
        int[][] arr=new int[num_list.length/n][n];
    
    for(int i=0;i<num_list.length/n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=num_list[num];
            num++;
            }
        }
        return arr;
    }
}

