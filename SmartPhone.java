package com.op.Tarea;

public class SmartPhone extends SmartDevice{
    String marca;
    String modelo;
    int memoria;
    boolean desbloqueo;


    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, int memoria, boolean desbloqueo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.desbloqueo = desbloqueo;


    }
}
