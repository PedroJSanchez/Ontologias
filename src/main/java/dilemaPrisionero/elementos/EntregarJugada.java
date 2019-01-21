/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilemaPrisionero.elementos;

import jade.content.AgentAction;
import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;
import juegos.elementos.Partida;

/**
 *
 * @author pedroj
 */
public class EntregarJugada implements AgentAction {
    
    private Partida partida;
    private List jugadores;

    public EntregarJugada() {
    }

    public EntregarJugada(Partida partida, List jugadores) {
        this.partida = partida;
        this.jugadores = jugadores;
    }

    @Slot(mandatory=true)
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    @AggregateSlot(cardMin = 2, cardMax = 2)
    public List getJugadores() {
        return jugadores;
    }

    public void setJugadores(List jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "EntregarJugada{" + "partida=" + partida + ", jugadores=" 
                + jugadores + '}';
    }
}
