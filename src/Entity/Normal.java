package Entity;

import javax.swing.ImageIcon;

public class Normal extends Entity{

    private String razza;
    //Costruttore
    public Normal(String name, int hp, int atk, int def, int prec,int mana, Ability atkSp,String razza,ImageIcon img, ImageIcon icon) {
        super(name, hp, atk, def, prec,mana,atkSp,img,icon);
        this.razza=razza;
    }
    //Costruttore-copia
    public Normal(Normal rif){
        super(rif.getName(),rif.getHp(),rif.getAtk(),rif.getDef(),rif.getPrec(),rif.getMana(),rif.getAtkSp(),rif.getImg(), rif.getIcon());
        this.razza=rif.getRazza();
    }
 
    //Getter
    public String getRazza() {
        return this.razza;
    }
    
    // diminuisce il mana e ,se opportuno, modifica le statistiche
    public boolean usaAbilità(){
        
        if(this.mana>=atkSp.getConsumo()){
            if (this.atkSp.getNome().equalsIgnoreCase("resistenza")){
                this.def+=100;
            }
            else if (this.atkSp.getNome().equalsIgnoreCase("increase")){
                
                this.atk+=100;
            }
            else if(this.atkSp.getNome().equalsIgnoreCase("Kaioken")){
                if(this.hp<=500) this.atk+=100;
                if(this.hp<=300) this.atk+=200;
                if(this.hp<=200) this.atk+=300;
                if(this.hp>=100) this.atk+=400;
            }
            else if(this.atkSp.getNome().equalsIgnoreCase("Re Antico")){
                this.atk+=100;
                this.def+=100;
            }
            this.mana-=atkSp.getConsumo();
            return true;
        }
        else return false;
        
    }
    
    //ricarica il mana di un determinato quantitativo punti
    public void ricaricaMana() {
        if(this.mana<this.maxMana) mana+=20;
    }
    
}
