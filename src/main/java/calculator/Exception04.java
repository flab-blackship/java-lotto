package main.java.calculator;

public class Exception04 {
    //음수를 전달할 경우 RuntimeException 예외가 발생

    public int exception (int num){
        if ( num > 0) {
            return num;
        } else {
            throw new RuntimeException("음수 입니다.");
        }
    }

}
