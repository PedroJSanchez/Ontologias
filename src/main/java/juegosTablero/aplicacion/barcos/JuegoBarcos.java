/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.barcos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import static juegosTablero.Vocabulario.COLUMNAS_BARCOS;
import static juegosTablero.Vocabulario.FILAS_BARCOS;
import static juegosTablero.Vocabulario.NUM_ACORAZADOS;
import static juegosTablero.Vocabulario.NUM_DESTRUCTORES;
import static juegosTablero.Vocabulario.NUM_FRAGATAS;
import static juegosTablero.Vocabulario.NUM_PORTAAVIONES;
import juegosTablero.dominio.elementos.Tablero;

/**
 *
 * @author pedroj
 */
public class JuegoBarcos implements Concept {
    private Tablero tablero;
    private int portaaviones;
    private int acorazados;
    private int destructores;
    private int fragatas;

    public JuegoBarcos() {
        this.tablero = new Tablero(FILAS_BARCOS,COLUMNAS_BARCOS);
        this.portaaviones = NUM_PORTAAVIONES;
        this.acorazados = NUM_ACORAZADOS;
        this.destructores = NUM_DESTRUCTORES;
        this.fragatas = NUM_FRAGATAS;
    }

    public JuegoBarcos(Tablero tablero, int portaaviones, int acorazados, int destructores, int fragatas) {
        this.tablero = tablero;
        this.portaaviones = portaaviones;
        this.acorazados = acorazados;
        this.destructores = destructores;
        this.fragatas = fragatas;
    }   

    @Slot(mandatory=true)
    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    @Slot(mandatory=true)
    public int getPortaaviones() {
        return portaaviones;
    }

    public void setPortaaviones(int portaaviones) {
        this.portaaviones = portaaviones;
    }

    @Slot(mandatory=true)
    public int getAcorazados() {
        return acorazados;
    }

    public void setAcorazados(int acorazados) {
        this.acorazados = acorazados;
    }

    @Slot(mandatory=true)
    public int getDestructores() {
        return destructores;
    }

    public void setDestructores(int destructores) {
        this.destructores = destructores;
    }

    @Slot(mandatory=true)
    public int getFragatas() {
        return fragatas;
    }

    public void setFragatas(int fragatas) {
        this.fragatas = fragatas;
    }

    @Override
    public String toString() {
        return "JuegoBarcos{" + "tablero=" + tablero + ", portaaviones=" 
                + portaaviones + ", acorazados=" + acorazados + ", destructores=" 
                + destructores + ", fragatas=" + fragatas + '}';
    }  
}
