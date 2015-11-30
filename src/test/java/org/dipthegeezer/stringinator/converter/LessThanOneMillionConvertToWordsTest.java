package org.dipthegeezer.stringinator.converter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LessThanOneMillionConvertToWordsTest {

    ConvertToWords convertToWords = new LessThanOneMillionConvertToWords();

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
        assertEquals("nine hundred thousand and nine hundred",
                convertToWords.convert(900900));
    }
}