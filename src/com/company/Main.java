package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("v1");
        createObject("t1");
        createObject("ch1");
    }


    public static Perviy createObject(String className) {
        switch (className) {
            case "v1":
                Vtoroi v1 = new Vtoroi(2, 2);
                v1.print();
                return v1;
            case "t1":
                Tretii t1 = new Tretii(3, 3);
                t1.print();
                return t1;
            case "ch1":
                Chetvertii ch1 = new Chetvertii(4, 4);
                ch1.print();
                return ch1;
            default:
                return null;

        }
    }
}
