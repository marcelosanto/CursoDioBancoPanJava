package org.example;

import java.util.Random;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = new Random().nextInt(10);

        if (mediaFinal < 6) System.out.println("REPROVADO");
        else if (mediaFinal == 6) System.out.println("PROVA MINERVA");
        else System.out.println("APROVADO");
    }
}
