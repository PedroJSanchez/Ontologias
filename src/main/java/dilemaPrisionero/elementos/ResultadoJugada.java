/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilemaPrisionero.elementos;

import jade.content.Predicate;
import jade.content.onto.annotations.Slot;
import juegos.elementos.Partida;

/**
 *
 * @author pedroj
 */
public class ResultadoJugada implements Predicate {
    
    private Partida partida;
    private int condenaRecibida;

    public ResultadoJugada() {
    }

    public ResultadoJugada(Partida partida, int condenaRecibida) {
        this.partida = partida;
        this.condenaRecibida = condenaRecibida;
    }

    @Slot(mandatory=true)
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    @Slot(mandatory=true)
    public int getCondenaRecibida() {
        return condenaRecibida;
    }

    public void setCondenaRecibida(int condenaRecibida) {
        this.condenaRecibida = condenaRecibida;
    }

    @Override
    public String toString() {
        return "ResultadoJugada{" + "partida=" + partida + 
                ", condenaRecibida=" + condenaRecibida + '}';
    }
}
