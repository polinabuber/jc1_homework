package part4.task14;

import java.math.BigInteger;

public class DoWhile {
    public static void main(String[] args) {
        int num = 1;
        BigInteger m = BigInteger.ONE;
        do {
            m = m.multiply(BigInteger.valueOf(num));
            num++;
        } while (num <= 25);
        System.out.println(m);

    }
}
