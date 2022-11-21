package main.java.calculator;

public class Semicolon01 {
    //구분자를 컴마(,) 이외에 콜론(:)을 사용 가능

    public static void main(String[] args) {

        String numbers =  " 7,11;15";
        String number1 = numbers.split(",")[0];
        String number2 = numbers.split(";")[1];
        String number3 = numbers.split("")[2];

        System.out.println(number3);
    }
}
//number1=7, number2=15, number3= ,으로 출력 되는데 이유가 궁금해요.
/* String number3 = numbers.split("")[2];에서 마지막은 구분자가 없고 몇번째인지만 알고 싶은데
이렇게 사용하는게 맞는 건지 모르겠어요.("")[2];
 */

