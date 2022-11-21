package main.java.study;

public class UserSearchRunner {
    public static void main(String[] args) {
        UserSearch userSearch = new UserSearch();

        System.out.println(userSearch.userName("정현선"));
        System.out.println(userSearch.userPw("정현선123"));
    }
}
