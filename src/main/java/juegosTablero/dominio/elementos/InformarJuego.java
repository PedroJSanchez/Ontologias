/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.dominio.elementos;

import jade.content.AgentAction;
import jade.content.onto.annotations.Slot;

/**
 *
 * @author pedroj
 */
public class InformarJuego implements AgentAction {
    private Gestor centralJuego;

    public InformarJuego() {
    }

    public InformarJuego(Gestor centralJuego) {
        this.centralJuego = centralJuego;
    }

    @Slot(mandatory=true)
    public Gestor getCentralJuego() {
        return centralJuego;
    }

    public void setCentralJuego(Gestor centralJuego) {
        this.centralJuego = centralJuego;
    }

    @Override
    public String toString() {
        return "InformarJuego{" + "centralJuego=" + centralJuego + '}';
    }
}
