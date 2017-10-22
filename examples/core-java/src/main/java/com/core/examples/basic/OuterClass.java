package com.core.examples.basic;

/**
 * Created by 609072804 on 15/10/2017.
 */
public class OuterClass {

    private class InnerClass {


        public void sayHello() {
            System.out.println("Hello");
        }
    }

    public InnerClass callInnerClass(){

        InnerClass ic = new InnerClass();

        return ic;
    }

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.callInnerClass().sayHello();
    }
}


