package Models;

import Utility.AniStorage;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class AniModel {
    private final int POS_ANI_X=60; //coordinata x della posizione dell'animazione nel panel
    private final int POS_ANI_Y=30; //coordinata y della posizione dell'animazione nel panel
    private final int SCALE=300;    //grandezza ani
    
    private int aniX=0,aniY=0;      //indici matrice animazione
    private int nSprite=0;          //numero sprite
    BufferedImage[][] animation;    //matrice con gli sprite
    private boolean  endAni;        //true->animazione terminata/false->aniamzione in corso
    
    /**
     * imposta il percorso per l'immagine, il numero di sprite e la dimensione in base ad anytype 
     * @param aniType definisce quale animazione verra utilizzata
     */
    public void loadAni(int aniType){
        String path="";
        int dim=0;
        switch (aniType) {
            case 1:
                path=AniStorage.sunBurn;
                nSprite=8;
                dim=100;
                break;
            case 2:
                path=AniStorage.felSpell;
                nSprite=10;
                dim=100;
                break;
            case 3:
                path=AniStorage.magic8;
                nSprite=8;
                dim=100;
                break;
            case 4:
                path=AniStorage.midNight;
                nSprite=8;
                dim=100;
                break;
            case 5:
                path=AniStorage.weaponHit;
                nSprite=6;
                dim=100;
                break;
            case 6:
                path=AniStorage.blue1;
                nSprite=6;
                dim=200;
                break;
            case 7:
                path=AniStorage.blue2_;
                nSprite=6;
                dim=200;
                break;
            case 8:
                path=AniStorage.blue3_;
                nSprite=6;
                dim=200;
                break;
            case 9:
                path=AniStorage.blue4_;
                nSprite=6;
                dim=200;
                break;
            case 10:
                path=AniStorage.electricBurst_;
                nSprite=4;
                dim=72;
                break;
            case 11:
                path=AniStorage.explosion_;
                nSprite=4;
                dim=32;
                break;
            case 12:
                path=AniStorage.splatter_;
                nSprite=3;
                dim=32;
                break;
        }
        animation=new BufferedImage[nSprite][nSprite];
        
        BufferedImage assets=null;
        InputStream is = AniModel.class.getResourceAsStream(path);    
        try {
            assets = ImageIO.read(is);                                 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (int i = 0; i < nSprite; i++) {
            for (int j = 0; j < nSprite; j++) {
                animation[i][j]=assets.getSubimage(dim*i,dim*j,dim,dim); 
            }
        }
    }
    
    /**
     * disegna sul panel il contenuto della matrice nelle posizioni [aniX][aniY]
     * @param g oggetto grafico
     */
    public void render(Graphics g){
        if(animation!=null){
            g.drawImage(animation[aniX][aniY], POS_ANI_X, POS_ANI_Y,SCALE,SCALE, null);
            updatePos();
        }
    }

    /**
     * aumenta indici della matrice
     */
    public void updatePos() {
        aniX++;
        if(aniX==nSprite){
            aniX=0;
            aniY++;
            if(aniY==nSprite) aniY=0;
        }
        
        if(aniX==nSprite-1 && aniY == nSprite-1) endAni=true;
    }
    /**
     * resetta gli indici e imposta l'animazione come pronta a ripartire
     */
    public void resetIndex() {
        aniX=0;
        aniY=0;
        endAni=false;
    }
    
    //Getter
    public int getAniX() {
        return aniX;
    }
    public int getAniY() {
        return aniY;
    }
    public int getnSprite() {
        return nSprite;
    }
    public boolean isEndAni() {
        return endAni;
    }
    
    
    
    
}
