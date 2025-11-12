package Entity;

import javax.swing.ImageIcon;

public class Ability {
    
    private String nome;        //Nome Abilità
    private int dmg;            //Quanto danno fa l'abilità
    private int consumo;        //Consumo del mana dell'abilità
    private String descrizione; //Descrizione dell'abilità
    private ImageIcon icon;     //icona abilità

    //Costruttore
    public Ability(String nome, int dmg, int consumo, String descrizione, ImageIcon icon) {
        this.nome = nome;
        this.dmg = dmg;
        this.consumo=consumo;
        this.descrizione = descrizione;
        this.icon = icon;
    }
    //Costruttore-copia
    public Ability(Ability rife){
        this.nome = rife.getNome();
        this.dmg = rife.getDmg();
        this.consumo = rife.getConsumo();
        this.descrizione = rife.getDescrizione();
        this.icon = rife.getIcon();
    }

    //Getter
    public String getNome() {
        return nome;
    }
    public int getDmg() {
        return dmg;
    }
    public int getConsumo(){
        return this.consumo;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public ImageIcon getIcon(){
        return this.icon;
    }
}
