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
public class Ficha implements Concept {
    
    private String color;

    public Ficha() {
    }

    public Ficha(String color) {
        this.color = color;
    }

    @Slot(mandatory=true)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ficha{" + "color=" + color + '}';
    }
}
