package org.dipthegeezer.stringinator.converter;


public class LessThanOneMillionConvertToWords implements ConvertToWords {

    private LessThanOneThousandConvertToWords lessThanOneThousandConvertToWords = new LessThanOneThousandConvertToWords();

    public String convert(Integer number) throws Exception {
        if (number <= 999) {
            return lessThanOneThousandConvertToWords.convert(number);
        }
        else if (number % 1000 == 0) {
            return lessThanOneThousandConvertToWords.convert(number / 1000) + " thousand";
        }
        else {
            return lessThanOneThousandConvertToWords.convert(number / 1000) + " thousand"
                    + (number % 1000 <= 99 ? " and " : " ")
                    + lessThanOneThousandConvertToWords.convert(number % 1000);
        }
    }
}
