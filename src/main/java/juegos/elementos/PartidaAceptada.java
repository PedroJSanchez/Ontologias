/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos.elementos;

import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

/**
 *
 * @author pedroj
 */
public class PartidaAceptada implements Predicate {
    
    private Partida partida;
    private Jugador jugador;

    public PartidaAceptada() {
    }

    public PartidaAceptada(Partida partida, Jugador jugador) {
        this.partida = partida;
        this.jugador = jugador;
    }

    @Slot(mandatory=true)
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    @Slot(mandatory=true)
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "PartidaAceptada{" + "partida=" + partida + ", jugador=" + jugador + '}';
    }
}
