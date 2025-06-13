package com.logica.clases;

public class Participante {
    private String nombre;
    private String pais;

    public Participante(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() { return nombre; }
    public String getPais() { return pais; }
}
