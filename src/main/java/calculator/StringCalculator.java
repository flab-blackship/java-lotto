package main.java.calculator;

public class StringCalculator {
    private static final int ZERO = 0;
    private static final String SEPARATOR_COMMA = ",";

    public int calculate(String inputString) {
        /** 빈 문자열 또는 null 값 입력시 0 반환*/
        if (inputString == null || "".equals(inputString)) {
            return ZERO;
        }
        /** 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환 */
        if (!inputString.contains(",")) {
            return Integer.parseInt(inputString);
        }
        int calculations = ZERO;
        for (String element : inputString.split(SEPARATOR_COMMA)) {
            calculations += Integer.parseInt(element);
        }

        return calculations;
    }
}
