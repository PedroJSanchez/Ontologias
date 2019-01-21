/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos.elementos;

import jade.content.AgentAction;
import jade.content.onto.annotations.Slot;

/**
 *
 * @author pedroj
 */
public class InformarPartida implements AgentAction {
    
    private Jugador jugador;

    public InformarPartida() {
    }

    public InformarPartida(Jugador jugador) {
        this.jugador = jugador;
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
        return "InformarPartida{" + "jugador=" + jugador + '}';
    }
}
