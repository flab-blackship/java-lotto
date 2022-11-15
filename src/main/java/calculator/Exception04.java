package main.java.calculator;

public class Exception04 {
    //음수를 전달할 경우 RuntimeException 예외가 발생

    public int exception( int minus){

        int reset = 1;

        try {
            for ( int i =0; i >= 0; i++){
                //여기에 어떤게 들어가야하는 지 모르겠어요..ㅜㅜ
            }
        }catch ( RuntimeException e){
            System.out.println("음수를 전달하였습니다.");
        }
        return reset;
    }

}
// public int exception에서 exception가 Runner클래스에서 작용이 안되요..
