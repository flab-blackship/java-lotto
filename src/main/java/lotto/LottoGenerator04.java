package main.java.lotto;

import java.util.stream.IntStream;

public class LottoGenerator04 {

    public int[] bound (int start, int end){

        int [] arr = IntStream.range( start, end).toArray();
        return arr;
    }
    }
