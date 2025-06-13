package com.logica.funciones;

import java.util.Map;
import java.util.Scanner;

import com.logica.clases.*;

public class Menu {

    public static void menu() {

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Seleccione una opcion: ");
            System.out.println("1) Registrar eventos.");
            System.out.println("2) Registrar participantes.");
            System.out.println("3) Simulacion de eventos.");
            System.out.println("4) Creacion de informes.");
            System.out.println("5) Salir");
            opcion = teclado.nextInt();

            if (opcion == 1) {
            } else if (opcion == 2) {
                // Ejecutamos la función que está en otro paquete
                Map<String, Participante> participantes = RegistroPariticpantes.registrar();

                System.out.println("\nParticipantes registrados:");
                participantes.forEach((nombre, datos) -> System.out.println("Nombre: " + nombre + datos));

            } else if (opcion == 3) {
                System.out.println("3");
            } else if (opcion == 4) {
                System.out.println("4");
            } else if (opcion == 55) {
                System.out.println("Saliendo");
            }

        } while (opcion != 5);

        teclado.close();
    }

}
