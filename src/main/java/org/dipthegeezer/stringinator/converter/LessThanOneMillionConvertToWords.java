package org.dipthegeezer.stringinator.converter;


public class LessThanOneMillionConvertToWords implements ConvertToWords {

    private LessThanOneThousandConvertToWords lessThanOneThousandConvertToWords = new LessThanOneThousandConvertToWords();

    public String convert(Integer number) throws Exception {
        if (number > 999999) throw new Exception("Number too large for this converter: " + number);
        if (number <= 999) {
            return lessThanOneThousandConvertToWords.convert(number);
        }
        else if (number % 1000 == 0) {
            return lessThanOneThousandConvertToWords.convert(number / 1000) + " thousand";
        }
        else {
            return lessThanOneThousandConvertToWords.convert(number / 1000) + " thousand"
                    //Deal with numbers like 900000100 and 900000099
                    + (number % 1000 <= 99 || (number%1000)%100==0? " and " : " ")
                    + lessThanOneThousandConvertToWords.convert(number % 1000);
        }
    }
}
