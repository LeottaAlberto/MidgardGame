package midgardgamebeta;
import Utility.FrameOpener;

public class MainClass {

    public static final int NUM_CHARACTER = 16;
    public static final int NUM_ABILITY = NUM_CHARACTER;

    public static void main(String[] args) {
        Thread initObj = new Thread(()->{
            FrameOpener.init();
        });
        
        initObj.start();
        
        try {
            initObj.join();
        } catch (InterruptedException e) {
            System.err.println("Error => " + e);
        }
            
        // Settings
        Utility.FrameOpener.settings_model.setAudioModel(Utility.FrameOpener.audio_model);
        Utility.FrameOpener.fr_settings.setModel(Utility.FrameOpener.settings_model);
       
        // Gestione audio
        Utility.FrameOpener.audio_model.setVolumeBase(Utility.FrameOpener.audio_model.getMediunV());
        Utility.FrameOpener.audio_model.startBase();
        
        // openFrameHub();        
        FrameOpener.openFrame(Utility.FrameOpener.fr_hub, true);        
    }
}