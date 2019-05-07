/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.barcos;

import jade.content.Predicate;
import jade.content.onto.annotations.AggregateSlot;
import jade.content.onto.annotations.Slot;
import jade.util.leap.List;
import juegosTablero.dominio.elementos.Juego;

/**
 *
 * @author pedroj
 */
public class PosicionBarcos implements Predicate {
    private Juego juego;
    private List localizacionBarcos;

    public PosicionBarcos() {
    }

    public PosicionBarcos(Juego juego, List localizacionBarcos) {
        this.juego = juego;
        this.localizacionBarcos = localizacionBarcos;
    }

    @Slot(mandatory=true)
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    @AggregateSlot(cardMin=1, type=Localizacion.class)
    public List getLocalizacionBarcos() {
        return localizacionBarcos;
    }

    public void setLocalizacionBarcos(List localizacionBarcos) {
        this.localizacionBarcos = localizacionBarcos;
    }
}
