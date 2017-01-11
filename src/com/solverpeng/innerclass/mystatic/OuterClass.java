package com.solverpeng.innerclass.mystatic;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class OuterClass {
    private static String outerStaticStr = "outer static string...";
    private String outerStr = "outer string...";

    public static class InnerClass {
        public static String innerStaticStr = "inner static string...";
        public static void display() {
            System.out.println("outStaticStr:" + outerStaticStr + " ,innerStaticStr:" + innerStaticStr);
        }
    }

    class InnerClass2 {
        public String innerStr = "inner string...";
        public void display() {
            System.out.println("outerStaticStr:" + outerStaticStr + " ,outerStr:" + outerStr + " ,innerStr:" + innerStr);
        }
    }

    public void display() {
        System.out.println(InnerClass.innerStaticStr);
        InnerClass.display();

        InnerClass2 innerClass2 = new OuterClass().new InnerClass2();
        innerClass2.display();
    }
}
