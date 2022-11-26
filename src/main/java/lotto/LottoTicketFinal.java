package main.java.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoTicketFinal {

    //1~45 숫자 출력  runner에 45 입력
    //6개 숫자 출력   runner에 6 입력
    //중복하지 않는다
    // 당첨번호와 비교해서 일치하는 개수를 반환한다 (ArrayList.contains())

    private int limitNumbers;
    //runner에 45입력
    public int lottonumbers ( int lottonumber, int times){
        if ( lottonumber != limitNumbers){
            System.out.println("올바른 숫자를 입력하세요.");
        }else {
            for (int i = 0; i <= lottonumber; i++) {
                Random random = new Random();
                int randomnumber = random.nextInt(lottonumber) + 1;
                //int randomnumber = random.nextInt(lottonumber)+1;을 6번 출력
                // runner에 6 입력
                Set<Integer> picknumbers = new HashSet<>();
                while (picknumbers.size() <= times) {
                    picknumbers.add(randomnumber);
                }
                return randomnumber;
            }
        }
       return lottonumber;
    }
}





