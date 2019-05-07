/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.domino;

import jade.content.Predicate;
import jade.content.onto.annotations.Slot;
import juegosTablero.dominio.elementos.Juego;

/**
 *
 * @author pedroj
 */
public class MovimientoEntregado implements Predicate {
    private Juego juego;
    private Movimiento movimiento;

    public MovimientoEntregado() {
    }

    public MovimientoEntregado(Juego juego, Movimiento movimiento) {
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
    public Movimiento getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    @Override
    public String toString() {
        return "MovimientoEntregado{" + "juego=" + juego + ", movimiento=" + movimiento + '}';
    }
}
