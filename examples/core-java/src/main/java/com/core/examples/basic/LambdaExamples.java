package com.core.examples.basic;

import java.util.function.Function;

/**
 * Created by 609072804 on 17/10/2017.
 */
public class LambdaExamples {

    public static void main(String[] args) {
        Function<Integer, Object> ex1 = x -> 1 + x;
        System.out.println(ex1.apply(5));
    }
}
