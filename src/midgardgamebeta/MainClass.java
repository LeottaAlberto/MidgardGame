package midgardgamebeta;

import Models.AudioModel;
import Models.FontModel;
import Models.SettingsModel;
import Views.*;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Locale;
import javax.swing.JFrame;

public class MainClass {

    public static final int NUM_CHARACTER = 16;
    public static final int NUM_ABILITY = NUM_CHARACTER;
    
    public static final int FRAME_INFO_WIDTH = 1600;
    public static final int FRAME_INFO_HEIGHT = 1000;
    
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
        
        // openFrameHub();        
        openFrame(fr_hub);        
    }
    
    public static void openFrame(JFrame frame, JFrame frame_rif, int width, int height) {
        if(!frame.isVisible()) {
            fr_info.setSize(width, height); 
            frame.setLocationRelativeTo(frame_rif);
            frame.setVisible(true);
        }
    }
    
    public static void openFrame(JFrame frame) {
        if(!frame.isVisible()) {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice cc = ge.getDefaultScreenDevice();
            cc.setFullScreenWindow(frame);
            frame.setVisible(true);
        }
    }
}