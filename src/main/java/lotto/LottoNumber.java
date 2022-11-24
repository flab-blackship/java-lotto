package main.java.lotto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoNumber {

    private int number;

    private LottoNumber(int number) {
        if (isOutOfRange(number)) { // true 일 경우
            throw new IllegalArgumentException("로또번호는 1부터 45까지의 자연수만 가능합니다.");
        }
        this.number = number;
    }

    public static LottoNumber from(int number) {
        return new LottoNumber(number);
    }

    private boolean isOutOfRange(int number) {
        return number < 1 || number > 45;
    }

    public int getNumber() {
        return number;
    }
}
