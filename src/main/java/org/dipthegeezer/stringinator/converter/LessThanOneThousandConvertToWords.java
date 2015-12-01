package org.dipthegeezer.stringinator.converter;


public class LessThanOneThousandConvertToWords implements ConvertToWords {

    private LessThanOneHundredConvertToWords lessThanOneHundredConvertToWords = new LessThanOneHundredConvertToWords();

    public String convert(Integer number) throws Exception {
        if (number > 999) throw new Exception("Number too large for this converter: " + number);
        if (number <= 99) {
            return lessThanOneHundredConvertToWords.convert(number % 100);
        }
        else if (number % 100 == 0) {
            return lessThanOneHundredConvertToWords.convert(number / 100) + " hundred";
        }
        else {
            return lessThanOneHundredConvertToWords.convert(number / 100) + " hundred"
                    + " and "
                    + lessThanOneHundredConvertToWords.convert(number % 100);
        }
    }
}
