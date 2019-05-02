/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero;

import jade.content.onto.BeanOntologyException;
import jade.content.onto.Ontology;
import juegosTablero.aplicacion.OntologiaJuegoBarcos;
import juegosTablero.aplicacion.OntologiaJuegoConecta4;
import juegosTablero.aplicacion.OntologiaJuegoDomino;

/**
 *
 * @author pedroj
 */
public interface Vocabulario {
    
    // Registro en las páginas Amarillas
    public static final String TIPO_SERVICIO = "Agente Juegos de Tablero";
    public static enum NombreServicio { 
        GRUPO_JUEGOS, JUEGO_BARCOS, JUEGO_CONECTA_4, JUEGO_DOMINO
    }
    
    // Elementos para los juegos
    public static enum Motivo { 
        JUEGOS_ACTIVOS_SUPERADOS, PARTICIPACION_EN_JUEGOS_SUPERADA, 
        TIPO_JUEGO_NO_IMPLEMENTADO, DEMASIADOS_JUEGOS_SIN_COMPLETAR
    }
    public static enum Incidencia {
        CANCELACION, ERROR_AGENTE, ERROR_MENSAJE_INCORRECTO, ERROR_CONTENIDO_MENSAJE
    }
    public static enum Estado {
        GANADOR, ABANDONO, SEGUIR_JUGANDO, FIN_PARTIDA
    }
    public static enum Color { AZUL, ROJO, VERDE, AMARILLO }
    public static enum ModoJuego { UNICO, TORNEO }
    public static enum TipoJuego { BARCOS, CONECTA_4, DOMINO } 
    public static enum Orientacion { HORIZONTAL, VERTICAL }
    public static enum Colocacion { DERECHA, IZQUIERDA, PASAR }
    public static enum Efecto { HUNDIDO, TOCADO, AGUA }
    
    public static enum Puntuacion {
        VICTORIA(3), EMPATE(1), DERROTA(0);
        
        private final int valor;

        public int getValor() {
            return valor;
        }

        private Puntuacion(int valor) {
            this.valor = valor;
        }
    }
    
    public static enum TipoBarco {
        PORTAAVIONES(4), ACORAZADO(3), DESTRUCTOR(2), FRAGATA(1);
        
        private int casillas;

        private TipoBarco(int casillas) {
            this.casillas = casillas;
        }

        public int getCasillas() {
            return casillas;
        }
    }

    // Constantes
    public static final int FILAS_CONECTA_4 = 6;
    public static final int COLUMNAS_CONECTA_4 = 7;
    public static final int FILAS_BARCOS = 10;
    public static final int COLUMNAS_BARCOS = 10;
    public static final int NUM_PORTAAVIONES = 1;
    public static final int NUM_ACORAZADOS = 3;
    public static final int NUM_DESTRUCTORES = 3;
    public static final int NUM_FRAGATAS = 2;
    public static final int NUM_FICHAS_DOMINO = 28;
    public static final int NUM_JUGADORES_DOMINO = 4;
    
    // Métodos
    public static Ontology getOntologia( TipoJuego tipoJuego ) throws BeanOntologyException {
        Ontology resultado = null;
        
        switch ( tipoJuego ) {
            case BARCOS:
                resultado = OntologiaJuegoBarcos.getInstance();
                break;
            case CONECTA_4:
                resultado = OntologiaJuegoConecta4.getInstance();
                break;
            case DOMINO:
                resultado = OntologiaJuegoDomino.getInstance();
                break;
        }
        
        return resultado;
    }
}
