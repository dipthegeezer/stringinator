package org.dipthegeezer.stringinator.converter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LessThanOneBillionConvertToWordsTest {

    ConvertToWords convertToWords = new LessThanOneBillionConvertToWords();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testConvert() throws Exception {
        assertEquals("one", convertToWords.convert(1));
        assertEquals("zero", convertToWords.convert(0));
        assertEquals("thirteen", convertToWords.convert(13));
        assertEquals("twenty one", convertToWords.convert(21));
        assertEquals("ninety nine", convertToWords.convert(99));
        assertEquals("one hundred and five", convertToWords.convert(105));
        assertEquals("one hundred and twenty three", convertToWords.convert(123));
        assertEquals("one thousand and forty two", convertToWords.convert(1042));
        assertEquals("one thousand one hundred and five", convertToWords.convert(1105));
        assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine",
                convertToWords.convert(999999));
        assertEquals("nine hundred thousand and nine",
                convertToWords.convert(900009));
        assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one",
                convertToWords.convert(56945781));
        assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",
                convertToWords.convert(999999999));
        assertEquals("nine hundred million",
                convertToWords.convert(900000000));
        assertEquals("nine hundred million and ninety nine",
                convertToWords.convert(900000099));
        assertEquals("nine hundred million and one hundred thousand",
                convertToWords.convert(900100000));
        assertEquals("nine hundred million and one hundred",
                convertToWords.convert(900000100));
        assertEquals("nine hundred million and ten thousand",
                convertToWords.convert(900010000));
        assertEquals("nine hundred million and one thousand",
                convertToWords.convert(900001000));
    }

    @Test(expected=Exception.class)
    public void testNumberTooLargeException() throws Exception {
        convertToWords.convert(1000000000);
    }
}