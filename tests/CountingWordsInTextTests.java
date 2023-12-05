import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingWordsInTextTests {
    @Test
    public void testCountWordsWithPunctuationMark() {
        String text = "Ala ma kota, kota ma Ala";
        HashMap<String, Integer> countWordsResult = CountingWordsInText.countWords(text);
        HashMap<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("ala", 2);
        expectedResult.put("ma", 2);
        expectedResult.put("kota", 2);

        assertEquals(expectedResult, countWordsResult);
    }

    @Test
    public void testCountWordsWithEmptyString(){
        String text = "";
        HashMap<String, Integer> expectedResult = new HashMap<>();
        HashMap<String, Integer> countWordsResult = CountingWordsInText.countWords(text);

        assertEquals(expectedResult, countWordsResult);
    }

    @Test
    public void testCountWordsWithNull(){
        String text = null;
        HashMap<String, Integer> expectedResult = new HashMap<>();
        HashMap<String, Integer> countWordsResult = CountingWordsInText.countWords(text);

        assertEquals(expectedResult, countWordsResult);
    }
}
