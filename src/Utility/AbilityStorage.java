package Utility;

import Entity.Ability;
import javax.swing.ImageIcon;

public class AbilityStorage {
    
    
    /* NOME | DANNO | MANA | DESCRIZIONE MOSSA */
  
    /* NORMAL ABILITY */ 
    public Ability frecciaM=new Ability("Freccia Magica",150, 50,"Scocca una freccia infusa di magia elfica", new ImageIcon(getClass().getResource(PathStorage.A_FRECCIA_MAGICA)));
    public Ability incendio=new Ability("Incendio",200, 50,"Sputano una quantita' di fiamme tali\n da poter bruciare tutta Santa Maria la Stella", new ImageIcon(getClass().getResource(PathStorage.A_INCENDIO)));
    public Ability gentilezza=new Ability("Gentilezza",0, 50,"Offre un'erba pipa all'avversario nella speranza si trochi", new ImageIcon(getClass().getResource(PathStorage.A_GENTILEZZA))); //50% prec/2
    public Ability resistenza=new Ability("Resistenza",0, 40,"Fortifica le sue difese", new ImageIcon(getClass().getResource(PathStorage.A_RESISTENZA)));
    public Ability increase=new Ability("Increase",0, 50,"Aumenta il suo attacco", new ImageIcon(getClass().getResource(PathStorage.A_INCREASE)));
    public Ability onePunchMan=new Ability("One Punch Man",300, 50,"Da un pugno stile anime", new ImageIcon(getClass().getResource(PathStorage.A_ONE_PUNCH_MAN)));
    public Ability kaioken=new Ability("Kaioken",0, 50,"Piu' la vita e' bassa piu' si potenzia", new ImageIcon(getClass().getResource(PathStorage.A_KAIOKEN)));
    public Ability reAntico=new Ability("Re Antico", 0, 70,"Prende la forza dei re passati", new ImageIcon(getClass().getResource(PathStorage.A_RE_ANTICO)));
    
    /* HERO ABILITY */
    public Ability ring = new Ability("Anello del potere", 0, 50, "Rende invulnerabili dagli attacci per due turni", new ImageIcon(getClass().getResource(PathStorage.A_RING)));                                                                        //Frodo
    public Ability whiteP = new Ability("Potere del Bianco", 300, 50, "Attacco dello stregone supremo", new ImageIcon(getClass().getResource(PathStorage.A_WHITE_POWER)));                                                                              //Gandalf
    public Ability myPrecius = new Ability("MY PRECIUS!!!",500, 50, "Fa impazzire chi la usa rendendolo piu' forte,\nma ne diminuisce la difesa", new ImageIcon(getClass().getResource(PathStorage.A_MY_PRECIUS)));                                                                          //Gollum
    public Ability eyePower = new Ability("Potere dell'occhio", 300, 50, "Richiama un'armata di orchi \ne draghi che infliggono molti danni", new ImageIcon(getClass().getResource(PathStorage.A_EYE_POWER)));                                            //Saruman
    public Ability asciaRotante = new Ability("Ascia Rotante", 190, 50, "Prende l'ascia e la fa ruotare \nfacendo saltare tutti i tettucci delle minicar", new ImageIcon(getClass().getResource(PathStorage.A_ASCIA_ROTANTE)));                           //Gimli (priorità 1 turno)
    public Ability colpoInfallibile = new Ability("Colpo Infallibile", 300, 50, "Colpo infallibile. \nHa il 100% di probilita' di colpire", new ImageIcon(getClass().getResource(PathStorage.A_COLPO_INFALLIBILE)));                                                                           //Legolas
    public Ability seeEver = new Ability("See EveryThing", 0, 50, "Vede tutto e riesce ad anticipare qualsiasi mossa. \nE' cosi' potente da poterti vedere pure \nmentre usi chatGPT per scrivere il tuo codice", new ImageIcon(getClass().getResource(PathStorage.A_SEE_EVER)));    //Sauron (50% miss e priorità 3 turni)
    public Ability frustaFuoco = new Ability("Frusta di fuoco", 300, 50, "Infigge molti danni. \nOttima per punire chi ti chiede aiuto a mezzanotte", new ImageIcon(getClass().getResource(PathStorage.A_FRESTA_FUOCO)));                                                                     //Balrog

    /* SUPER HERO ABILITY */
    public Ability perfectCoding = new Ability("Codice Perfetto", 9999, 1, "La capacita' di questo individuo di programmare è impressionante; \nuna logica, una grafica e una pulizia del codice perfetta. \nMETTE ANCHE LA JAVADOC!!!!", new ImageIcon(PathStorage.A_PERFETC_CODE));
    
    /* EMPTY ABILITY */
    public Ability empty = new Ability("", 0, 0, "", new ImageIcon(getClass().getResource(PathStorage.I_EMPTY)));
}
