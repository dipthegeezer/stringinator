package org.dipthegeezer.stringinator.converter;


import org.dipthegeezer.stringinator.NumberTooLargeException;

public class LessThanOneHundredConvertToWords implements ConvertToWords {

    private static final String[] numNames = {
            "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final LessThanTwentyConvertToWords lessThanTwentyConvertToWords = new LessThanTwentyConvertToWords();

    public String convert(Integer number) throws NumberTooLargeException {
        if(number > 99) throw new NumberTooLargeException("Number too large for this converter: " + number);

        if (number < 20) {
            return lessThanTwentyConvertToWords.convert(number);
        }
        String s = numNames[number / 10 - 2];
        if (number % 10 == 0) {
            return s;
        }
        return s + " " + lessThanTwentyConvertToWords.convert(number % 10);
    }
}
