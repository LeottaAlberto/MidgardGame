package Models;

import Utility.PathStorage;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class FontModel {

    //Size standard per il font
    public static final float STARDARD_SIZE = 25f;
    
    private Font font;
    
    //Getter
    public Font getFont(){
        return this.font;
    }
    
    /**
     * Metodo che permette di inizializzare il font
     * @param dimFont grandezza del font
     * @return 0 = impossibile caricare il font / 1 = font caricato correttamente
     */
     public int createNewFont(float dimFont){
        try {
            this.font = Font.createFont(Font.TRUETYPE_FONT, new File(PathStorage.FONT_MORIA)).deriveFont(dimFont);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(PathStorage.FONT_MORIA)));
        } catch (FontFormatException | IOException ex) {
            System.err.println("Impossibile caricare il font");
            return 0;
        }
        return 1;
    }
}
