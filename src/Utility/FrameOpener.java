package Utility;

import Models.AudioModel;
import Models.FontModel;
import Models.SettingsModel;
import Views.FrameCharacterChoice;
import Views.FrameGame;
import Views.FrameHub;
import Views.FrameInfo;
import Views.FrameSettings;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

/**
 *
 * @author alber
 */
public interface FrameOpener {
    //FrameOpener, FrameCharChoice, FrameGame
    
    public static final AudioModel audio_model = new AudioModel();
    public static final FontModel font_model = new FontModel();
    public static final SettingsModel settings_model = new SettingsModel();

    public static final FrameInfo fr_info = new FrameInfo();
    public static final FrameSettings fr_settings = new FrameSettings(font_model, settings_model);
    public static final FrameHub fr_hub = new FrameHub(fr_settings, audio_model, font_model, fr_info);
    public static final FrameCharacterChoice fr_char_choice = new FrameCharacterChoice(audio_model, fr_settings, font_model, fr_info);
    public static final FrameGame fr_game = new FrameGame(audio_model, fr_settings, font_model, fr_info);
    
    
    public static void openFrame(JFrame frame, JFrame frame_rif, int width, int height) {
        if(frame == null) throw new ExceptionInInitializerError("Frame Passato Null");
        if(frame_rif == null) throw new ExceptionInInitializerError("Frame Riferimento passato Null");
        
        if(!frame.isVisible()) {
            frame.setSize(width, height); 
            frame.setLocationRelativeTo(frame_rif);
            
            frame.setAlwaysOnTop(true);
            frame.setVisible(true);
        }
    }
    
    public static void openFrame(JFrame frame, boolean isUndecorated) {
        if (isUndecorated) {
            // Per fullscreen senza bordi
            frame.dispose();               // necessario per cambiare undecorated
            frame.setUndecorated(true);
            
            // Imposta il frame a fullscreen “vero”
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gd = ge.getDefaultScreenDevice();
            gd.setFullScreenWindow(frame);
        } else {
            // Per fullscreen con bordi e barra del titolo
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  // massimizza
            frame.setResizable(false);                      // opzionale
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

        frame.setVisible(true);
        frame.setAlwaysOnTop(false);
    }
}
