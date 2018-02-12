package com.core.examples.basic;

import java.util.List;
import java.util.function.Function;

/**
 * Created by 609072804 on 17/10/2017.
 */
public class LambdaExamples {

    public static void main1(String[] args) {
        Function<Integer, Object> ex1 = x -> 1 + x;
        System.out.println(ex1.apply(5));
    }

    public static void main(String[] args) {

        List<String> l = null;
        for(String s : l)
            System.out.println(s);
    }
}
