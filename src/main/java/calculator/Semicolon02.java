package main.java.calculator;

public class Semicolon02 {
    //구분자를 컴마(,) 이외에 콜론(:)을 사용 가능

    public static void main(String[] args) {

        String numbers = "7,11;15";
        String [] number = numbers.split(",|;");

        for ( int i = 0; i < numbers.length(); i++){
            System.out.println( number[i]);
        }
    }
}

/* 출력은 7 11 15으로 출력이 됬는데 아래 Index 3 out of bounds for length 3으로 나왔어요.
나와있는 내용이 이해가 되요.( 7=0, 11=1, 15=2)
근데 이걸 어떻게 잡아야할 지 모르겠어요.

 */
