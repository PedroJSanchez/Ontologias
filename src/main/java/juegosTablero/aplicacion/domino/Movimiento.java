/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.domino;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import juegosTablero.Vocabulario.Colocacion;

/**
 *
 * @author pedroj
 */
public class Movimiento implements Concept {
    private Ficha ficha;
    private Colocacion colocacion;

    public Movimiento() {
    }

    public Movimiento(Ficha ficha, Colocacion colocacion) {
        this.ficha = ficha;
        this.colocacion = colocacion;
    }

    @Slot(mandatory=true)
    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    @Slot(mandatory=true)
    public Colocacion getColocacion() {
        return colocacion;
    }

    public void setColocacion(Colocacion colocacion) {
        this.colocacion = colocacion;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "ficha=" + ficha + ", colocacion=" + colocacion + '}';
    }
}
