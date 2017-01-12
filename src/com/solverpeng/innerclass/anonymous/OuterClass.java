package com.solverpeng.innerclass.anonymous;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class OuterClass {
    public MyInterface getMyInterface(final int num, final String str) {
        final String name = "lily";
        return new MyInterface() {
            int number = num + 3;
            @Override
            public int getNumber() {
                System.out.println("name:" + name);
                System.out.println(str);
                return number;
            }
        };
    }
}
