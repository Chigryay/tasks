package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal n1 = new BigDecimal("100");
        BigDecimal n2 = BigDecimal.valueOf(50.33);

        System.out.println(n1.divide(n2, -1, RoundingMode.HALF_UP));
    }
}
