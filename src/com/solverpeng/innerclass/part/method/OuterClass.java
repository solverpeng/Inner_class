package com.solverpeng.innerclass.part.method;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class OuterClass {
    private Integer field;
    private String field2;

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void outerMethod(final int value) {// 这里 value 必须设置为 final 类型
        field = 12;
        field2 = "lily";
        final String field3 = "java";
        class InnerClass {
            public void print() {
                System.out.println(value);
                System.out.println("field:" + field + ", field2:" + field2 + ", field3:" + field3);
            }
        }
        new InnerClass().print();
    }




}
