package Models;

import javax.swing.JSlider;

public class SettingsModel {
    
    private boolean open = false; //true->frame visibile / false->frame non visibile
    public AudioModel audioModel;//model
    private float lastValue = 10; //ultimo valore volume
    
    //Getter
    public int getValue(JSlider jS_SetVolumeMusic) {
        return jS_SetVolumeMusic.getValue();
    }
    public float getLastValue(){
        return this.lastValue;
    }
    public boolean isOpen() {
        return open;
    }

    //Setter
    public void setOpen(boolean open) {
        this.open = open;
    }
    public void setAudioModel(AudioModel audiomodel){
        this.audioModel=audiomodel;
    }
    public void setLastValue(float value){
        if(value <= 6 && value >= -40) this.lastValue = value;
    }
    
    /**
     * fa bloccare la base di sottofondo
     * @param jS_SetVolumeMusic volume
     */
    public void stopSound(JSlider jS_SetVolumeMusic) {
        audioModel.stopBase();
        if(lastValue != jS_SetVolumeMusic.getValue()) lastValue = jS_SetVolumeMusic.getValue();
        jS_SetVolumeMusic.setValue(jS_SetVolumeMusic.getMinimum());
    }

    /**
     * fa partire la base di sottofondo
     * @param jS_SetVolumeMusic volume
     */
    public void startSound(JSlider jS_SetVolumeMusic) {
        if(lastValue != 10){
            audioModel.setVolumeBase(lastValue);
            jS_SetVolumeMusic.setValue((int)audioModel.getFcBase().getValue());
            audioModel.startBase();
        }
    }
}
