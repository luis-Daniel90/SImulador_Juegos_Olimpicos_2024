package com.logica.funciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.logica.clases.Evento;
import com.logica.clases.Participante;

public class GestorEventos {

    public static List<Evento> eventos = new ArrayList<>();

    public static void registrarEvento(Scanner sc) {
        
        System.out.print("Nombre del evento: ");
        String nombre = sc.nextLine();
        eventos.add(new Evento(nombre));
        System.out.println("Evento registrado.");
    }

    public static void registrarParticipante(Scanner sc) {
        if (eventos.isEmpty()) {
            System.out.println("Primero debe registrar al menos un evento.");
            return;
        }

        System.out.print("Nombre del participante: ");
        String nombre = sc.nextLine();
        System.out.print("País: ");
        String pais = sc.nextLine();
        Participante p = new Participante(nombre, pais);

        System.out.println("Seleccione el evento al que pertenece:");
        for (int i = 0; i < eventos.size(); i++) {
            System.out.println(i + 1 + ". " + eventos.get(i).getNombre());
        }
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        if (opcion >= 1 && opcion <= eventos.size()) {
            eventos.get(opcion - 1).agregarParticipante(p);
            System.out.println("Participante registrado.");
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public static void simularEventos() {

        Random rand = new Random();
        for (Evento evento : eventos) {
            List<Participante> participantes = evento.getParticipantes();
            if (participantes.size() < 3) {
                System.out.println("No hay suficientes participantes en " + evento.getNombre());
                continue;
            }

            Collections.shuffle(participantes); // Simulación aleatoria

            System.out.println("🏅 Resultados de " + evento.getNombre());
            System.out.println("🥇 Oro: " + participantes.get(0).getNombre() + " - " + participantes.get(0).getPais());
            System.out
                    .println("🥈 Plata: " + participantes.get(1).getNombre() + " - " + participantes.get(1).getPais());
            System.out
                    .println("🥉 Bronce: " + participantes.get(2).getNombre() + " - " + participantes.get(2).getPais());
        }
    }
}