/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.domino;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;

/**
 *
 * @author pedroj
 */
public class Ficha implements Concept {
    private int valorSup;
    private int valorInf;

    public Ficha() {
    }

    public Ficha(int valorSup, int valorInf) {
        this.valorSup = valorSup;
        this.valorInf = valorInf;
    }

    @Slot(mandatory=true)
    public int getValorSup() {
        return valorSup;
    }

    public void setValorSup(int valorSup) {
        this.valorSup = valorSup;
    }

    @Slot(mandatory=true)
    public int getValorInf() {
        return valorInf;
    }

    public void setValorInf(int valorInf) {
        this.valorInf = valorInf;
    }
    
    public int getValor() {
        return valorSup + valorInf;
    }

    @Override
    public String toString() {
        return "Ficha{" + "valorSup=" + valorSup + ", valorInf=" + valorInf + '}';
    }
}
