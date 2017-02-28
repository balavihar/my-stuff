package com.vihar.geb;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<String> l = new ArrayList<String>();
        l.add("test");
        
        l.forEach(str -> System.out.println(str));

        try {
            get();
            //getException();
        } catch (Exception e){
            System.out.println("Exception");
            e.printStackTrace();
        }
    }

    private static void get() {
        getException();
    }

    private static void getException() {
        //try {
            throw new NullPointerException();
        /*} catch (Exception e) {
            throw e;
        }*/
    }
}
