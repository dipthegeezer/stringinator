package org.dipthegeezer.stringinator.converter;


public class SingleDigitConvertToWords implements ConvertToWords{

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
            "nine"
    };

    public String convert(Integer number) {
        Integer val = number % 10;
        return numNames[val];
    }
}
