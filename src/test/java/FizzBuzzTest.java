import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzTest_when4_thenReturnString3() {
        //GIVEN
        int value = 4;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(value);

        //THEN
        assertEquals("4", actual);
    }

    @Test
    public void fizzBuzzTest_when5_thenReturnStringBuzz() {
        //GIVEN
        int value = 5;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(value);

        //THEN
        assertEquals("Buzz", actual);
    }

    @Test
    public void fizzBuzzTest_when9_thenReturnStringFizz() {
        //GIVEN
        int value = 9;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(value);

        //THEN
        assertEquals("Fizz", actual);
    }

    @Test
    public void fizzBuzzTest_when15_thenReturnStringFizzBuzz() {
        //GIVEN
        int value = 15;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(value);

        //THEN
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void fizzBuzzTest_whenMinus5_thenReturnStringBuzz() {
        //GIVEN
        int value = -5;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(value);

        //THEN
        assertEquals("Buzz", actual);
    }

    @Test
    public void fizzBuzzTest_when0_thenReturnStringFizzBuzz() {
        //GIVEN
        int value = 0;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(value);

        //THEN
        assertEquals("FizzBuzz", actual);
    }
}
