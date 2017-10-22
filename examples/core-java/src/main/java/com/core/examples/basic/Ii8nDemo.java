package com.core.examples.basic;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by 609072804 on 17/08/2017.
 */
public class Ii8nDemo {

    private static final Pattern alphaNumericPattern = Pattern.compile("^[0-9]*");//Pattern.compile("^[A-Za-z0-9-\\._]*");

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\609072804\\workspace\\zet-ws\\my-stuff\\examples\\core-java\\src");
        File file1 = new File("C:\\Users\\609072804\\workspace\\zet-ws\\my-stuff\\examples\\core-java\\bin");
        ClassLoader loader = new URLClassLoader(new URL[]{file.toURI().toURL(), file1.toURI().toURL()});
        //ResourceBundle bundle = ResourceBundle.getBundle("MessageBundleFromPath", Locale.US);
        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundleFromPath", Locale.US, loader);

        System.out.println("Message in "+Locale.US +":"+bundle.getString("greeting"));

        //changing the default locale to indonasian
        Locale.setDefault(new Locale("in", "ID"));
        //bundle = ResourceBundle.getBundle("MessageBundleFromPath");
        System.out.println("Message in "+Locale.getDefault()+":"+bundle.getString("greeting"));

        String name = "testname";

        int count = 0;
        System.out.println(name + ++count);
        System.out.println(name + ++count);
        System.out.println("test_20".split("_")["test_20".split("_").length - 1]);
        test(0);

        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));

        Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

        Map<String, List<Person>> personsByName = persons
                .stream()
                .filter(p -> p.name.contains("p"))
                .collect(Collectors.groupingBy(p -> p.name));
        personsByName.forEach((pName, p) -> System.out.format("Name %s: %s\n", pName, p));

        System.out.println(personsByAge.keySet().toString());

        Matcher matcher = alphaNumericPattern.matcher("12_");
        System.out.println(matcher.matches());

        List<String> ls = new ArrayList<>();
        for(String s:ls)
            System.out.println(s);
    }

    public static int test(int val) {

        if(val <= 5){
            System.out.println(val);
            test(++val);
        }

        return val;
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}
