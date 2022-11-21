package main.java.calculator;

public class Sum05 {
    //숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환

    public static void main(String[] args) {

        String numbers = "7,11";
        String number1 = numbers.split(",")[0];
        int a = Integer.parseInt(number1);
        String number2 = numbers.split(",")[1];
        int b = Integer.parseInt(number2);

        System.out.println( a + b);

    }
}
