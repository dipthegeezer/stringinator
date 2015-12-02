package org.dipthegeezer.stringinator.converter;


import org.dipthegeezer.stringinator.NumberTooLargeException;

public class LessThanOneBillionConvertToWords implements ConvertToWords {

    private static final LessThanOneMillionConvertToWords lessThanOneMillionConvertToWords = new LessThanOneMillionConvertToWords();

    public String convert(Integer number) throws NumberTooLargeException {
        if (number > 999999999) throw new NumberTooLargeException("Number too large for this converter: " + number);
        if (number <= 999999) {
            return lessThanOneMillionConvertToWords.convert(number);
        }
        else if (number % 1000000 == 0) {
            return lessThanOneMillionConvertToWords.convert(number / 1000000) + " million";
        }
        else {
            return lessThanOneMillionConvertToWords.convert(number / 1000000) + " million"
                    //Deal with numbers like 900900 and 900099
                    + (number % 1000 <= 99|| (number%1000)%100==0 ? " and " : " ")
                    + lessThanOneMillionConvertToWords.convert(number % 1000000);
        }
    }
}
