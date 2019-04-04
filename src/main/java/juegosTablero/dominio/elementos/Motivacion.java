/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.dominio.elementos;

import jade.content.Predicate;
import jade.content.onto.annotations.Slot;
import juegosTablero.Vocabulario.Motivo;

/**
 *
 * @author pedroj
 */
public class Motivacion implements Predicate {
    private Motivo detalle;

    public Motivacion(Motivo detalle) {
        this.detalle = detalle;
    }

    @Slot(mandatory=true)
    public Motivo getDetalle() {
        return detalle;
    }

    public void setDetalle(Motivo detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Motivacion{" + "detalle=" + detalle + '}';
    }
}
