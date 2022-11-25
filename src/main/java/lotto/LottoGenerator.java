package main.java.lotto;

public class LottoGenerator {

    public LottoGenerator() {} // 생성자
    private int totalNum;
    // 로또번호의 범위는 1~45의 자연수
    public int limit ( int numbers) {
        for ( int i = 1; i < numbers; i++) {
            numbers = i;
            this.totalNum = numbers;
        }

        return this.totalNum;
    }

    // 로또복권의 로또번호는 중복이 없다

}
