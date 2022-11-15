package main.java.calculator;

public class Exception01 {
    //음수를 전달할 경우 RuntimeException 예외가 발생

    public static int reset( int i){

        int reset = 0;
        try {
            for ( i =0; i >=0; i++ ){
              reset *= i;
            }
        } catch (Exception e) {
            System.out.println("음수를 전달하였습니다.");
        }
        return 0;
    }
    public static void main(String[] args) {

        System.out.println(1);
    }
}
