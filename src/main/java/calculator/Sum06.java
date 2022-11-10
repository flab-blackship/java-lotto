package main.java.calculator;

public class Sum06 {
    //숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환

    public static void main(String[] args) {

        String numbers = "7,11";
        String [] number = numbers.split(",");

        for (int i = 0; i < number.length; i++){
            System.out.println( number[i]);

        }
    }

}
