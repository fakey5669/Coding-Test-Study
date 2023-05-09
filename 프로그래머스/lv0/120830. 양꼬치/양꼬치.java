import java.util.Scanner;

interface Calculate{
    int solution(int n, int k);
}

abstract class Price{
   public abstract int solution(int n, int k);
}

class Solution extends Price implements Calculate {
    public int solution(int n, int k) {
        int answer = n*12000+k*2000-(n/10)*2000;
        return answer;
    }
}

class Main{
    static public void main(String args[]){
        Solution s=new Solution();
        Scanner scanner=new Scanner(System.in);
        int n,k=0;
        n=scanner.nextInt();
        k=scanner.nextInt();
        int result=s.solution(n,k);
    }
}