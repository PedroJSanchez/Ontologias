/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.conecta4;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import juegosTablero.dominio.elementos.Posicion;

/**
 *
 * @author pedroj
 */
public class Movimiento implements Concept {
    private Ficha ficha;
    private Posicion posicion;

    public Movimiento() {
    }

    public Movimiento(Ficha ficha, Posicion posicion) {
        this.ficha = ficha;
        this.posicion = posicion;
    }

    @Slot(mandatory=true)
    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    @Slot(mandatory=true)
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "ficha=" + ficha + ", posicion=" + posicion + '}';
    }
}
