package com.logica.funciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.logica.clases.Participante;

public class RegistroPariticpantes {

    public static  Map<String, Participante> registrar() {

        // Creamos un mapa para almacenar participantes usando el nombre como clave
        Map<String, Participante> mapaParticipantes = new HashMap<>();

        Scanner teclado = new Scanner(System.in);

        String continuar; // Variable para controlar si el usuario quiere seguir registrando

        do {

            System.out.println("Indique el nombre del particpante: ");
            String nombre = teclado.nextLine();

            System.out.println("Indique el nombre del pais: ");
            String pais = teclado.nextLine();

            // Creamos un nuevo objeto Participante con los datos ingresados
            Participante participante = new Participante(nombre, pais);

            // Agregamos al mapa usando el nombre como clave y el objeto como valor
            mapaParticipantes.put(nombre, participante); 

            System.out.println("Desea registrar otro participante: (s/n) ");
            continuar = teclado.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        teclado.close();
        return mapaParticipantes;
       
    }   

}
