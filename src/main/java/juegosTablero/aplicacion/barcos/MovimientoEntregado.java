/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.barcos;

import jade.content.Predicate;
import jade.content.onto.annotations.Slot;
import juegosTablero.dominio.elementos.Juego;
import juegosTablero.dominio.elementos.Posicion;

/**
 *
 * @author pedroj
 */
public class MovimientoEntregado implements Predicate {
    private Juego juego;
    private Posicion movimiento;

    public MovimientoEntregado() {
    }

    public MovimientoEntregado(Juego juego, Posicion movimiento) {
        this.juego = juego;
        this.movimiento = movimiento;
    }

    @Slot(mandatory=true)
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    @Slot(mandatory=true)
    public Posicion getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Posicion movimiento) {
        this.movimiento = movimiento;
    }

    @Override
    public String toString() {
        return "MovimientoEntregado{" + "juego=" + juego + ", movimiento=" + movimiento + '}';
    }
}
