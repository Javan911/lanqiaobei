package zhenti2013;

import java.math.BigDecimal;

public class T04 {
    public static void main(String[] args) {
        BigDecimal a;
        a = BigDecimal.ONE;
        for (int i = 0; i < 1000; i++) {
            a = BigDecimal.ONE.add(a);
            a = BigDecimal.ONE.divide(a, 101, BigDecimal.ROUND_HALF_UP);
            //System.out.println(a);
        }
        System.out.println(a.setScale(100, BigDecimal.ROUND_HALF_UP));
    }
}
