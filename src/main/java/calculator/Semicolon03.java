package main.java.calculator;

public class Semicolon03 {
    //구분자를 컴마(,) 이외에 콜론(:)을 사용 가능
    public static int sum( int a, int b, int c){
        System.out.println( a+b+c);
        return a+b+c;
    }



    public static void main(String[] args) {
        String numbers = "7,11;15";
        String number1 = numbers.split(",|;")[0];
        int a = Integer.parseInt(number1);
        String number2 = numbers.split(",|;")[1];
        int b = Integer.parseInt(number2);
        String number3 = numbers.split(",|;")[2];
        int c = Integer.parseInt(number3);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }


}
