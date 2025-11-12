package Views;

import Models.AniModel;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelAni extends JPanel{
    
    private final int SPEED=70;
    FrameGame frame;
    private AniModel model;
    //Costruttore
    public PanelAni(FrameGame frame){
        this.frame = frame;
        setOpaque(false);
    }
    
    //chiama il metodo del model per disegnare sul panel
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        model.render(g);
    }
    /**
     * imposta il mdel della classe
     * @param model model della classe
     */
    public void setModel(AniModel model){
        this.model=model;
    }
    /**
     * viene caricata la matrice nel model e poi si avvia il Thread dell'animazione
     * che chiama in loop il metodo repaint() della classe jPanel
     * @param tyAni definsce quale animazione verrà eseguita
     */
    public void animation(int tyAni) {
        setVisible(true);
        model.loadAni(tyAni);
        int n=model.getnSprite()*model.getnSprite();
        
        Thread ani = new Thread(() -> {
            while(true){
                repaint();
                try {Thread.sleep(SPEED);} catch (InterruptedException ex) {}
                
                if(model.isEndAni()) break;
            }
            setVisible(false);
            model.resetIndex();
        });
        ani.start();
    }
    
    
}
