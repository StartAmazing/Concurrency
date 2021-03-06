package com.ll.jvm.classloader;

public class MyTest6 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println("counter1: " + Singleton.counter1);  //1
        System.out.println("counter2: " + Singleton.counter2);  //1
    }
}

class Singleton{

    public static int counter1;

    //如果将这行代码放到私有构造方法下面的话，第二个输出结果为0
//    public static int counter2 = 0;

    private static Singleton singleton = new Singleton();

    private Singleton(){
        counter1++;
        counter2++;
        System.out.println(counter1);   //1
        System.out.println(counter2);   //1
    }

    public static int counter2 = 0;

    public static Singleton getInstance(){
        return singleton;
    }
}
