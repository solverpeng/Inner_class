package com.solverpeng.innerclass;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class Man extends Person{

    @Override
    public void say() {
        System.out.println("hello, i am a man!");
    }

    class SuperMan extends Wing{

        @Override
        public void fly() {
            System.out.println("hello, i can fly!");
        }

        public void ability() {
            say();
            fly();
        }
    }

    public static void main(String[] args) {
        SuperMan superMan = new Man().new SuperMan();
        superMan.ability();
    }
}
