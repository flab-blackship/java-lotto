package main.java.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoTicket02 {

    public int lottonumbers ( int num){

        Random random = new Random();
        return random.nextInt(num)+1;
    }
}
/* ramdom.nextInt(45)를 이용하여 1~45사이의 랜덤숫자를 출력
2.Set을 이용하여 6개의 중복되지 않는 숫자를 출력
3.Set의 add메소드보다는 for문을 사용하여 6개의 숫자를 출력
 */
//Set을 어찌 사용해야하는 지 모르겠어요..ㅜ
