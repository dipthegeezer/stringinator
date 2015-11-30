package org.dipthegeezer.stringinator.converter;


public class TeenDigitConvertToWords implements ConvertToWords {

    private static final String[] numNames = {
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    public String convert(Integer number) {
        return numNames[number];
    }
}
