package Entity;

import javax.swing.ImageIcon;

public class Hero extends Entity{
    //Costruttore
    public Hero(String name, int hp, int atk, int def, int prec, int mana,Ability atkSp, ImageIcon img ,ImageIcon icon){
        super(name, hp, atk, def, prec, mana,atkSp, img, icon);
    }
    //Costruttore-copia
    public Hero (Hero rif){
        super(rif.getName(),rif.getHp(),rif.getAtk(),rif.getDef(),rif.getPrec(),rif.getMana(),rif.getAtkSp(),rif.getImg(), rif.getIcon());   
    }
    // diminuisce il mana e ,se opportuno, modifica le statistiche
    public boolean usaAbilità(){
        
        if(this.mana>=atkSp.getConsumo())
        {
            if (this.atkSp.getNome().equalsIgnoreCase("MY PRECIUS"))
            {
                this.def-=50;
            }
            else if (this.atkSp.getNome().equalsIgnoreCase("Potere dell'occhio"))
            {
                this.atk+=100;
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