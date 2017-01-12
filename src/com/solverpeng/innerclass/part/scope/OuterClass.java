package com.solverpeng.innerclass.part.scope;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class OuterClass {
    private int age = 12;

    public void print(final boolean x, final String value) {
        final String name = "lily";
        if (x) {
            class InnerClass {
                public void print() {
                    System.out.println(name);
                    System.out.println(value);
                    System.out.println(age);
                }
            }
            new InnerClass().print();
        }

    }
}
