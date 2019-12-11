package com.atguigu.springcloud.service;

public class math {
    public int math(){
        int a=1;
        int b=2;
        int c=(a+b)*10;
        return c;
    }

    public static void main(String[] args) {
        math math=new math();
        math.math();
        System.out.println("cccc");
    }
}
