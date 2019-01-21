/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos.elementos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;

/**
 *
 * @author pedroj
 */
public class Error implements Concept {
    
    private String detalle;

    public Error() {
    }

    public Error(String detalle) {
        this.detalle = detalle;
    }

    @Slot(mandatory=true)
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Error{" + "detalle=" + detalle + '}';
    }
}
