/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero;

import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.BeanOntologyException;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.onto.basic.Action;
import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.domain.FIPANames;
import jade.lang.acl.ACLMessage;
import java.util.logging.Level;
import java.util.logging.Logger;
import juegosTablero.Vocabulario.ModoJuego;
import juegosTablero.Vocabulario.NombreServicio;
import static juegosTablero.Vocabulario.TIPO_SERVICIO;
import juegosTablero.Vocabulario.TipoJuego;
import juegosTablero.aplicacion.OntologiaJuegoBarcos;
import juegosTablero.aplicacion.OntologiaJuegoConecta4;
import juegosTablero.aplicacion.OntologiaJuegoDomino;
import juegosTablero.aplicacion.domino.JuegoDomino;
import juegosTablero.dominio.elementos.Juego;
import juegosTablero.dominio.elementos.ProponerJuego;

/**
 *
 * @author pedroj
 */
public class AgentePrueba extends Agent {
    private Ontology ontologiaBarcos;
    private Ontology ontologiaConecta4;
    private Ontology ontologiaDomino;
    
    private final Codec codec = new SLCodec();
    private final ContentManager managerBarcos = (ContentManager) getContentManager();
    private final ContentManager managerConecta4 = (ContentManager) getContentManager();
    private final ContentManager managerDomino = (ContentManager) getContentManager();
    

    @Override
    protected void setup() {
        System.out.println("Inicia la ejecución de " + this.getName());
        
        try {
            ontologiaBarcos = OntologiaJuegoBarcos.getInstance();
        } catch (BeanOntologyException ex) {
            Logger.getLogger(AgentePrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        managerBarcos.registerLanguage(codec);
	managerBarcos.registerOntology(ontologiaBarcos);
        
        try {
            ontologiaConecta4 = OntologiaJuegoConecta4.getInstance();
        } catch (BeanOntologyException ex) {
            Logger.getLogger(AgentePrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        managerConecta4.registerLanguage(codec);
	managerConecta4.registerOntology(ontologiaConecta4);
        
        try {
            ontologiaDomino = OntologiaJuegoDomino.getInstance();
        } catch (BeanOntologyException ex) {
            Logger.getLogger(AgentePrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        managerDomino.registerLanguage(codec);
	managerDomino.registerOntology(ontologiaDomino);
        
        // Registro en las páginas Amarillas
        DFAgentDescription dfd = new DFAgentDescription();
        dfd.setName(getAID());
	ServiceDescription sd = new ServiceDescription();
	sd.setType(TIPO_SERVICIO);
	sd.setName(NombreServicio.GRUPO_JUEGOS.toString());
	dfd.addServices(sd);
	try {
            DFService.register(this, dfd);
	}
	catch (FIPAException fe) {
            fe.printStackTrace();
	}
        
        //Juego juego = new Juego("Juego1", 3, ModoJuego.UNICO, TipoJuego.BARCOS);
        //JuegoBarcos juegoBarcos = new JuegoBarcos();
        //ProponerJuego proponerJuego = new ProponerJuego(juego, juegoBarcos);
        
        //Juego juego = new Juego("Juego1", 3, ModoJuego.UNICO, TipoJuego.CONECTA_4);
        //JuegoConecta4 juegoConecta4 = new JuegoConecta4();
        //ProponerJuego proponerJuego = new ProponerJuego(juego, juegoConecta4);
        
        Juego juego = new Juego("Juego1", 3, ModoJuego.UNICO, TipoJuego.DOMINO);
        JuegoDomino juegoDomino = new JuegoDomino();
        ProponerJuego proponerJuego = new ProponerJuego(juego, juegoDomino);        
        
        ACLMessage msg;
        
        msg = new ACLMessage(ACLMessage.PROPOSE);
        msg.setProtocol(FIPANames.InteractionProtocol.FIPA_PROPOSE);
        msg.setSender(this.getAID());
        msg.setLanguage(codec.getName());
        msg.setOntology(ontologiaDomino.getName());
        msg.addReceiver(this.getAID());
        
        Action ac = new Action(this.getAID(), proponerJuego);
        
        try {
            managerDomino.fillContent(msg, ac);
        } catch (Codec.CodecException | OntologyException ex) {
            Logger.getLogger(AgentePrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(msg);
        
        try {
            // Prueba extracción del mensage

            ac = (Action) managerDomino.extractContent(msg);
            ProponerJuego juegoPropuesto = (ProponerJuego) ac.getAction();
            System.out.println("-------------");
            System.out.println(juegoPropuesto);
        } catch (Codec.CodecException | OntologyException ex) {
            Logger.getLogger(AgentePrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    protected void takeDown() {
        //Desregistro de las Páginas Amarillas
        try {
            DFService.deregister(this);
	}
            catch (FIPAException fe) {
            fe.printStackTrace();
	}
        
        System.out.println("Finaliza la ejecución de " + this.getName());
    }
}
