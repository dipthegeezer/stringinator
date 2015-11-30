package org.dipthegeezer.stringinator.converter;

import org.dipthegeezer.stringinator.StringinatorApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleDigitConvertToWordsTest {

    ConvertToWords convertToWords = new SingleDigitConvertToWords();

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
        assertEquals("nine", convertToWords.convert(1000000019));
    }
}