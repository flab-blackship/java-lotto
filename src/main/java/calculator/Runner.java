package main.java.calculator;

/**
 * 기능을 실행하는 클래스
 */
public class Runner {
    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();
        int answer = sc.calculate("-1:2,3");
        System.out.println("ANSWER : " + answer);
    }
}
