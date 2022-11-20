package main.java.lotto;

public class LottoRunner {
    public static void main(String[] args) {
        int randomNumber = 39;
        LottoNumber lottoNumber = LottoNumber.from(randomNumber);
        System.out.println(lottoNumber.getNumber());
    }
}
