/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.domino;

import jade.content.AgentAction;
import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;
import juegosTablero.dominio.elementos.Juego;

/**
 *
 * @author pedroj
 */
public class RepartirFichas implements AgentAction {
    private Juego juego;
    private List listaFichas;

    public RepartirFichas() {
    }

    public RepartirFichas(Juego juego, List listaFichas) {
        this.juego = juego;
        this.listaFichas = listaFichas;
    }

    @Slot(mandatory=true)
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    @AggregateSlot(cardMin=1, type=Ficha.class)
    public List getListaFichas() {
        return listaFichas;
    }

    public void setListaFichas(List listaFichas) {
        this.listaFichas = listaFichas;
    } 
}
