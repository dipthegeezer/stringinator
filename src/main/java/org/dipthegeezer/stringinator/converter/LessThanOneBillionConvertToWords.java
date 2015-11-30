package org.dipthegeezer.stringinator.converter;


public class LessThanOneBillionConvertToWords implements ConvertToWords {

    private LessThanOneMillionConvertToWords lessThanOneMillionConvertToWords = new LessThanOneMillionConvertToWords();

    public String convert(Integer number) throws Exception {
        System.out.println(number % 1000000);

        if (number <= 999999) {
            return lessThanOneMillionConvertToWords.convert(number);
        }
        else if (number % 1000000 == 0) {
            return lessThanOneMillionConvertToWords.convert(number / 1000000) + " million";
        }
        else {
            return lessThanOneMillionConvertToWords.convert(number / 1000000) + " million"
                    + (number % 1000 <= 99 ? " and " : " ")
                    + lessThanOneMillionConvertToWords.convert(number % 1000000);
        }
    }
}