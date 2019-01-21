/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

import jade.content.onto.BeanOntology;
import jade.content.onto.BeanOntologyException;
import jade.content.onto.Ontology;

/**
 *
 * @author pedroj
 */
public class OntologiaJuegos extends BeanOntology {
    private static final long serialVersionUID = 1L;

    // NOMBRE
    public static final String ONTOLOGY_NAME = "Ontologia_Juegos";
        
    //VOCABULARIO
    public static final String ERROR_CONTENIDO_MENSAJE = "Contenido incorrecto";
    public static final String ERROR_MENSAJE = "Mensaje incorrecto";
    public static final String ERROR_AGENTE = "Agente no localizado";
    public static final String CANCELACION_PARTIDA = "Partida Cancelada";
    public static final String CANCELACION_ABANDONO = "Abandono de la partida";
    
    // The singleton instance of this ontology
    private static Ontology INSTANCE;

    public synchronized final static Ontology getInstance() throws BeanOntologyException {
        
        if (INSTANCE == null) {
            INSTANCE = new OntologiaJuegos();
	}
            
        return INSTANCE;
    }

    /**
     * Constructor
     * 
     * @throws BeanOntologyException
     */
    private OntologiaJuegos() throws BeanOntologyException {
	
        super(ONTOLOGY_NAME);
        
        add("juegos.elementos");
    }
}