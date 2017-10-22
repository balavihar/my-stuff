package com.core.examples.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 609072804 on 01/09/2017.
 */
public class StreamsEx1 {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1,2,3,4);

        List<Integer> myIds = ids.stream().map(id -> getMyId(id)).collect(Collectors.toList());
        System.out.println(myIds);
    }

    private static int getMyId(int id) {

        return 5 + id;
    }
}
