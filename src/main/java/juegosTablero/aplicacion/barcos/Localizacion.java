/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.barcos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import juegosTablero.Vocabulario.Orientacion;
import juegosTablero.Vocabulario.TipoBarco;
import juegosTablero.dominio.elementos.Posicion;

/**
 *
 * @author pedroj
 */
public class Localizacion implements Concept {
    private TipoBarco barco;
    private Posicion posicion;
    private Orientacion orientacion;

    public Localizacion() {
    }

    public Localizacion(TipoBarco barco, Posicion posicion, Orientacion orientacion) {
        this.barco = barco;
        this.posicion = posicion;
        this.orientacion = orientacion;
    }

    @Slot(mandatory=true)
    public TipoBarco getBarco() {
        return barco;
    }

    public void setBarco(TipoBarco barco) {
        this.barco = barco;
    }

    @Slot(mandatory=true)
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Slot(mandatory=true)
    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    @Override
    public String toString() {
        return "Localizacion{" + "barco=" + barco + ", posicion=" + posicion 
                + ", orientacion=" + orientacion + '}';
    }
}
