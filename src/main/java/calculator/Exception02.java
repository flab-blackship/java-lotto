package main.java.calculator;

public class Exception02 {
    //음수를 전달할 경우 RuntimeException 예외가 발생
    /* 1. try catch 사용하기
       2. 음수 구별하기
       3. RuntimeException사용하기
       음수일 경우 "음수를 전달하였습니다."
       4.궁금한점: 아무값을 넣는 건지, 아무값이 넣어지는 건지 어떻게 설정을 해야할 지 모르겠어요.
                 메인메소드와 메소드를 사용하고 싶은데
                 이미 메소드안에서 다 실행이 되게해 되버려서 메인메소드에서 어떤걸 출력해야하는 지 모르겠어요.
                 runner는 함수값이 두개인데 Exception에서도 함수를 두개로 해야하는데 하나는 정수 하나는 음수로 하면 되나요?아니면
                 Exception class에서 parameter값을 하나로 하면 되는 건가요?
     */

    public static int number(int plus) {
        int i = 1;
        return i;
    }

    public static void main(String[] args) {

        for ( int i =0; i >= 0; i++) {
        }
    }
}





