import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumArrayTests {
    @Test
    public void testSumArrayWithPositiveNumbers(){
        int[] numbers = {1, 3, 5};
        int resultPositive = SumArray.sumArray(numbers);
        assertEquals(9, resultPositive);
    }

    @Test
    public void testSumArrayWithNegativeNumbers(){
        int[] numbers = {-1, -3, -5};
        int resultNegative = SumArray.sumArray(numbers);
        assertEquals(-9, resultNegative);
    }

    @Test
    public void testSumArrayWithMixedNumbers(){
        int[] numbers = {-1, 3, -5, 7};
        int resultMixed = SumArray.sumArray(numbers);
        assertEquals(4, resultMixed);
    }

    @Test
    public void testSumArrayEmptyArray(){
        int[] numbers = {};
        int resultEmpty = SumArray.sumArray(numbers);
        assertEquals(0, resultEmpty);
    }
}
