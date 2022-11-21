package main.java.study;

public class UserSearch {

    public String userName(String name) {
        // 정현선이 아닌 회원일 경우 "다시 입력하세요" 출력
        if ( name.equals("정현선")) {
            return name;
        } else {
            throw new RuntimeException("다시 입력하세요.");
        }
    }

    public String userPw(String pwd) {
        return pwd;
    }
}
