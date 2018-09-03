package com.cice.ejemplo1;

public class Calculadora {
    IFuncional ifun;

    public Calculadora() {
        super();
    }

    public double suma (double x, double y) {
        this.ifun = (a,b) -> a+b;
        return this.ifun.calculo(x,y);
    }

    public double resta (double x, double y) {
        this.ifun = (a,b) -> a-b;
        return this.ifun.calculo(x,y);
    }

    public double multiplicacion (double x, double y) {
        this.ifun = (a,b) -> a*b;
        return this.ifun.calculo(x,y);
    }

    public double division(double x, double y) {
        this.ifun = (a,b) -> a/b;
        return this.ifun.calculo(x,y);
    }
}
