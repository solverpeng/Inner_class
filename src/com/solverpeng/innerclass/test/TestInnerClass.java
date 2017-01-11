package com.solverpeng.innerclass.test;

import com.solverpeng.innerclass.anonymous.MyInterface;
import com.solverpeng.innerclass.field.OuterClass;
import org.junit.Test;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class TestInnerClass {
    @Test
    public void testStaticInnerClass() {
        com.solverpeng.innerclass.mystatic.OuterClass outerClass = new com.solverpeng.innerclass.mystatic.OuterClass();
        outerClass.display();
        com.solverpeng.innerclass.mystatic.OuterClass.InnerClass.display();
    }


    @Test
    public void testAnonymousInnerClass() {
        com.solverpeng.innerclass.anonymous.OuterClass outerClass = new com.solverpeng.innerclass.anonymous.OuterClass();
        MyInterface lily = outerClass.getMyInterface(12, "lily");
        int number = lily.getNumber();
        System.out.println(number);
    }

    @Test
    public void testPartInnerClass2() {
        com.solverpeng.innerclass.part.scope.OuterClass outerClass = new com.solverpeng.innerclass.part.scope.OuterClass();
        outerClass.print(true, "lily");
    }

    @Test
    public void testPartInnerClass() {
        com.solverpeng.innerclass.part.method.OuterClass outerClass = new com.solverpeng.innerclass.part.method.OuterClass();
        outerClass.outerMethod(23);
    }

    @Test
    public void testFieldInnerClass() {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.getInnerClass();
        if (innerClass != null) {
            innerClass.innerMethod();
        }
    }
}
