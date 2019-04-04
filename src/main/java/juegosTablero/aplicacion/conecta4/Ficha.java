/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.conecta4;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import juegosTablero.Vocabulario.Color;

/**
 *
 * @author pedroj
 */
public class Ficha implements Concept {
    
    private Color color;

    public Ficha() {
    }

    public Ficha(Color color) {
        this.color = color;
    }

    @Slot(mandatory=true)
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ficha{" + "color=" + color + '}';
    }
}
