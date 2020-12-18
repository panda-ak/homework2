package com.company;

public class Chetvertii extends Perviy implements Printable{
    private int ch1;
    public Chetvertii(int p1, int ch1){
        super(p1);
        this.ch1=ch1;
    }

    @Override
    public void print() {
        System.out.println(ch1);
    }
}
