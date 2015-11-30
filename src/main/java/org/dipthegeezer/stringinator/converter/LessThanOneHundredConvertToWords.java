package org.dipthegeezer.stringinator.converter;


public class LessThanOneHundredConvertToWords implements ConvertToWords {

    private static final String[] numNames = {
            "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private ConvertToWords convertToWords = new LessThanTwentyConvertToWords();

    public String convert(Integer number) throws Exception {
        if (number < 20) {
            return convertToWords.convert(number);
        }
        String s = numNames[number / 10 - 2];
        if (number % 10 == 0) {
            return s;
        }
        return s + " " + convertToWords.convert(number % 10);
    }
}
