package com.company;

public class Tretii extends Perviy implements Printable{
    private int t1;
    public Tretii(int p1, int t1){
        super(p1);
        this.t1=t1;
    }

    @Override
    public void print() {
        System.out.println(t1);

    }
}
