/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos.elementos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;

/**
 *
 * @author pedroj
 */
public class Partida implements Concept {
    
    private String idPartida;
    private String tipoJuego;
    

    public Partida() {
    }

    public Partida(String idPartida, String tipoJuego) {
        this.idPartida = idPartida;
        this.tipoJuego = tipoJuego;
    }

    @Slot(mandatory=true)
    public String getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(String idPartida) {
        this.idPartida = idPartida;
    }

    @Slot(mandatory=false)
    public String getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    @Override
    public String toString() {
        return "Partida{" + "idPartida=" + idPartida + ", tipoJuego=" + tipoJuego + '}';
    }
}
