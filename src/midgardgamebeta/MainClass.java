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
    private static AudioModel audioModel;
    private static FontModel fontModel;
    private static SettingsModel settingsModel;
    private static FrameSettings fs;
    private static FrameHub fh;
    private static FrameInfo fi;
    
    public static void main(String[] args) {
        audioModel = new AudioModel(); 
        fontModel = new FontModel(); //gestione Font
        settingsModel = new SettingsModel();  //Model Settings
        
        
        fi = new FrameInfo(); //Frame Info
        fs = new FrameSettings(fontModel, null, null); //Frame Settings
        fh = new FrameHub(fs, audioModel, fontModel, fi);
        
        fi.setVisible(false);
            
        //Settings
        settingsModel.setAudioModel(audioModel);
        fs.setModel(settingsModel);
       
        //Gestione audio
        audioModel.setVolumeBase(audioModel.getMediunV());
        audioModel.startBase();
        //openFrameInfo(fi);
        //Gestione Hub(prima finestra)
        openFrameHub();        
    }
    
    public static void openFrameHub(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice cc = ge.getDefaultScreenDevice();
        //cc.setFullScreenWindow(fh);
        fh.setVisible(true);
    }    
    
    public static void openFrameInfo(FrameInfo fi){
        if(!fi.isVisible()){
            fi.setLocationRelativeTo(null);
            fi.setSize(1600, 1000);
            fi.setResizable(false);
            fi.setVisible(true);
        }
    }
}
