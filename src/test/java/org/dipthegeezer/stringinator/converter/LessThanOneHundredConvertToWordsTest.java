package org.dipthegeezer.stringinator.converter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LessThanOneHundredConvertToWordsTest {

    ConvertToWords convertToWords = new LessThanOneHundredConvertToWords();

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
    }
}