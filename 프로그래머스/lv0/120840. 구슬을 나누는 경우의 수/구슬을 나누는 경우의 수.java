import java.math.BigInteger;

public class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger numerator = BigInteger.ONE;
        for (int i = balls; i > balls - share; i--) {
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }
        BigInteger denominator = BigInteger.ONE;
        for (int i = 2; i <= share; i++) {
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }
        return numerator.divide(denominator);
    }
}