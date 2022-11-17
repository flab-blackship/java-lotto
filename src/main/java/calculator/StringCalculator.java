package main.java.calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    private static final int ZERO = 0;
    private static final String DEFAULT_SEPARATOR = "[,:]"; // 요구사항 2,3
    private static final String CUSTOM_SEPARATOR = "//(.)\n(.*)"; // “//”와 “\n” 문자 사이에 커스텀 구분자를 지정 가능

    public int calculate(String inputString) {

        if (checkIfEmpty(inputString)) {
            return ZERO;
        }

        Matcher m = Pattern.compile(CUSTOM_SEPARATOR).matcher(inputString);
        if (m.find()) {
            String customSeparator = m.group(1);
            String[] data = m.group(2).split(customSeparator);

            return Arrays
                    .stream(data)
                    .map(Integer::parseInt) //숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환
                    .reduce((i1, i2) -> i1 + i2)
                    .get();
        }

        return Arrays
                .stream(inputString.split(DEFAULT_SEPARATOR))
                .map(Integer::parseInt) //숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환
                .reduce((i1, i2) -> i1 + i2)
                .get();
    }

    //빈 문자열 또는 null 값을 입력할 경우 0을 반환
    private boolean checkIfEmpty(String inputString) {
        return inputString == null || "".equals(inputString);
    }
}
