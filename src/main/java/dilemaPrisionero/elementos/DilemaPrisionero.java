/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilemaPrisionero.elementos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;

/**
 *
 * @author pedroj
 */
public class DilemaPrisionero implements Concept {
    
    private Condenas tiempoCondena; // tiempos de condena
    private int rondas; // número mínimo de rondas
    private int probabilidadFin; // probabilidad de finalización

    public DilemaPrisionero() {
    }
    
    public DilemaPrisionero(Condenas tiempoCondena, int rondas, int probabilidadFin) {
        this.tiempoCondena = tiempoCondena;
        this.rondas = rondas;
        this.probabilidadFin = probabilidadFin;
    }

    @Slot(mandatory=true)
    public Condenas getTiempoCondena() {
        return tiempoCondena;
    }

    public void setTiempoCondena(Condenas tiempoCondena) {
        this.tiempoCondena = tiempoCondena;
    }

    @Slot(mandatory=true)
    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    @Slot(mandatory=true)
    public int getProbabilidadFin() {
        return probabilidadFin;
    }

    public void setProbabilidadFin(int probabilidadFin) {
        this.probabilidadFin = probabilidadFin;
    }

    @Override
    public String toString() {
        return "DilemaPrisionero{" + "tiempoCondena=" + tiempoCondena + ", rondas=" 
                + rondas + ", probabilidadFin=" + probabilidadFin + '}';
    }
}
