package org.dipthegeezer.stringinator.converter;


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

    public String convert(Integer number) throws Exception {
        if (number < 20) {
            return numNames[number];
        }
        throw new Exception("Number too large for this converter: " + number);
    }
}
