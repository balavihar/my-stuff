package com.core.example.patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 609072804 on 09/05/2017.
 */
public class MatcherPatterns {

    public static final String REGEX_PATTERN = "[a-zA-Z0-9_\u4e00-\u9faf]+";
    //"[a-zA-Z0-9_一-龯]+";//"[zenkaku 全角]";//"[a-zA-Z0-9_]+";

    private static boolean matchesRegExp(final String regExp, String str) {

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(matchesRegExp(REGEX_PATTERN, "$&£*$£"));

        System.out.println(matchesRegExp(REGEX_PATTERN, "sas12_sdad67"));

        System.out.println(matchesRegExp(REGEX_PATTERN, "漢字"));

        System.out.println("test "+matchesRegExp(REGEX_PATTERN, "テスト"));

        System.out.println(matchesRegExp(REGEX_PATTERN, "角丅"));

        System.out.println(matchesRegExp(REGEX_PATTERN, "漢字日本語文字言語言葉"));
    }
}
