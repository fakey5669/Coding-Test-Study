import java.util.*;

class Solution {
    public int[] solution(int money) {
        Cupcalculate cup=new Cupcalculate();
        Exchange cash=new Exchange();
        int[] answer = {cup.cupcalculate(money), cash.exchange(money)};
        return answer;
    }
}
class Cupcalculate implements Sol {
    int cup = 0;
    
    public int cupcalculate(int money){
        this.cup = money/5500;
        return cup;
    }
        
        public int exchange(int money){
        return 0;
    }
}

class Exchange implements Sol {
    int exchange = 0;
    
    public int cupcalculate(int money){
      return 0;
    }
    public int exchange(int money){
        this.exchange = money%5500;
        return exchange;
    }
}
interface Sol{
    int exchange(int money);
    int cupcalculate(int money);
}
class Main {
	public static void main(String[] args) {
		int money=0;
		Scanner scanner=new Scanner(System.in);
		money=scanner.nextInt();
		Solution s=new Solution();
		int[] arr=s.solution(money);
		System.out.println(Arrays.toString(arr));
	}
}