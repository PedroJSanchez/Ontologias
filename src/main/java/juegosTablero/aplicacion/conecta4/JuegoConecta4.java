/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.conecta4;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import static juegosTablero.Vocabulario.COLUMNAS_CONECTA_4;
import static juegosTablero.Vocabulario.FILAS_CONECTA_4;
import juegosTablero.dominio.elementos.Tablero;

/**
 *
 * @author pedroj
 */
public class JuegoConecta4 implements Concept {
    private Tablero tablero;

    public JuegoConecta4() {
        this.tablero = new Tablero(FILAS_CONECTA_4, COLUMNAS_CONECTA_4);
    }

    public JuegoConecta4(Tablero tablero) {
        this.tablero = tablero;
    }

    @Slot(mandatory=true)
    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        return "JuegoConecta4{" + "tablero=" + tablero + '}';
    }
}
