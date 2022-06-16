package com.op.Tarea;

public class SmartWatch extends SmartDevice{
    String marca;
    String modelo;
    int memoria;
    boolean pantallaTactil;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, int memoria, boolean pantallaTactil) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.pantallaTactil = pantallaTactil;
    }
}
