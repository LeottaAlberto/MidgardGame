package midgardgamebeta;
import Utility.FrameOpener;

public class MainClass {

    public static final int NUM_CHARACTER = 16;
    public static final int NUM_ABILITY = NUM_CHARACTER;
    
    public static MainClass mc = new MainClass();

    // private static AudioModel audio_model;
    // private static FontModel font_model;
    // private static SettingsModel settings_model;
    // private static FrameSettings fr_settings;
    // public static FrameHub fr_hub;
    // private static FrameInfo fr_info;
    
    public static void main(String[] args) {
        // audio_model = new AudioModel();        // Audio Model
        // font_model = new FontModel();          // Font Model
        // settings_model = new SettingsModel();  // Settings Model
        
        
        // fr_info = new FrameInfo(); //Frame Info
        // fr_settings = new FrameSettings(font_model); //Frame Settings
        // fr_hub = new FrameHub(fr_settings, audio_model, font_model, fr_info);
        
        Utility.FrameOpener.fr_info.setVisible(false);
            
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