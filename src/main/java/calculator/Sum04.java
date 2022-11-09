package main.java.calculator;

public class Sum04 {
    //숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환

    public static int sum( int c){

        return c;
    }

    public static void main(String[] args) {

        String numbers = "7,11";
        int a = Integer.parseInt(numbers.substring(0));
        int b = Integer.parseInt(numbers.substring(2,3));
        int c = a + b;

    }
}
