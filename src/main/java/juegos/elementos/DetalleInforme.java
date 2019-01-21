/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos.elementos;

import jade.content.Concept;
import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

/**
 *
 * @author pedroj
 */
public class DetalleInforme implements Predicate {
    private Partida partida;
    private Concept detalle;

    public DetalleInforme() {
    }

    public DetalleInforme(Partida partida, Concept detalle) {
        this.partida = partida;
        this.detalle = detalle;
    }

    @Slot(mandatory=true)
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
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
        return "DetalleInforme{" + "partida=" + partida + ", detalle=" + detalle + '}';
    }
}
