package main.java.calculator;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Custom02 {
    //  “//”와 “\n” 문자 사이에 커스텀 구분자를 지정 가능
    public static void main(String[] args) {

        String numbers = "//789\n";
        StringJoiner custom = new StringJoiner("//|\n");

        System.out.println(custom.add(numbers));

    }

    }

