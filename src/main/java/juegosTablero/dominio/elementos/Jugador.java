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
public class Jugador implements Concept {
    private String nombre;
    private AID agenteJugador;
   

    public Jugador() {
    }

    public Jugador(String nombre, AID agenteJugador) {
        this.nombre = nombre;
        this.agenteJugador = agenteJugador;
    }

    @Slot(mandatory=true)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Slot(mandatory=true)
    public AID getAgenteJugador() {
        return agenteJugador;
    }

    public void setAgenteJugador(AID agenteJugador) {
        this.agenteJugador = agenteJugador;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }
}
