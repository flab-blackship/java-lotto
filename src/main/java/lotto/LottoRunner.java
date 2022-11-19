package main.java.lotto;

import java.util.Arrays;

public class LottoRunner {
    public static void main(String[] args) {

        LottoGenerator01 creation01 = new LottoGenerator01();
        System.out.println( creation01.limit(46));

        LottoGenerator02 creation02 = new LottoGenerator02();
        System.out.println((int) (Math.random() * 45) + 1);

        LottoGenerator03 creation03 = new LottoGenerator03();
        System.out.println( creation03.limition(45));

        LottoGenerator04 creation04 = new LottoGenerator04();
        System.out.println( creation04.bound(1,45));
        // 호출하는 방법을 모르겠어요..ㅜㅜ
    }
}
