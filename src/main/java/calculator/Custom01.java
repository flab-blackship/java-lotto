package main.java.calculator;

import java.util.regex.Pattern;

public class Custom01 {
    //   “//”와 “\n” 문자 사이에 커스텀 구분자를 지정 가능

    public static void main(String[] args) {

        String numbers = "//1,2;3\n";
        String pattern = "^[0-9]*$";//숫자만
        String val = "123456789";//대상 문자열

        boolean regex = Pattern.matches(pattern, val);

        System.out.println(regex);


    }
}
