package Entity;

import java.util.Random;
import javax.swing.ImageIcon;


public class Entity {
    protected String name;   //Nome charcater
    protected int hp;        //HitPoints
    private int hpMax;       //Numero massimo di HP
    protected int atk;       //Attacco del character
    protected int def;       //Difesa del character
    protected int prec;      //Precisione del character
    protected int mana;      //Mana
    protected int maxMana;   //Mana massimo
    protected Ability atkSp; //Attacco speciale del character
    protected ImageIcon img; //ImageIcon del character per intero
    protected ImageIcon icon;//ImageIcon del character icona
    
    //Costruttore
    public Entity(String name, int hp, int atk, int def, int prec,int mana, Ability atkSp, ImageIcon img, ImageIcon icon){
        this.name = name; 
        this.hp = hp;
        this.hpMax = hp;
        this.atk = atk;
        this.def = def;
        this.prec = prec;
        this.mana = mana; 
        this.maxMana = mana;
        this.atkSp = atkSp;
        this.img = img;
        this.icon = icon;      
    }
    //Costruttore-copia
    public Entity(Entity rife)
    {
        this.name = rife.getName(); 
        this.hp = rife.getHp();
        this.hpMax=rife.getHp();
        this.atk = rife.getAtk();
        this.def = rife.getDef();
        this.prec = rife.getPrec();
        this.mana = rife.getMana(); 
        this.maxMana = rife.getMana();
        this.atkSp = rife.getAtkSp();
        this.img = rife.getImg();
        this.icon = rife.getIcon();
    }

    //Getter
    public int getHp() {
        return this.hp;
    }
    public int getHpMax() {
        return hpMax;
    }
    public int getAtk() {
        return this.atk;
    }
    public int getDef() {
        return this.def;
    }
    public String getName() {
        return this.name;
    }
    public int getPrec() {
        return this.prec;
    }
    public int getMana() {
        return this.mana;
    }
    public int getMaxMana() {
        return maxMana;
    }
    public Ability getAtkSp(){
        return this.atkSp;
    }
    public ImageIcon getImg() {
        return this.img;
    }
    public ImageIcon getIcon() {
        return this.icon;
    }
    
    /**
     * Se il numero randomizzato se è <= precisione attacca
     * @return true--> se l'attacco va a segno
     *         false--> se l'attacco fallisce
     */
    public boolean attacca(){
        Random r = new Random();
        int prob = r.nextInt(100);
        
        if(prob <= this.prec) return true;
        else return false;
    }
    
    /**
     * Se il danno è < 100 il danno == 0 >
     * Se il danno è >= 200 il danno /= 2
     * Se il danno è >= 100 il danno /= 4
     * 
     * @param danno atk ricevente
     * @return attacco scalato dalla difesa
     */
    public int difendi(int danno) {
        if(danno < 100) danno = 0;
        else if(danno >= 200) danno = danno / 2;
        else if(danno >= 100) danno = danno / 4;
        return danno;
    }
    
    /**
     * Diminuisce le statistiche
     * @param v di quanto abbassare 
     * @param s statistica da diminuire 1(hp) 2(atk) 3(def) 4(prec) 5(mana)
     */
    public void diminuisciStat(int v,int s)
    {
        if(s==1) {this.hp-=v; if(this.hp==0) this.hp=0;}
        else if(s==2) {this.atk-=v; if(this.atk==0) this.atk=0;}
        else if(s==3) {this.def-=v; if(this.def==0) this.def=0;}
        else if(s==4) {this.prec-=v; if(this.prec==0) this.prec=0;}
        else if(s==5) {this.mana-=v; if(this.mana==0) this.mana=0;}
    }
    
    /**
     * Intelligenza del COM
     * @param pl character del player
     * @param turni numero di turni
     * @param priorita
     * @param diff
     * @return che tipo di attacco fare: -1 = attacco / 0 = difesa / 1 = attacco speciale
     */
    public int IAScelta(Entity pl,int turni,boolean priorita, int diff){
        
        Random r= new Random();
        int scelta=0,app;
        
        if(diff==1) scelta=r.nextInt(3)-1;
        else if(diff==2){
            if (this.hp >((hpMax*80)/100)){
                app=r.nextInt(100);
                if(app<90) scelta=-1;
                else scelta=0;
            }
            if(pl.getAtk()+100<this.atk){
                app=r.nextInt(100);
                if(app<70) scelta=-1;
                else scelta=0;
            }
            if(pl.getDef()>=this.atk) scelta=0;
            else scelta=-1;
            scelta=probAtkSp(turni);
            if (scelta==1){
                if (this.mana<this.atkSp.getConsumo()) scelta=-1;
            } 
            
        }else if(diff==3){
            if(!priorita){
                if(turni==1) scelta=1;
                else{
                    if(this.hp>this.hpMax/2  && pl.getHp()<pl.getHpMax()/2 ) {
                        scelta=probAtkSp(turni);
                        if(scelta==0) scelta=-1;
                    }else if(pl.getHp()>pl.getHpMax()/2  && this.hp<this.hpMax/2){
                        scelta=probAtkSp(turni);
                        if(scelta==0) scelta=-1;
                    }
                    else scelta=-1;
                }
            }else{
                int perc70=this.hpMax*70/100;
                int perc40=pl.getHpMax()*30/100;
                app=r.nextInt();
                if(turni==1){
                    if(app<70)probAtkSp(turni);
                    else scelta=0;
                }else{
                    if(this.hp>perc70 && pl.getHp()<perc40) scelta=probAtkSp(turni);
                    else {
                        if(app<50) scelta=0;
                        else if(app>75) scelta=-1;
                        else scelta=1;
                    }
                }
            }
            
            if(pl.getHp()-this.atk*1.5<0) scelta=1;
            if(scelta==1 && this.mana<this.getAtkSp().getConsumo()) scelta=-1;
        }

        return scelta;
    }


    /**
     * Metodo controllato dalla IA, che conrtolla se è opportuno utilizzare l'attacco speciale
     * @param turni numero turni
     * @return -1 = attacco / 0 = difesa / 1 = attacco speciale
     */
    private int probAtkSp(int turni) {
        int app;
        Random r= new Random();
      
        app=r.nextInt(100);
        if (this.atkSp.getNome().equalsIgnoreCase("Resistenza")||
            this.atkSp.getNome().equalsIgnoreCase("Increase")||
            this.atkSp.getNome().equalsIgnoreCase("Re Antico")||
            this.atkSp.getNome().equalsIgnoreCase("See EveryThing")
            ){
            if (turni==1) 
            {
                if(app<90) return 1;
                else if(app>95) return -1;
                else return 0;
            }
        }
        else if(this.atkSp.getNome().equalsIgnoreCase("Kaioken")){
            if (this.hp >((hpMax*50)/100)) if(app<=10) return 1;
            if (this.hp >((hpMax*20)/100)) if(app<=50) return 1;
            if (this.hp >((hpMax*10)/100)) if(app<=70) return 1;
        }
        else{
            if (app>70) return 1;
            else if(app>40) return -1;
            else return 0;
        }

        return -1;
    }
} 
