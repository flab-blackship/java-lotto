package main.java.calculator;

import java.util.Scanner;

public class Intnumber02 {
    public static void main(String[] args) {
        //숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환

        System.out.println("숫자를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String intString = scanner.nextLine();
        int number = Integer.parseInt(intString);

        System.out.println(number);

    }
}
