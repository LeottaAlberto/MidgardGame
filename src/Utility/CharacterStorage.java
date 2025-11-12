package Utility;

import Entity.Entity;
import Entity.Hero;
import Entity.Normal;
import javax.swing.ImageIcon;

public class CharacterStorage {
    AbilityStorage as = new AbilityStorage();
    
    public Hero gandalf = new Hero("Gandalf", 1000, 400, 150, 90, 100, as.whiteP ,new ImageIcon(getClass().getResource(PathStorage.L_GANDALF)), new ImageIcon(getClass().getResource(PathStorage.B_GANDALF)));
    public Hero legolas = new Hero("Legolas", 1000, 400, 100, 100, 80, as.colpoInfallibile ,new ImageIcon(getClass().getResource(PathStorage.L_LEGOLAS)), new ImageIcon(getClass().getResource(PathStorage.B_LEGOLAS)));
    public Hero gimli = new Hero("Gimli", 1000, 300, 150, 70, 50, as.asciaRotante ,new ImageIcon(getClass().getResource(PathStorage.L_GIMLI)), new ImageIcon(getClass().getResource(PathStorage.B_GIMLI)));
    public Hero frodo = new Hero("Frodo", 1000, 200, 80, 75, 70, as.ring ,new ImageIcon(getClass().getResource(PathStorage.L_FRODO)), new ImageIcon(getClass().getResource(PathStorage.B_FRODO)));
    public Hero gollum = new Hero("Gollum", 1000, 250, 80, 70, 65, as.myPrecius ,new ImageIcon(getClass().getResource(PathStorage.L_GOLLUM)), new ImageIcon(getClass().getResource(PathStorage.B_GOLLUM)));
    public Hero saruman = new Hero("Saruman", 1000, 400, 100, 85, 90, as.eyePower ,new ImageIcon(getClass().getResource(PathStorage.L_SARUMAN)), new ImageIcon(getClass().getResource(PathStorage.B_SARUMAN)));
    public Hero sauron = new Hero("Sauron", 1000, 500, 190, 90, 85, as.seeEver ,new ImageIcon(getClass().getResource(PathStorage.L_SAURON)), new ImageIcon(getClass().getResource(PathStorage.B_SAURON)));
    public Hero balrog = new Hero("Balrog", 1000, 400, 150, 75, 80, as.frustaFuoco ,new ImageIcon(getClass().getResource(PathStorage.L_BALROG)), new ImageIcon(getClass().getResource(PathStorage.B_BALROG)));
    
    /* NAME / HP / ATK / DEF / PRECISIONE / MANA / SPECIAL ATK / RAZZA / ICON */
    public Normal elfo = new Normal("Leila", 1000, 300, 100, 95, 85, as.frecciaM ,"elfo", new ImageIcon(getClass().getResource(PathStorage.L_LEILA)), new ImageIcon(getClass().getResource(PathStorage.B_LEILA)));
    public Normal drago = new Normal("Sdentato", 1000, 400, 100, 80, 80, as.incendio ,"drago", new ImageIcon(getClass().getResource(PathStorage.L_SDENTATO)), new ImageIcon(getClass().getResource(PathStorage.B_SDENTATO)));
    public Normal hobbit = new Normal("Bilbo", 1000, 200, 100, 65, 65, as.gentilezza ,"hobbit", new ImageIcon(getClass().getResource(PathStorage.L_BILBO)), new ImageIcon(getClass().getResource(PathStorage.B_BILBO)));
    public Normal nazgul = new Normal("Dissing", 1000, 300, 100, 95, 80, as.reAntico ,"nazgul", new ImageIcon(getClass().getResource(PathStorage.L_DISSENNATORE)), new ImageIcon(getClass().getResource(PathStorage.B_DISSENNATORE)));
    public Normal orco = new Normal("Shreak", 1000, 300, 120, 85, 50, as.increase ,"orco", new ImageIcon(getClass().getResource(PathStorage.L_SHREAK)), new ImageIcon(getClass().getResource(PathStorage.B_SHREAK)));
    public Normal umano = new Normal("Goku", 1000, 300, 90, 90, 50, as.kaioken ,"umano", new ImageIcon(getClass().getResource(PathStorage.L_GOKU)), new ImageIcon(getClass().getResource(PathStorage.B_GOKU)));
    public Normal nano = new Normal("Brontolo", 1000, 200, 100, 75, 60, as.resistenza ,"nano", new ImageIcon(getClass().getResource(PathStorage.L_BRONTOLO)), new ImageIcon(getClass().getResource(PathStorage.B_BRONTOLO)));
    public Normal troll = new Normal("Feis", 1000, 400, 150, 75, 50, as.onePunchMan ,"troll", new ImageIcon(getClass().getResource(PathStorage.L_FEIS)), new ImageIcon(getClass().getResource(PathStorage.B_FEIS)));
    
    public Entity programmatore = new Entity("Mattalbe", 9999, 9999, 9999, 9999, 9999, as.perfectCoding, null, new ImageIcon(getClass().getResource(PathStorage.L_SUPER_HERO)));
    public Entity empty = new Entity("", 0, 0, 0, 0, 0, as.empty, null, new ImageIcon(getClass().getResource(PathStorage.I_EMPTY)));
}
