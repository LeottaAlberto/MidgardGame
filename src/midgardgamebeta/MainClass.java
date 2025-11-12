package midgardgamebeta;

import Models.AudioModel;
import Models.FontModel;
import Models.SettingsModel;
import Views.*;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class MainClass {

    public static final int NUM_CHARACTER = 16;
    public static final int NUM_ABILITY = NUM_CHARACTER;
    
    public static MainClass mc = new MainClass();

    private static AudioModel audio_model;
    private static FontModel font_model;
    private static SettingsModel settings_model;
    private static FrameSettings fr_settings;
    private static FrameHub fr_hub;
    private static FrameInfo fr_info;
    
    public static void main(String[] args) {
        audio_model = new AudioModel();        // Audio Model
        font_model = new FontModel();          // Font Model
        settings_model = new SettingsModel();  // Settings Model
        
        
        fr_info = new FrameInfo(); //Frame Info
        fr_settings = new FrameSettings(font_model, null, null); //Frame Settings
        fr_hub = new FrameHub(fr_settings, audio_model, font_model, fr_info);
        
        fr_info.setVisible(false);
            
        // Settings
        settings_model.setAudioModel(audio_model);
        fr_settings.setModel(settings_model);
       
        // Gestione audio
        audio_model.setVolumeBase(audio_model.getMediunV());
        audio_model.startBase();
        
        openFrameHub();        
    }
    
    public static void openFrameHub(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice cc = ge.getDefaultScreenDevice();
        cc.setFullScreenWindow(fr_hub);
    }    
    
    public static void openFrameInfo(FrameInfo fr_info){
        if(!fr_info.isVisible()){
            fr_info.setLocationRelativeTo(null);
            fr_info.setSize(1600, 1000);
            fr_info.setVisible(true);
        }
    }
}
