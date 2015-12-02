package org.dipthegeezer.stringinator.converter;


import org.dipthegeezer.stringinator.NumberTooLargeException;

public class LessThanTwentyConvertToWords implements ConvertToWords{

    private static final String[] numNames = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    public String convert(Integer number) throws NumberTooLargeException {
        if (number < 20) {
            return numNames[number];
        }
        throw new NumberTooLargeException("Number too large for this converter: " + number);
    }
}
