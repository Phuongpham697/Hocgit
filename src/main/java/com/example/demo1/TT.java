package com.example.demo1;

public class TT {
    String h;
    int k;

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    TT(String h, int k){
this.h=h;
this.k=k;

    }

    public static void main(String[] args) {
        final TT tt= new TT("phuong",1);
        tt.setK(5);
        System.out.println(tt.getK());
    }

}
