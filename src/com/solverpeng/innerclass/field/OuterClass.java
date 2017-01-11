package com.solverpeng.innerclass.field;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class OuterClass {
    private Integer field1;
    private String field2;

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public Integer getField1() {
        return field1;
    }

    public void setField1(Integer field1) {
        this.field1 = field1;
    }

    public void outerMethod() {
        System.out.println("outerclass method...");
    }

    public class InnerClass {
        public InnerClass() {
            field1 = 10;
            field2 = "abc";
        }

        public void innerMethod() {
            System.out.println("field:" + field1 + " , field2: " + field2);
            outerMethod();
        }
    }

    public InnerClass getInnerClass() {
        return new InnerClass();
    }

}
