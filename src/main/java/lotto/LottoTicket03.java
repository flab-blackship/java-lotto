package main.java.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoTicket03 {

    private int times = 6;

    public int lottonumbers( int num){

        Set<Integer> set = new HashSet<>();
        for (int i = 0; set.size() == times; i++ ){
            Random random = new Random();
            int numbers = random.nextInt(num);
            set.add(numbers);
        }
        return num;
    }
}
