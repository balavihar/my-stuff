package com.core.example.patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 609072804 on 09/05/2017.
 */
public class MatcherPatterns {

    public static final String REGEX_PATTERN = "[a-zA-Z0-9_\u4e00-\u9faf]+";
    //public static final String KANJI_REGEX_PATTERN = "[a-zA-Z0-9_\\x3400-\\x4DB5\\x4E00-\\x9FCB\\xF900-\\xFA6A]+";
    //public static final String KANJI_REGEX_PATTERN = "[a-zA-Z0-9_][\u3000-\u303F]|[\u3040-\u309F]|[\u30A0-\u30FF]|[\uFF00-\uFFEF]|[\u4E00-\u9FAF]|[\u2605-\u2606]|[\u2190-\u2195]|\u203B";
    //public static final String KANJI_REGEX_PATTERN = "[a-zA-Z0-9_]+[\\p{InHiragana}]+";//"[\\p{InHan}\\p{InHiragana}\\p{InKatakana}]";
    public static final String KANJI_REGEX_PATTERN = "[a-zA-Z0-9_\u4e00-\u9faf|\u3000-\u303F|\u3040-\u309F|\u30A0-\u30FF|\uFF00-\uFFEF|\u4E00-\u9FAF|\u2605-\u2606|\u2190-\u2195|\u203B]+";
    // [\x3400-\x4DB5\x4E00-\x9FCB\xF900-\xFA6A]
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

        System.out.println(matchesRegExp(REGEX_PATTERN, "こんにちは"));

        System.out.println("Kanji : " + matchesRegExp(KANJI_REGEX_PATTERN, "なにげない日々。"));

        System.out.println("Kanji : " + matchesRegExp(KANJI_REGEX_PATTERN, "会话管理器"));

        System.out.println("Kanji 1 : " + matchesRegExp(REGEX_PATTERN, "なにげない日々。"));

        System.out.println(matchesRegExp("[0-9#]*", "234"));

        System.out.println(matchesRegExp("[0-9#]*", "234adads"));

        System.out.println(matchesRegExp("[0-9#]*", "adads"));

        System.out.println(matchesRegExp("[0-9#]*", "1234#"));

        System.out.println(matchesRegExp("[0-9#]*", "234#5345#7567#"));

        System.out.println(matchesRegExp("[0-9#]*", "12341234#sxfgsdg"));

        Long i = new Long(99999999);

        System.out.println(i.equals(99999999L));
    }

    public static void main1(String[] args) {

        String testStr = null;

        testStr = "Test String";

        System.out.println(testStr.toString());

        List<Person> l = new ArrayList<>();
        l.add(new Person("aaa", "111"));
        l.add(new Person("bbb", "222"));
        l.add(new Person("ccc", "333"));
        l.add(new Person("ccc", "444"));

        String finalStr = l.stream()
                .map(p -> {
                    if(true)
                        return "  ".concat(p.name).concat(" = '").concat(p.nickName).concat("' and ");
                    else
                        return "  ".concat(p.name).concat(" = '").concat(p.nickName).concat("' and ");
                })
                .reduce(String::concat)
                .map(s -> s.substring(0, s.lastIndexOf("and")))
                .orElse("");

        System.out.println(finalStr);
        //System.out.println(finalStr.substring(0, finalStr.lastIndexOf("and")));

        System.out.println(finalStr.replace("asdasdasd", "zzzzzzzzzzz"));
    }
}

class Person {
    public String name;
    public String nickName;

    Person(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }
}