package com.example.prtinterfaz2;

public class Calcular {
    private int a;
    private int b;

    public Calcular(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int sumar(){
        return a+b;
    }
    public int restar(){
        return a-b;
    }
    public int multiplicar(){
        return a*b;
    }
    public double dividir(){
            return a/b;
    }
}
