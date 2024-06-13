import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the FizzBuzz program.
 */
public class FizzbuzzTest {
    @Test
    public void test_fizzBuzz1() {
        System.err.println(FizzBuzz.fizzingBuzzing(1));
        assertEquals("1", FizzBuzz.fizzingBuzzing(1));
    }

    @Test
    public void test_fizzBuzz2() {
        System.err.println(FizzBuzz.fizzingBuzzing(2));
        assertEquals("2", FizzBuzz.fizzingBuzzing(2));
    }

    @Test
    void test_fizzBuzz3() {
        System.err.println(FizzBuzz.fizzingBuzzing(3));
        assertEquals("Fizz", FizzBuzz.fizzingBuzzing(3));
    }

    @Test
    public void test_fizzBuzz5() {
        System.err.println(FizzBuzz.fizzingBuzzing(5));
        assertEquals("Buzz", FizzBuzz.fizzingBuzzing(5));
    }

    @Test
    public void test_fizzBuzz15() {
        System.err.println(FizzBuzz.fizzingBuzzing(15));
        assertEquals("15", FizzBuzz.fizzingBuzzing(15));
    }
}
