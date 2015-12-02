package org.dipthegeezer.stringinator.converter;

import org.dipthegeezer.stringinator.NumberTooLargeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LessThanOneThousandConvertToWordsTest {

    ConvertToWords convertToWords = new LessThanOneThousandConvertToWords();

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
    }

    @Test(expected=NumberTooLargeException.class)
    public void testNumberTooLargeException() throws Exception {
        convertToWords.convert(1001);
    }
}