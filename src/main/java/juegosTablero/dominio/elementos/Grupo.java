/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.dominio.elementos;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;
import jade.core.AID;

/**
 *
 * @author pedroj
 */
public class Grupo implements Concept {
    private String nombre;
    private AID agenteGrupoJuegos;

    public Grupo() {
    }

    public Grupo(String nombre, AID agenteGrupoJuegos) {
        this.nombre = nombre;
        this.agenteGrupoJuegos = agenteGrupoJuegos;
    }

    @Slot(mandatory=true)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Slot(mandatory=true)
    public AID getAgenteGrupoJuegos() {
        return agenteGrupoJuegos;
    }

    public void setAgenteGrupoJuegos(AID agenteGrupoJuegos) {
        this.agenteGrupoJuegos = agenteGrupoJuegos;
    }

    @Override
    public String toString() {
        return "GrupoJuegos{" + "nombre=" + nombre + '}';
    }
}
