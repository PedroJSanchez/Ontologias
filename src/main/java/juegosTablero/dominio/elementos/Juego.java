/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.dominio.elementos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import juegosTablero.Vocabulario.ModoJuego;
import juegosTablero.Vocabulario.TipoJuego;

/**
 *
 * @author pedroj
 */
public class Juego implements Concept {
    private String idJuego;
    private int minVictorias;
    private ModoJuego modoJuego;
    private TipoJuego tipoJuego;
    

    public Juego() {
    }

    public Juego(String idJuego, int minVictorias, ModoJuego modoJuego, TipoJuego tipoJuego) {
        this.idJuego = idJuego;
        this.minVictorias = minVictorias;
        this.modoJuego = modoJuego;
        this.tipoJuego = tipoJuego;
    }

    @Slot(mandatory=true)
    public String getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(String idJuego) {
        this.idJuego = idJuego;
    }

    @Slot(mandatory=true)
    public int getMinVictorias() {
        return minVictorias;
    }

    public void setMinVictorias(int minVictorias) {
        this.minVictorias = minVictorias;
    }

    @Slot(mandatory=true)
    public ModoJuego getModoJuego() {
        return modoJuego;
    }

    public void setModoJuego(ModoJuego modoJuego) {
        this.modoJuego = modoJuego;
    }

    @Slot(mandatory=true)
    public TipoJuego getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(TipoJuego tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    @Override
    public String toString() {
        return "Juego{" + "idJuego=" + idJuego + ", minVictorias=" + minVictorias 
                + ", modoJuego=" + modoJuego + ", tipoJuego=" + tipoJuego + '}';
    } 
}
