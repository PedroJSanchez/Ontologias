/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.domino;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import static juegosTablero.Vocabulario.NUM_FICHAS_DOMINO;
import static juegosTablero.Vocabulario.NUM_JUGADORES_DOMINO;

/**
 *
 * @author pedroj
 */
public class JuegoDomino implements Concept {
    private int numFichas;
    private int numJugadores;

    public JuegoDomino() {
        this.numFichas = NUM_FICHAS_DOMINO;
        this.numJugadores = NUM_JUGADORES_DOMINO;
    }

    public JuegoDomino(int numFichas, int numJugadores) {
        this.numFichas = numFichas;
        this.numJugadores = numJugadores;
    }

    @Slot(mandatory=true)
    public int getNumFichas() {
        return numFichas;
    }

    public void setNumFichas(int numFichas) {
        this.numFichas = numFichas;
    }

    @Slot(mandatory=true)
    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    @Override
    public String toString() {
        return "JuegoDomino{" + "numFichas=" + numFichas + ", numJugadores=" + numJugadores + '}';
    }
}
