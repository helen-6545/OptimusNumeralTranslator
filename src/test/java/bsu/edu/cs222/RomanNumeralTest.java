package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RomanNumeralTest {

    @Test
    public void OutOfRangeTestLow() {
        int input = 0;
        boolean test=RomanNumeralTranslator.OutOfRangeCheck(input);
        Assertions.assertFalse(test);
    }

    @Test
    public void OutOfRangeTestHigh() {
        int input = 3001;
        boolean test=RomanNumeralTranslator.OutOfRangeCheck(input);
        Assertions.assertFalse(test);
    }

    @Test
    public void TestFive() {
        int input = 5;
        String test=RomanNumeralTranslator.onesTranslator(input);
        Assertions.assertEquals("V", test);
    }

    @Test
    public void TestEight() {
        int input = 8;
        String test=RomanNumeralTranslator.onesTranslator(input);
        Assertions.assertEquals("VIII", test);
    }

    @Test
    public void TestFifty() {
        int input = 5;
        String test=RomanNumeralTranslator.tensTranslator(input);
        Assertions.assertEquals("L", test);
    }

    @Test
    public void TestTwoHundred() {
        int input = 2;
        String test=RomanNumeralTranslator.hundredsTranslator(input);
        Assertions.assertEquals("CC", test);
    }

    @Test
    public void TestOneThousand() {
        int input = 1;
        String test=RomanNumeralTranslator.thousandsTranslator(input);
        Assertions.assertEquals("M", test);
    }

    @Test
    public void Test456() {
        int input = 456;
        String test=RomanNumeralTranslator.NumeralOrganizer(input);
        Assertions.assertEquals("CDLVI", test);
    }

    @Test
    public void Test1008() {
        int input = 1008;
        String test=RomanNumeralTranslator.NumeralOrganizer(input);
        Assertions.assertEquals("MVIII", test);
    }

    @Test
    public void Test2070() {
        int input = 2070;
        String test=RomanNumeralTranslator.NumeralOrganizer(input);
        Assertions.assertEquals("MMLXX", test);
    }
}
