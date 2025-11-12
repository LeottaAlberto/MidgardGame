package Models;

import Entity.Entity;
import Entity.Hero;
import Entity.Normal;
import Utility.CharacterStorage;
import java.util.Random;

public class GameModel {
    
    private Hero playerH, comH; //Chacater hero
    private Normal playerN, comN;//Chacater normal
    private CharacterStorage chStorage; //lista chacater
    
    Random r = new Random();
    
    private int sPl,sCom; //scelta pl e com
    private boolean priorita; //true->iniiza player/false->inizia com
    private int frodoRingPl=-1,seeSauronPl=-1;
    private boolean asciaGimliPl=false;
    
    private int frodoRingCom=-1;
    private int seeSauronCom=-1;    // -1:disattivato - 0:solo 50% avoid - 1/2/3 anche priorità turno            
    private boolean asciaGimliCom=false;
    
    private int turni=0;    //turni battaglia
    private int diff;       //difficoltà gioco

    /**
     * riempie gli oggetti con i personaggi scelti
     * @param playerN normal scelto dal player
     * @param comN nomral scelto per il com
     * @param playerH hero scelto dal player
     * @param comH hero scelto per il com
     */
    public void setPersScelti(Normal playerN, Normal comN,Hero playerH, Hero comH) {
        this.playerN=playerN;
        this.comN=comN;
        
        this.playerH=playerH;
        this.comH=comH;
        
    }
    
    /**
     * 
     * @param sPl scelta azione player
     * @return valore ceh determina chi fa la prima mossa nel tunro corrente
     */
    public int start(int sPl){
        this.sPl=sPl;
        
        turni++;
        //ricarica mana
        if(playerH==null) playerN.ricaricaMana();
        else playerH.ricaricaMana();
        
        if(comH==null) comN.ricaricaMana();
        else comH.ricaricaMana();
        //com decide la sua mossa
        sCom=getCom().IAScelta(getPlayer(), turni, priorita, diff);
        
        int coin=r.nextInt(100);
 
        if(asciaGimliCom==true||seeSauronCom>0) {
            coin=1;
            asciaGimliCom=false;
            
            if (seeSauronCom>0) seeSauronCom++;
            if(seeSauronCom==4) seeSauronCom=0;
        }
        
        if(asciaGimliPl==true || seeSauronPl>0) {
            coin=100;
            asciaGimliPl=false;
            
            if (seeSauronPl>0) seeSauronPl++;
            if(seeSauronPl==4) seeSauronPl=0;
        }
        
        return coin;
    }
    //azioni PL
    public boolean attackPl(){
        int coin=100;
        if(seeSauronCom>=0) coin=r.nextInt(100);
        if(getPlayer().attacca() && frodoRingCom<0 && coin>50) return true;
        else return false;
    }
    public int defencePl(int dmg){
        return getPlayer().difendi(dmg);
    }
    public boolean abilityPl(){
        int coin=100;
        if(seeSauronCom>=0) coin=r.nextInt(100);
        if(playerH==null){
            if(playerN.usaAbilità() && frodoRingCom<0 && coin>50)return true;
            else return false;
        }else{
            if(playerH.usaAbilità() && frodoRingCom<0 && coin>50)return true;
            else return false;
        }
    }
    //azioni COM
    public boolean attackCom(){
        int coin=100;
        if(seeSauronPl>=0) coin=r.nextInt(100);
        if(getCom().attacca() && frodoRingPl<0 && coin>50) return true;
        else return false;
    }
    public int defenceCom(int dmg){
        return getCom().difendi(dmg);
    }
    public boolean abilityCom(){
        int coin=100;
        if(seeSauronPl>=0) coin=r.nextInt(100);
        if(comH==null){
            if(comN.usaAbilità() && frodoRingPl<0 && coin>50)return true;
            else return false;
        }else{
            if(comH.usaAbilità() && frodoRingPl<0 && coin>50)return true;
            else return false;
        }
    }
    
    /**
     * calcola il danno fatto dal player che potrebbe variare in determiante condizioni
     * @param ability true->attacco con attacco speciale / false->attacco con attacco normale
     * @return nuovo danno
     */
    public int calcoloDmgPl(boolean ability){
        int dmg=0;
        //ricavo danno dell'abillità
        if(ability){
                if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("Freccia Magica")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("Incendio")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("Gentilezza")){int rand=r.nextInt(100);if(rand>50) getCom().diminuisciStat(getCom().getPrec()/2,5);}
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("One Punch Man")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("Anello del potere")) frodoRingPl=0;
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("Potere del Bianco")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("MY PRECIUS")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("Potere dell'occhio")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("Ascia Rotante")){dmg=getPlayer().getAtkSp().getDmg();asciaGimliPl=true;}
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("Colpo Infallibile")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("See EveryThing")) seeSauronPl=1;
                else if (getPlayer().getAtkSp().getNome().equalsIgnoreCase("Frusta di fuoco")) dmg=getPlayer().getAtkSp().getDmg();
        }
        //ricavo il danno dell' attacco normale
        if(playerH==null){
            if(comH==null){
                if(!ability)dmg=playerN.getAtk()-comN.getDef();
                if (playerN.getRazza().equalsIgnoreCase("drago") && comN.getRazza().equalsIgnoreCase("elfo")) dmg=(int) (dmg*1.5);
                else if (playerN.getRazza().equalsIgnoreCase("elfo") && comN.getRazza().equalsIgnoreCase("orco")) dmg=(int) (dmg*1.5);
                else if (playerN.getRazza().equalsIgnoreCase("troll") && comN.getRazza().equalsIgnoreCase("orco")) dmg=(int) (dmg*1.5);
                else if (playerN.getRazza().equalsIgnoreCase("troll") && comN.getRazza().equalsIgnoreCase("umano")) dmg=(int) (dmg*1.5);
                else if (playerN.getRazza().equalsIgnoreCase("umano") && comN.getRazza().equalsIgnoreCase("nani")) dmg=(int) (dmg*1.5);
                else if (playerN.getRazza().equalsIgnoreCase("nazgul") && comN.getRazza().equalsIgnoreCase("hobbit")) dmg=(int) (dmg*1.5);
            }
            else {
                if(!ability)dmg=playerN.getAtk()-comH.getDef() ;
            }
        }
        else{
            if(comH==null) dmg=playerH.getAtk()-comN.getDef();
            else {
                if(!ability)dmg=playerH.getAtk()-comH.getDef();
                if (playerH.getName().equalsIgnoreCase("Sauron") && comH.getName().equalsIgnoreCase("Frodo")) dmg=(int) (dmg*1.5);
                else if (playerH.getName().equalsIgnoreCase("Sauron") && comH.getName().equalsIgnoreCase("Gollum")) dmg=(int) (dmg*1.5);
                else if (playerH.getName().equalsIgnoreCase("Saruman") && comH.getName().equalsIgnoreCase("Gollum")) dmg=(int) (dmg*1.5);
                else if (playerH.getName().equalsIgnoreCase("Saruman") && comH.getName().equalsIgnoreCase("Gandalf")) dmg=(int) (dmg*1.5);
                else if (playerH.getName().equalsIgnoreCase("Gandalf") && comH.getName().equalsIgnoreCase("Balrog")) dmg=(int) (dmg*1.5);
            }          
        }
        
        if(dmg<0) dmg=0;
        return dmg;
    }
    
    /**
     * calcola il danno fatto dal com che potrebbe variare in determiante condizioni
     * @param ability true->attacco con attacco speciale / false->attacco con attacco normale
     * @return nuovo danno
     */
    public int calcoloDmgCom(boolean ability){
        int dmg=0;
         //ricavo danno dell'abillità
        if(ability){
                if (getCom().getAtkSp().getNome().equalsIgnoreCase("Freccia Magica")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("Incendio")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("Gentilezza")){int rand=r.nextInt(100);if(rand>50) getCom().diminuisciStat(getCom().getPrec()/2,5);}
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("One Punch Man")) dmg=getPlayer().getAtkSp().getDmg();
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("Anello del potere")) frodoRingPl=0;
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("Potere del Bianco")) dmg=getCom().getAtkSp().getDmg();
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("MY PRECIUS")) dmg=getCom().getAtkSp().getDmg();
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("Potere dell'occhio")) dmg=getCom().getAtkSp().getDmg();
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("Ascia Rotante")){dmg=getCom().getAtkSp().getDmg();asciaGimliPl=true;}
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("Colpo Infallibile")) dmg=getCom().getAtkSp().getDmg();
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("See EveryThing")) seeSauronPl=1;
                else if (getCom().getAtkSp().getNome().equalsIgnoreCase("Frusta di fuoco")) dmg=getCom().getAtkSp().getDmg();
        }else dmg=getCom().getAtk()-getPlayer().getDef();
         //ricavo danno dell'attacco normale
        if(comH==null){
            if(playerH==null){
                if (comN.getRazza().equalsIgnoreCase("drago") && playerN.getRazza().equalsIgnoreCase("elfo")) dmg=(int) (dmg*1.5);
                if (comN.getRazza().equalsIgnoreCase("elfo") && playerN.getRazza().equalsIgnoreCase("orco")) dmg=(int) (dmg*1.5);
                if (comN.getRazza().equalsIgnoreCase("troll") && playerN.getRazza().equalsIgnoreCase("orco")) dmg=(int) (dmg*1.5);
                if (comN.getRazza().equalsIgnoreCase("troll") && playerN.getRazza().equalsIgnoreCase("umano")) dmg=(int) (dmg*1.5);
                if (comN.getRazza().equalsIgnoreCase("umano") && playerN.getRazza().equalsIgnoreCase("nani")) dmg=(int) (dmg*1.5);
                if (comN.getRazza().equalsIgnoreCase("nazgul") && playerN.getRazza().equalsIgnoreCase("hobbit")) dmg=(int) (dmg*1.5);
            }
        }
        else{
            if(playerN==null){
                if (comH.getName().equalsIgnoreCase("Sauron") && playerH.getName().equalsIgnoreCase("Frodo")) dmg=(int) (dmg*1.5);
                if (comH.getName().equalsIgnoreCase("Sauron") && playerH.getName().equalsIgnoreCase("Gollum")) dmg=(int) (dmg*1.5);
                if (comH.getName().equalsIgnoreCase("Saruman") && playerH.getName().equalsIgnoreCase("Gollum")) dmg=(int) (dmg*1.5);
                if (comH.getName().equalsIgnoreCase("Saruman") && playerH.getName().equalsIgnoreCase("Gandalf")) dmg=(int) (dmg*1.5);
                if (comH.getName().equalsIgnoreCase("Balrog") && playerH.getName().equalsIgnoreCase("Gandalf")) dmg=(int) (dmg*1.5);
            }         
        }
        
        if(dmg<0) dmg=0;
        return dmg;
    }
    /**
     * aggiorna, se è necessario, le variabili booleane delle abilità
     * @param sem true->Player / false->Com
     */
    public void checkAbility(boolean sem) {
        if(sem){
            if(frodoRingCom==0) frodoRingCom=1;
            else if (frodoRingCom==1) frodoRingCom=2;
            else if (frodoRingCom==2) frodoRingCom=-1;
        }
        else{
           if(frodoRingPl==0) frodoRingPl=1;
           else if (frodoRingPl==1) frodoRingPl=2;
           else if (frodoRingPl==2) frodoRingPl=-1;
        }
    }
    /**
     * sceglie quale animazione usare in relazione a chi attacca e cosa sceglie di fare
     * @return int dell'animazione 
     */
    public int checkAnimation() {
         if(playerH==null){
            if(playerN.getRazza().equalsIgnoreCase("elfo")){
                if(sPl==-1)return 5;
                else return 6;
            }
            else if(playerN.getRazza().equalsIgnoreCase("drago")){
                if(sPl==-1) return 12;
                else return 1;
            }
            else if(playerN.getRazza().equalsIgnoreCase("troll")){
                if(sPl==-1) return 5;
                else return 11;
            }
            else if(playerN.getRazza().equalsIgnoreCase("orco")) return 12;
            else if(playerN.getRazza().equalsIgnoreCase("nano")) return 7;
            else if(playerN.getRazza().equalsIgnoreCase("umano")) return 12;
            else if(playerN.getRazza().equalsIgnoreCase("hobit")) return 9;
            else if(playerN.getRazza().equalsIgnoreCase("nazgul")) return 3;
        }else{
            if(playerH.getName().equalsIgnoreCase("gandalf")){
                if(sPl==-1)return 9;
                else return 4;
            }
            else if(playerH.getName().equalsIgnoreCase("gimli")){
                if(sPl==-1) return 5;
                else return 7;
            }
            else if(playerH.getName().equalsIgnoreCase("balrog")){
                if(sPl==-1) return 12;
                else return 1;
            }
            else if(playerH.getName().equalsIgnoreCase("saruman")){
                if(sPl==-1)return 3;
                else return 2;
            }
            else if(playerH.getName().equalsIgnoreCase("legolas")){
                if(sPl==-1) return 8;
                else return 6;
            }
            else if(playerH.getName().equalsIgnoreCase("frodo")){
                if(sPl==-1) return 5;
                else return 8;
            }
            else if(playerH.getName().equalsIgnoreCase("gollum")){
                if(sPl==-1)return 12;
                else return 11;
            }
            else if(playerH.getName().equalsIgnoreCase("sauron")){
                if(sPl==-1) return 12;
                else return 10;
            }

        }
        return 12;
    }

    //Getter
    public int getSCom() {
        return sCom;
    }
    public Entity getPlayer(){
        if(playerH==null) return playerN;
        return playerH;
    }
    public Entity getCom(){
        if(comH==null) return comN;
        return comH;
    }
    public boolean getPriorita(){
        return this.priorita;
    }
    public int getTurni(){
        return this.turni;
    }
    //Setter
    public void setPriorita(boolean priorita) {
        this.priorita=priorita;
    }
    public void setDiff(int difficulty) {
        this.diff=difficulty;
    }

    
}
