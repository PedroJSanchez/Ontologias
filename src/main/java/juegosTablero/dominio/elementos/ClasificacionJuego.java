/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.dominio.elementos;

import jade.content.Concept;
import jade.content.onto.annotations.AggregateSlot;
import jade.util.leap.List;

/**
 *
 * @author pedroj
 */
public class ClasificacionJuego implements Concept {
    private List listaJugadores;
    private List listaPuntuacion;

    public ClasificacionJuego() {
    }

    public ClasificacionJuego(List listaJugadores, List listaPuntuacion) {
        this.listaJugadores = listaJugadores;
        this.listaPuntuacion = listaPuntuacion;
    }

    @AggregateSlot(cardMin=2, type=Jugador.class)
    public List getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @AggregateSlot(cardMin=2, type=Integer.class)
    public List getListaPuntuacion() {
        return listaPuntuacion;
    }

    public void setListaPuntuacion(List listaPuntuacion) {
        this.listaPuntuacion = listaPuntuacion;
    }
}
