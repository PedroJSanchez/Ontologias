/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.barcos;

import jade.content.AgentAction;
import jade.content.onto.annotations.Slot;
import juegosTablero.dominio.elementos.Juego;

/**
 *
 * @author pedroj
 */
public class ColocarBarcos implements AgentAction{
    private Juego juego;

    public ColocarBarcos() {
    }

    public ColocarBarcos(Juego juego) {
        this.juego = juego;
    }

    @Slot(mandatory=true)
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    @Override
    public String toString() {
        return "ColocarBarcos{" + "juego=" + juego + '}';
    }
}
