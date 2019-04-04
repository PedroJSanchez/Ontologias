/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.dominio.elementos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import jade.core.AID;

/**
 *
 * @author pedroj
 */
public class Gestor implements Concept {
    private String nombre;
    private AID agenteCentralJuego;

    public Gestor() {
    }

    public Gestor(String nombre, AID agenteCentralJuego) {
        this.nombre = nombre;
        this.agenteCentralJuego = agenteCentralJuego;
    }

    @Slot(mandatory=true)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Slot(mandatory=true)
    public AID getAgenteCentralJuego() {
        return agenteCentralJuego;
    }

    public void setAgenteCentralJuego(AID agenteCentralJuego) {
        this.agenteCentralJuego = agenteCentralJuego;
    }

    @Override
    public String toString() {
        return "Central{" + "nombre=" + nombre + '}';
    }
}
