package main.java.calculator;

public class Sum04 {
    //숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환

    public int sum( String numbers, String numbers2) {
        int a = Integer.parseInt(numbers);
        int b = Integer.parseInt(numbers2);
        int c = a + b;
        return c;
    }

    public int minus( String numbers, String numbers2) {
        int a = Integer.parseInt(numbers);
        int b = Integer.parseInt(numbers2);
        int c = a - b;
        return c;
    }
}
