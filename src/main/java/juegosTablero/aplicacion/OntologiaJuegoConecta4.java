/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion;

import jade.content.onto.BeanOntology;
import jade.content.onto.BeanOntologyException;
import jade.content.onto.Ontology;
import juegosTablero.dominio.OntologiaJuegosTablero;

/**
 *
 * @author pedroj
 */
public class OntologiaJuegoConecta4 extends BeanOntology {
    private static final long serialVersionUID = 1L;
    
    // NOMBRE
    public static final String ONTOLOGY_NAME = "Ontologia_Juego_Conecta_4";
    
    // The singleton instance of this ontology
    private static Ontology INSTANCE;
    
    public synchronized final static Ontology getInstance() throws BeanOntologyException {
        
        if (INSTANCE == null) {
            INSTANCE = new OntologiaJuegoConecta4();
	}
            
        return INSTANCE;
    }

    /**
     * Constructor
     * 
     * @throws BeanOntologyException
     */
    private OntologiaJuegoConecta4() throws BeanOntologyException {
	
        super(ONTOLOGY_NAME, OntologiaJuegosTablero.getInstance());
        
        add("juegosTablero.aplicacion.conecta4");
    }
}
