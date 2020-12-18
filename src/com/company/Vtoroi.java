package com.company;

public class Vtoroi extends Perviy implements Printable{
    private int v1;
    public Vtoroi(int p1, int v1){
        super(p1);
        this.v1=v1;
    }

    public int getV1() {
        return v1;
    }

    @Override
    public void print() {
        System.out.println(v1);

    }
}
