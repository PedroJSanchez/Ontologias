/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.barcos;

import jade.content.Predicate;
import jade.content.onto.annotations.Slot;
import juegosTablero.Vocabulario.Efecto;
import juegosTablero.dominio.elementos.Juego;
import juegosTablero.dominio.elementos.Posicion;

/**
 *
 * @author pedroj
 */
public class ResultadoMovimiento implements Predicate {
    private Juego juego;
    private Posicion movimiento;
    private Efecto resultado;

    public ResultadoMovimiento() {
    }

    public ResultadoMovimiento(Juego juego, Posicion movimiento, Efecto resultado) {
        this.juego = juego;
        this.movimiento = movimiento;
        this.resultado = resultado;
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

    @Slot(mandatory=true)
    public Efecto getResultado() {
        return resultado;
    }

    public void setResultado(Efecto resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "ResultadoJugada{" + "juego=" + juego + ", movimiento=" + 
                movimiento + ", resultado=" + resultado + '}';
    }  
}
