package com.mycompany.tema2_a2;

import java.util.LinkedList;
import java.util.Queue;

class Proceso {
    String nombre;
    int tiempoNecesario;
    int tiempoRestante;
    int tiempoFin;

    public Proceso(String nombre, int tiempoNecesario) {
        this.nombre = nombre;
        this.tiempoNecesario = tiempoNecesario;
        this.tiempoRestante = tiempoNecesario;
    }
}
public class Tema2_A2 {
    public static void main(String[] args) {
        int quantum = 2;
        int tiempoActual = 0;

        Proceso[] procesos = {
            new Proceso("P1", 5),
            new Proceso("P2", 3),
            new Proceso("P3", 1)
        };

        Queue<Proceso> cola = new LinkedList<>();
        for (Proceso p : procesos) {
            cola.add(p);
        }
        System.out.println("La orden de ejecución es la siguiente: ");

        while (!cola.isEmpty()) {
            Proceso actual = cola.poll();
            int inicio = tiempoActual;

            int tiempoEjecutado = Math.min(quantum, actual.tiempoRestante);
            actual.tiempoRestante -= tiempoEjecutado;
            tiempoActual += tiempoEjecutado;

            System.out.println("{" + inicio + " - " + tiempoActual + "}  -> " + actual.nombre);

            if (actual.tiempoRestante == 0) {
                actual.tiempoFin = tiempoActual;
            } else {
                cola.add(actual);
            }
        }
        System.out.println();
        System.out.println("Mostrando la finalización de cada proceso");
        for (Proceso p : procesos) {
            System.out.println(p.nombre + " -> termina en t = " + p.tiempoFin);
        }
    }
}