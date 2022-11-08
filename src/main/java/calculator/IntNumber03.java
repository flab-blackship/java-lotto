package main.java.calculator;

public class IntNumber03 {


    //숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환
    public static int number ( int N ){
        return N;
    }
    public static void main(String[] args) {

        String number = "11";
        int N = Integer.parseInt( number );
        System.out.println( N );



    }
}
