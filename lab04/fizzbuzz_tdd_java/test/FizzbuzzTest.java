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
}