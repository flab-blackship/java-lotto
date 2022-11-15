package main.java.calculator;

public class Exception03 extends Throwable {
    //음수를 전달할 경우 RuntimeException 예외가 발생

    //Runner클래스를 사용하기 위해 작성
    public int exception( String number ){
        int plus = Integer.parseInt( number);
        int resest = 1;
        return plus;

    }
    //try catch사용하기 위해 작성
    public static void main(String[] args) {
        //양수일 경우
        try {
            for ( int i = 0; i >= 0; i++){
            }
            //음수일 경우
        }catch (Exception e){
            System.out.println("음수를 전달하였습니다.");
        }
    }

}
