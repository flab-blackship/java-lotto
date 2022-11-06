package main.java.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(stringNumber(""));;
        System.out.println(stringNumber(null));
        System.out.println(stringNumber("hello"));
    }

    // 빈 문자열 또는 null 값을 입력할 경우 0을 반환
    // 1. 메소드
    public static String stringNumber( String value ) {
        return "".equals(value) || value == null ? "0" : value;
    }

}
