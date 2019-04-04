/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.dominio.elementos;

import jade.content.Concept;
import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

/**
 *
 * @author pedroj
 */
public class DetalleInforme implements Predicate {
    private Juego juego;
    private Concept detalle;

    public DetalleInforme() {
    }

    public DetalleInforme(Juego juego, Concept detalle) {
        this.juego = juego;
        this.detalle = detalle;
    }

    @Slot(mandatory=true)
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    @Slot(mandatory=true)
    public Concept getDetalle() {
        return detalle;
    }

    public void setDetalle(Concept detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "DetalleInforme{" + "juego=" + juego + ", detalle=" + detalle + '}';
    }
}
