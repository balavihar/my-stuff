package com.core.examples.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 609072804 on 28/11/2017.
 */
public class CollectionExamples {

    public static void main(String[] args) {
        System.out.println("Added to test pull request...");
    }

    public static List<PersonCollections> getDataList() {
        List<PersonCollections> l = new ArrayList();

        l.add(new PersonCollections(1, "a1"));
        l.add(new PersonCollections(1, "a2"));
        l.add(new PersonCollections(1, "a3"));

        l.add(new PersonCollections(2, "b1"));
        l.add(new PersonCollections(2, "b2"));
        l.add(new PersonCollections(2, "b3"));

        return l;
    }
}

class PersonCollections {

    private Integer key;
    private String name;

    PersonCollections(Integer key, String name){
        this.key = key;
        this.name = name;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}