package records;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Decimals {
    public static void main(String[] args) {
        double valueA = 0.3;
        double valueB = 0.1;

        System.out.println(valueA / valueB);


        BigDecimal valueA2 = new BigDecimal("0.3");
        BigDecimal valueB2 = new BigDecimal("0.11");

        BigDecimal result = valueA2.divide(valueB2, RoundingMode.HALF_UP);

        System.out.println(result);

        System.out.println(valueA2.add(valueB2));
        System.out.println(valueA2.subtract(valueB2));
        System.out.println(valueA2.multiply(valueB2));

        BigDecimal valueC = new BigDecimal("0.6849899619625");

        System.out.println(valueC.setScale(3, RoundingMode.HALF_UP));

    }
}
