package com.logica.clases;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private List<Participante> participantes;

    public Evento(String nombre) {
        this.nombre = nombre;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Participante p) {
        participantes.add(p);
    }

    public String getNombre() { return nombre; }
    public List<Participante> getParticipantes() { return participantes; }
}
