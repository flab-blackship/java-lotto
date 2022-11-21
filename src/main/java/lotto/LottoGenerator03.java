package main.java.lotto;

public class LottoGenerator03 {

    public int limition ( int number ){
        for ( int i = 1; i <= number; i++){
            i *= number;
        }
        return number;
    }
}
