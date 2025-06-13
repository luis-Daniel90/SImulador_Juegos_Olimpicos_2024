package com.logica.funciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.logica.clases.Evento;

public class RegistroEventos {

    public static Map<String, Evento> registrarEvento(){

        Map<String, Evento> eventosRegistrados = new HashMap<>();

        Scanner teclado = new Scanner(System.in);

        String continuar; // Variable para controlar si el usuario quiere seguir registrando

        do {

            System.out.print("Ingrese el nombre del evento: ");
            String nombre = teclado.nextLine();

            Evento evento = new Evento(nombre); // Creamos nuevo evento

            eventosRegistrados.put(nombre, evento); // Lo añadimos al mapa

            System.out.print("¿Desea registrar otro evento? (s/n): ");
            continuar = teclado.nextLine();
            
        } while (continuar.equalsIgnoreCase("s"));        

        return eventosRegistrados;
    }

}
