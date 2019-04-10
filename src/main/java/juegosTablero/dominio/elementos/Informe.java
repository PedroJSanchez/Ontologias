/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.dominio.elementos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import juegosTablero.Vocabulario.Incidencia;

/**
 *
 * @author pedroj
 */
public class Informe implements Concept {
    private Juego juego;
    private Incidencia detalle;

    public Informe() {
    }

    public Informe(Juego juego, Incidencia detalle) {
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
    public Incidencia getDetalle() {
        return detalle;
    }

    public void setDetalle(Incidencia detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Informe{" + "juego=" + juego + ", detalle=" + detalle + '}';
    }
}
