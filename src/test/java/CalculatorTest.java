import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {


    @Test
    public void sumTest_whenValue3and6_expectValue9() {
        //GIVEN
        int value1 = 3;
        int value2 = 6;

        //WHEN
        int actual = Calculator.sum(value1, value2);

        //THEN
        assertEquals(9, actual);
    }

    @Test
    public void sumTest_whenValue18and8_expectValue26() {
        //GIVEN
        int value1 = 18;
        int value2 = 8;

        //WHEN
        int actual = Calculator.sum(value1, value2);

        //THEN
        assertEquals(26, actual);
    }
}
