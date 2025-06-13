package com.logica.main;

import java.util.Scanner;

import com.logica.funciones.GestorEventos;

public final class Main {
    public static void main(String[] args) {

        /*
        * EJERCICIO:
        * ¡Los JJOO de París 2024 han comenzado!
        * Crea un programa que simule la celebración de los juegos.
        * El programa debe permitir al usuario registrar eventos y participantes,
        * realizar la simulación de los eventos asignando posiciones de manera aleatoria
        * y generar un informe final. Todo ello por terminal.
        * Requisitos:
        * 1. Registrar eventos deportivos.
        * 2. Registrar participantes por nombre y país.
        * 3. Simular eventos de manera aleatoria en base a los participantes (mínimo 3).
        * 4. Asignar medallas (oro, plata y bronce) basándose en el resultado del evento.
        * 5. Mostrar los ganadores por cada evento.
        * 6. Mostrar el ranking de países según el número de medallas.
        * Acciones:
        * 1. Registro de eventos.
        * 2. Registro de participantes.
        * 3. Simulación de eventos.
        * 4. Creación de informes.
        * 5. Salir del programa.
        */

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n🎮 Menú JJOO París 2024:");
            System.out.println("1. Registrar evento");
            System.out.println("2. Registrar participante");
            System.out.println("3. Simular eventos");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia buffer

            switch (opcion) {
                case 1:
                    GestorEventos.registrarEvento(sc);
                    break;
                case 2:
                    GestorEventos.registrarParticipante(sc);
                    break;
                case 3:
                    GestorEventos.simularEventos();
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
    }

