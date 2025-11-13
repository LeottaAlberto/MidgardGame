package Models;

import Utility.PathStorage;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class AudioModel {
    //Costanti
    public static final int FRAME = 24;
    public static final int MAXVOLUME = 6;
    public static final int MINVOLUME = -40;
    public static final int VOLUME_AUDIO_EFFECT = 2;
    public static final int VOLUME_AUDIO_HOVER_EFFECT = -20;

    
    //Sound Effect
    private Clip soundEffect;
    private FloatControl fcSoundEffect;
    private URL audioFoldSoundEffect;
    private AudioInputStream soundEF;
    
    //PathStorage
    private PathStorage pathStorage;
    
    //Base
    private Clip base;
    private FloatControl fcBase;
    private AudioInputStream soundBase;
    private URL audioFoldBase;
    private String[] soundFold;
    
    //Attributi
    public static int mediumV;
    private int error = 0;
    private int numBase = 0;
    
    /**
     * Costruttore per la base. Viene randomizzato un ordine delle basi e si succedono in loop
     */
    public AudioModel(){
        this.soundFold = randomTrack(); //Randomizzo l'ordine delle tracce
        inizializeBase(); //Inizializza la base
    }
    
    /**
     * Costruttore per i sound effect
     * @param pathSoundEffect path del sound effect
     * @param volume set del volume (max = 6 / min = -40)
     * @param nameSound nome del sound effect
     */
    public AudioModel(String pathSoundEffect, int volume, String nameSound){
        inizializeSound(pathSoundEffect, volume, nameSound);
    }

    //Getter
    public int getMaxV(){
        return this.MAXVOLUME;
    }
    public int getMinV(){
        return this.MINVOLUME;
    }
    public int getMediunV(){
        return this.mediumV;
    }
    public Clip getBase(){
        return this.base;
    }
    public FloatControl getFcBase(){
        return this.fcBase;
    }
    
    /**
     * Setta il volume della base con un valore massimo di 6 e uno minimo di -40
     * @param value volume < 6 && > -40
     */
    public void setVolumeBase(float value){
        System.out.println("SetVolumeEffect: " + this.fcBase.getValue());
        if(value > 6) this.fcBase.setValue(6f);
        else this.fcBase.setValue(value);
    }
     /**
     * Setta il volume del'audio effect con un valore massimo di 6 e uno minimo di -40
     * @param value volume < 6 && > -40
     */
    public void setVolumeSoundEffect(float value){
        System.out.println("SetVolumeEffect: " + this.fcSoundEffect.getValue());
        if(value > 6) this.fcSoundEffect.setValue(6f);
        else this.fcSoundEffect.setValue(value);
    }
    
    /**
     * Cambia il path per gli audio effect
     * @param newPath nuovo path
     * @param volume volume dell'audio effect
     * @param nameSound nome dell'audio effect
     */
    public void changePathSoundEffect(String newPath, int volume, String nameSound){
        if(!newPath.isBlank()) inizializeSound(newPath, volume, nameSound);
    }
    
    /**
     * Inizializza l'audio effect
     * @param pathSoundEffect path della traccia audio
     * @param volume volume da settare
     * @param nameSound dell'audio effect
     */
    private void inizializeSound(String pathSoundEffect, int volume, String nameSound){
        try {
            this.audioFoldSoundEffect = getClass().getResource(pathSoundEffect);
            this.soundEF = AudioSystem.getAudioInputStream(this.audioFoldSoundEffect); 
            this.soundEffect = AudioSystem.getClip();
            this.soundEffect.open(soundEF);
            this.fcSoundEffect = (FloatControl)this.soundEffect.getControl(FloatControl.Type.MASTER_GAIN);
        } catch (Exception e) {
            System.err.println("Errore nel caricare il sound effect: " + nameSound);
            error = -1;
        }
        setVolumeSoundEffect(volume);
    }
    
    /**
     * Randomizza lo schema di ripetizione della basi 
     * @return String[] centenente i path delle tracce
     */
    public String[] randomTrack(){
        Random rand = new Random();
        
        String[] app;        
        int appr = rand.nextInt(3);

        switch (appr) {
            case 0 -> {return app = new String[] {pathStorage.TRACK1, pathStorage.TRACK2, pathStorage.TRACK3};}
            case 1 -> {return app = new String[] {pathStorage.TRACK2, pathStorage.TRACK3, pathStorage.TRACK1};}
            case 2 -> {return app = new String[] {pathStorage.TRACK3, pathStorage.TRACK1, pathStorage.TRACK2};}
            default -> throw new AssertionError();
        }
    }
    
    /**
     * Mette pausa alla base
     */
    public void stopBase(){
        this.base.stop();
    }
    /**
     * Mette pausa allo special effect
     */
    public void stopAudioEffect(){
        this.soundEffect.stop();
    }
    
    /**
     * Fa un restard dell'audio effect
     */
    public void restartAudio(){
        try {
            stopAudioEffect();
            Thread.sleep(10);
            this.soundEffect.setFramePosition(0);
            this.soundEffect.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(AudioModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Fapartite gli audio effect
     */
    public void startAudioEffect(){
        this.soundEffect.setFramePosition(0);
        this.soundEffect.start();
    }
   /**
     * Fa partite la base
     */
    public void startBase(){
        this.base.start();

        //Thread che controlla se la base è in esecuzione o se ha finito
        Thread controlloBase = new Thread(new Runnable() {
            @Override
            public void run() {
                do{
                    if(base.getFramePosition() == base.getFrameLength()){
                        //Se la base ha concluso la sua esecuzione viene fatta partire la successiva
                        try {
                            if(numBase == soundFold.length-1) numBase = 0; //Se si finisce l'esecuzione di tutte le basi si ricomincia 
                            inizializeBase();
                            Thread.sleep(1000);
                            startBase();
                            return;
                        } catch (InterruptedException ex) {
                            Logger.getLogger(AudioModel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }while(base.isRunning());
            }
        });
        controlloBase.start();
    }

    /**
     * Inizializza la base
     */
    private void inizializeBase() {
        try {
            this.audioFoldBase = getClass().getResource(soundFold[numBase]);//URL
            this.soundBase = AudioSystem.getAudioInputStream(this.audioFoldBase); 
            this.base = AudioSystem.getClip();
            this.base.open(soundBase);
            this.fcBase = (FloatControl)this.base.getControl(FloatControl.Type.MASTER_GAIN);
        } catch (Exception e) {
            System.err.println("Errore nel caricare la base");
            error = -1;
        }
        numBase++;
//        this.mediumV = (int)((this.MAXVOLUME+this.MINVOLUME)/2);
        this.mediumV = (int)this.MAXVOLUME;
        setVolumeBase(this.mediumV);
    }
    
}
