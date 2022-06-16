package com.op.Tarea;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        SmartDevice amura = new SmartDevice("Amura","New Cristal", 32);
        System.out.println("*** SMART DEVICE ***");
        System.out.println(" ");
        System.out.println(amura.marca);
        System.out.println(amura.modelo);
        System.out.println(amura.memoria);

        System.out.println(" ");
        System.out.println("*** SMART PHONE ***");
        SmartPhone motog200 = new SmartPhone("Motorola", "motoG200",32,true);
        System.out.println(motog200.marca);
        System.out.println(motog200.modelo);
        System.out.println(motog200.memoria);
        System.out.println(motog200.desbloqueo);

        System.out.println(" ");
        System.out.println("*** SMART WATCH ***");
        SmartWatch motoPhone = new SmartWatch("Motorola", "motolg",16,true);
        System.out.println(motoPhone.marca);
        System.out.println(motoPhone.modelo);
        System.out.println(motoPhone.memoria);
        System.out.println(motoPhone.pantallaTactil);
        System.out.println(" ");
        System.out.println("Fin");


    }
}
