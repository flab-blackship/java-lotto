package main.java.calculator;

public class Runner {
    public static void main(String[] args) {
//        Sum04 plus = new Sum04();
//        System.out.println(plus.sum("11","1"));

        Exception04 act = new Exception04();
        System.out.println(act.exception(3));

/**
 * 기능을 실행하는 클래스
 */
public class Runner {
    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();
        int answer = sc.calculate("//;\n1;2;3");
        System.out.println("ANSWER : " + answer);

    }
}
