package Views;

import Models.AniModel;
import Models.AudioModel;
import Models.FontModel;
import Models.GameModel;
import Utility.PathStorage;
import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import midgardgamebeta.MainClass;

public class FrameGame extends javax.swing.JFrame {

    private AudioModel specialEffectPL;
    private AudioModel specialEffectCOM;
    
    private FrameSettings fs;
    private final FrameInfo fi;
    private AudioModel audioModel;
    private GameModel model;
    private AniModel aniModel;
    private FontModel fModel;

    PanelAni panelAni = new PanelAni(this); //oanel per le animazioni

    private int aniIndex = 0;       //determina quali animazione verrà eseguita
    private Icon nameCOM, namePL;   //immagini nomi personaggi
    private boolean manaRicaricato; // true->mana già ricaricato / false->mana da ricaricare
    private boolean fine;           //true->partita finita / false-> partita in corso
    private TextAreaPlus txtA_PL;   //log di gioco

    public FrameGame(AudioModel audioModel, FrameSettings fs, Icon nameCOM, Icon namePL, FontModel fModel, FrameInfo fi) {
        initComponents();
        this.setSize(1920, 1080);
        this.txtA_PL = new TextAreaPlus(10);
        this.audioModel = audioModel;
        this.fi = fi;
        this.fs = fs;
        this.nameCOM = nameCOM;
        this.namePL = namePL;
        this.fModel = fModel;

        initPanelAni();
        initTextAreaPlus();

        // AudioModel per gli effetti della battaglia
        this.specialEffectPL = new AudioModel(PathStorage.SE_ATK_NORMAL, AudioModel.VOLUME_AUDIO_EFFECT,"Attacco normale");
        this.specialEffectCOM = new AudioModel(PathStorage.SE_ATK_NORMAL, AudioModel.VOLUME_AUDIO_EFFECT,"Attacco normale");

        this.fs.setFG(this);
        if (fs.getJS_SetValueMusic() == audioModel.getMinV())
            jTB_Suond.setSelected(true);

        this.jL_TxtAreaPlus_Log.setForeground(new Color(176, 176, 176));
        SwingUtilities.invokeLater(() -> centrareFinestra());
    }
    
    private void centrareFinestra() {
        // Ottieni le dimensioni dello schermo
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screenDevices = ge.getScreenDevices();

        if (screenDevices.length > 0) {
            GraphicsDevice screen = screenDevices[0];
            DisplayMode mode = screen.getDisplayMode();

            // Calcola la posizione x e y per centrare la finestra
            int posX = (mode.getWidth() - getWidth()) / 2;
            int posY = (mode.getHeight() - getHeight()) / 2;

            // Imposta la posizione della finestra
            setLocation(posX, posY);
        }
    }
    
    //Getter
    public AudioModel getAudioEffectPL() {
        return this.specialEffectPL;
    }
    public AudioModel getAudioEffectCOM() {
        return this.specialEffectCOM;
    }

    /**
     * imposta model del frameGame
     * @param gameModel model del gioco
     */
    public void setModel(GameModel gameModel) {
        this.model = gameModel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup2 = new javax.swing.ButtonGroup();
        jP_Settings = new javax.swing.JPanel();
        jTB_Suond = new javax.swing.JToggleButton();
        jB_Settings = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jP_Com = new javax.swing.JPanel();
        jL_ComName = new javax.swing.JLabel();
        jP_HpCom = new javax.swing.JProgressBar();
        jP_ComPg = new javax.swing.JPanel();
        jL_ComIcon = new javax.swing.JLabel();
        jP_Pl = new javax.swing.JPanel();
        jP_HpPl = new javax.swing.JProgressBar();
        jp_ManaPl = new javax.swing.JProgressBar();
        jB_Atk = new javax.swing.JButton();
        jB_Ability = new javax.swing.JButton();
        jB_Esc = new javax.swing.JButton();
        jB_Def = new javax.swing.JButton();
        jL_PlName = new javax.swing.JLabel();
        jL_TxtAreaPlus_Log = new javax.swing.JLabel();
        jL_BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jP_Settings.setOpaque(false);
        jP_Settings.setLayout(new java.awt.GridLayout(1, 3));

        jTB_Suond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/sound.png"))); // NOI18N
        jTB_Suond.setBorderPainted(false);
        jTB_Suond.setContentAreaFilled(false);
        jTB_Suond.setFocusPainted(false);
        jTB_Suond.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/noSound.png"))); // NOI18N
        jTB_Suond.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTB_BtnEntered(evt);
            }
        });
        jTB_Suond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTB_SuondActionPerformed(evt);
            }
        });
        jP_Settings.add(jTB_Suond);

        jB_Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/gear.png"))); // NOI18N
        jB_Settings.setBorderPainted(false);
        jB_Settings.setContentAreaFilled(false);
        jB_Settings.setFocusPainted(false);
        jB_Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTB_BtnEntered(evt);
            }
        });
        jB_Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SettingsActionPerformed(evt);
            }
        });
        jP_Settings.add(jB_Settings);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/info.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jP_Settings.add(jButton1);

        getContentPane().add(jP_Settings);
        jP_Settings.setBounds(1710, 990, 180, 80);

        jP_Com.setOpaque(false);
        jP_Com.setLayout(new java.awt.GridBagLayout());

        jL_ComName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jL_ComName.setForeground(new java.awt.Color(255, 0, 0));
        jL_ComName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_ComName.setText(".");
        jL_ComName.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        jP_Com.add(jL_ComName, gridBagConstraints);

        jP_HpCom.setForeground(new java.awt.Color(0, 153, 0));
        jP_HpCom.setMaximumSize(new java.awt.Dimension(800, 30));
        jP_HpCom.setPreferredSize(new java.awt.Dimension(50, 14));
        jP_HpCom.setString("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 50, 0);
        jP_Com.add(jP_HpCom, gridBagConstraints);

        jP_ComPg.setOpaque(false);
        jP_ComPg.setLayout(new javax.swing.OverlayLayout(jP_ComPg));

        jL_ComIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHero/frodo.png"))); // NOI18N
        jP_ComPg.add(jL_ComIcon);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(-100, 30, 0, 0);
        jP_Com.add(jP_ComPg, gridBagConstraints);

        getContentPane().add(jP_Com);
        jP_Com.setBounds(980, 60, 840, 730);

        jP_Pl.setOpaque(false);
        jP_Pl.setLayout(new java.awt.GridBagLayout());

        jP_HpPl.setForeground(new java.awt.Color(0, 153, 0));
        jP_HpPl.setString("0");
        jP_HpPl.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 430;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 139);
        jP_Pl.add(jP_HpPl, gridBagConstraints);

        jp_ManaPl.setForeground(new java.awt.Color(0, 0, 204));
        jp_ManaPl.setString("0");
        jp_ManaPl.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 298;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, -20);
        jP_Pl.add(jp_ManaPl, gridBagConstraints);

        jB_Atk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jB_Atk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgGame/attackButton.png"))); // NOI18N
        jB_Atk.setBorderPainted(false);
        jB_Atk.setContentAreaFilled(false);
        jB_Atk.setFocusPainted(false);
        jB_Atk.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_AtkMouseMoved(evt);
            }
        });
        jB_Atk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_AtkMouseExited(evt);
            }
        });
        jB_Atk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AtkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = -6;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 80, 0, 0);
        jP_Pl.add(jB_Atk, gridBagConstraints);

        jB_Ability.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jB_Ability.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgGame/specialButton.png"))); // NOI18N
        jB_Ability.setBorderPainted(false);
        jB_Ability.setContentAreaFilled(false);
        jB_Ability.setFocusPainted(false);
        jB_Ability.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB_Ability.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_AbilityMouseMoved(evt);
            }
        });
        jB_Ability.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_AbilityMouseExited(evt);
            }
        });
        jB_Ability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AbilityActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -6;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, -25, 0, 135);
        jP_Pl.add(jB_Ability, gridBagConstraints);

        jB_Esc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jB_Esc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgGame/quitButton.png"))); // NOI18N
        jB_Esc.setBorderPainted(false);
        jB_Esc.setContentAreaFilled(false);
        jB_Esc.setFocusPainted(false);
        jB_Esc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_EscMouseMoved(evt);
            }
        });
        jB_Esc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_EscMouseExited(evt);
            }
        });
        jB_Esc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EscActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -6;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(-3, -25, 5, 135);
        jP_Pl.add(jB_Esc, gridBagConstraints);

        jB_Def.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jB_Def.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgGame/defenceButton.png"))); // NOI18N
        jB_Def.setBorderPainted(false);
        jB_Def.setContentAreaFilled(false);
        jB_Def.setFocusPainted(false);
        jB_Def.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_DefMouseMoved(evt);
            }
        });
        jB_Def.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_DefMouseExited(evt);
            }
        });
        jB_Def.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DefActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = -6;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(-3, 80, 5, 0);
        jP_Pl.add(jB_Def, gridBagConstraints);

        jL_PlName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jL_PlName.setForeground(new java.awt.Color(255, 0, 0));
        jL_PlName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_PlName.setText(".");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(100, 203, 0, 0);
        jP_Pl.add(jL_PlName, gridBagConstraints);

        getContentPane().add(jP_Pl);
        jP_Pl.setBounds(10, 530, 560, 520);

        jL_TxtAreaPlus_Log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_TxtAreaPlus_Log.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jL_TxtAreaPlus_Log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_TxtAreaPlus_LogMouseClicked(evt);
            }
        });
        getContentPane().add(jL_TxtAreaPlus_Log);
        jL_TxtAreaPlus_Log.setBounds(640, 820, 550, 250);

        jL_BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgGame/backgroundGame.png"))); // NOI18N
        jL_BackGround.setText("jLabel1");
        jL_BackGround.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_BackGroundMouseClicked(evt);
            }
        });
        getContentPane().add(jL_BackGround);
        jL_BackGround.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jL_TxtAreaPlus_LogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_TxtAreaPlus_LogMouseClicked
        openFrameLog();
    }//GEN-LAST:event_jL_TxtAreaPlus_LogMouseClicked

    private void jB_AtkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jB_AtkActionPerformed
        start(-1);
    }// GEN-LAST:event_jB_AtkActionPerformed

    private void jB_DefActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jB_DefActionPerformed
        start(0);
    }// GEN-LAST:event_jB_DefActionPerformed

    private void jB_AbilityActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jB_AbilityActionPerformed
        start(1);
    }// GEN-LAST:event_jB_AbilityActionPerformed

    private void jB_EscActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jB_EscActionPerformed
        System.exit(0);
    }// GEN-LAST:event_jB_EscActionPerformed

    private void jB_AtkMouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jB_AtkMouseMoved
        jB_Atk.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_ATTACK_HOVER)));
    }// GEN-LAST:event_jB_AtkMouseMoved

    private void jB_AtkMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jB_AtkMouseExited
        jB_Atk.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_ATTACK)));
    }// GEN-LAST:event_jB_AtkMouseExited

    private void jB_DefMouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jB_DefMouseMoved
        jB_Def.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_DEFENCE_HOVER)));
    }// GEN-LAST:event_jB_DefMouseMoved

    private void jB_DefMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jB_DefMouseExited
        jB_Def.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_DEFENCE)));
    }// GEN-LAST:event_jB_DefMouseExited

    private void jB_AbilityMouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jB_AbilityMouseMoved
        jB_Ability.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_SPECIAL_HOVER)));
    }// GEN-LAST:event_jB_AbilityMouseMoved

    private void jB_AbilityMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jB_AbilityMouseExited
        jB_Ability.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_SPECIAL)));
    }// GEN-LAST:event_jB_AbilityMouseExited

    private void jB_EscMouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jB_EscMouseMoved
        jB_Esc.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_QUIT_HOVER)));
    }// GEN-LAST:event_jB_EscMouseMoved

    private void jB_EscMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jB_EscMouseExited
        jB_Esc.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_QUIT)));
    }// GEN-LAST:event_jB_EscMouseExited

    private void jB_SettingsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jB_SettingsActionPerformed
        fs.showFrameSettings();
    }// GEN-LAST:event_jB_SettingsActionPerformed

    private void jTB_SuondActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTB_SuondActionPerformed
        if (!jTB_Suond.isSelected()) {
            fs.setJS_SetValueMusic((int) fs.getLastValue());
            fs.setVolumeBySlider((int) fs.getLastValue());
            fs.changeMusicState();
            audioModel.startBase();
        } else {
            fs.setLastValue(fs.getJS_SetValueMusic());
            fs.setVolumeBySlider(audioModel.getMinV());
            fs.changeMusicState();
            audioModel.stopBase();
        }
    }// GEN-LAST:event_jTB_SuondActionPerformed

    private void jL_BackGroundMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jL_BackGroundMouseClicked
        if (this.fine) {
            endGame();
        }
    }// GEN-LAST:event_jL_BackGroundMouseClicked

    private void jTB_BtnEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTB_BtnEntered
        checkSoundEffect(PathStorage.SE_BTN_HOVER, AudioModel.VOLUME_AUDIO_HOVER_EFFECT, "SE_BTN_HOVER");
    }// GEN-LAST:event_jTB_BtnEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        MainClass.openFrameInfo(fi);
    }// GEN-LAST:event_jButton1ActionPerformed

    public boolean jTB_SoundIsSelected() {
        return jTB_Suond.isSelected();
    }

    public void jTB_SetSelection(boolean selection) {
        this.jTB_Suond.setSelected(selection);
    }

    /**
     * imposta dei valori di default prima di iniziare la partita
     */
    public void setDefaultValue() {
        setButton(false);

        try {
            jL_ComName.setIcon(nameCOM);
            jL_PlName.setIcon(namePL);
            jL_PlName.setText("");
            jL_ComName.setText("");
        } catch (Exception e) {
            System.err.println("Errore nel caricare le immagini");
        }

        jL_ComIcon.setIcon(model.getCom().getImg());

        jP_HpCom.setMaximum(model.getCom().getHp());
        jP_HpCom.setValue(model.getCom().getHp());
        jP_HpCom.setString(String.valueOf(model.getCom().getHp()));

        jB_Ability.setText(model.getPlayer().getAtkSp().getNome());

        jP_HpPl.setMaximum(model.getPlayer().getHp());
        jP_HpPl.setValue(model.getPlayer().getHp());
        jP_HpPl.setString(String.valueOf(model.getPlayer().getHp()));

        jp_ManaPl.setMaximum(model.getPlayer().getMana());
        jp_ManaPl.setValue(model.getPlayer().getMana());
        jp_ManaPl.setString(String.valueOf(model.getPlayer().getMana()));

        setButton(true);

        scriviLog("Scegli la tua mossa");
    }

    /**
     * fa iniziare la partita e definisce chi farà la prima mossa in ogni turno 
     * @param sPl scelta PL 
     */
    private void start(int sPl) {
        setButton(false);
        //imposta difficoltà gioco indicata dalle impostazioni
        model.setDiff(fs.getDifficulty());
        int coin = model.start(sPl);
        //il com fa la sua scelta
        int sCom = model.getSCom();

        // inizia player
        if (coin > 50) {
            model.setPriorita(true);
            azionePl(sPl, sCom, 0);
        }
        // start com
        else {
            model.setPriorita(false);
            azioneCom(sCom, sPl, 0);
        }
    }

    /**
     * In base alla scelta dell'PL
     * @param sCom scelta COM
     * @param sPl scelta PL
     * @param dmg danno
     */
    private void azioneCom(int sCom, int sPl, int dmg) {
        //se attacca
        if (sCom == -1) {
            scriviLog(model.getCom().getName() + " attacca");
            //Se l'attacco va a segno
            if (model.attackCom()) {
                //Calcola il danno
                dmg = model.calcoloDmgCom(false);
                //Scrive il log
                scriviLog(model.getCom().getName() + " infligge " + dmg + " danni ");
                //Si impostano l'audio effect
                setAndPlayAudioEffect("normal", this.specialEffectCOM);
                nextMove2(sCom, sPl, dmg, false);
                //Se il PL evita l'attacco
            }else {
                //Aggiorna le variabili delle abilità
                model.checkAbility(false);
                //Scrive il log
                scriviLog("L'avversario evita l'attacco");
                //Se ha attaccato per primo fa attaccare il PL
                if (!model.getPriorita()) azionePl(sPl, sCom, dmg);
                //Abilita i btn
                else setButton(true);
            }
        //Se difende
        }else if (sCom == 0) {
            //Se difende per primo non difende niente
            if (!model.getPriorita()) {
                scriviLog(model.getCom().getName() + " difende nulla ");
                azionePl(sPl, sCom, 0);
            //Se difende per secondo subisce un danno minorato
            }else{
                dmg = model.defenceCom(dmg);
                if (dmg > 0) {
                    scriviLog(model.getCom().getName() + " difende ");
                    scriviLog("Riceve " + dmg + " danni ");
                    scalaHpCom(dmg);
                } else {
                    scriviLog(model.getCom().getName() + " difende nulla ");
                    scalaHpCom(dmg);
                }
            }
        //Se attacca specialmente
        }else if (sCom == 1){
            scriviLog(model.getCom().getName() + " usa " + model.getCom().getAtkSp().getNome());
            //Se l'attacco va a segno
            if (model.abilityCom()) {
                //Calcolo danno
                dmg = model.calcoloDmgCom(true);
                //Scrivo il log
                if (dmg > 0)scriviLog(model.getCom().getName() + " infligge " + dmg + " danni ");
                //Imposto gli adio effect
                setAndPlayAudioEffect(this.model.getCom().getName(), this.specialEffectCOM);
                //Scalo il mana
                nextMove2(sCom, sPl, dmg, false);
            //Se il mana è insufficiente non attacca
            }else{
                scriviLog("Mana Insufficente");
                if (!model.getPriorita()) azionePl(sPl, sCom, dmg);
                else scalaHpPl(dmg);
            }
        }
        //Se è la fine del turno traccio una linea nel log
        if (model.getPriorita()) scriviLog("-------Fine Turno "+ model.getTurni() +"-------");
    }

    /**
     * In base alla scelta dell'PL
     * @param sPl scelta PL
     * @param sCom scelta COM
     * @param dmg danno
     */
    private void azionePl(int sPl, int sCom, int dmg) {
        //se attacca
        if (sPl == -1) {
            scriviLog(model.getPlayer().getName() + " attacca");
            //Se l'attacco va a segno
            if (model.attackPl()) {
                //Calcola il danno
                dmg = model.calcoloDmgPl(false);
                //Scrive il log
                scriviLog(model.getPlayer().getName() + " infligge " + dmg + " danni ");
                //Si impostano l'audio effect
                setAndPlayAudioEffect("normal", this.specialEffectPL);
                //cose che determianno cose
                nextMove2(sCom, sPl, dmg, true);
            } 
            //Se il COM evita l'attacco
            else {
                //Aggiorna le variabili delle abilità
                model.checkAbility(true);
                //Scrive il log
                scriviLog("L'avversario evita l'attacco");
                //Se ha attaccato per primo fa attaccare il COM
                if (model.getPriorita()) azioneCom(sCom, sPl, dmg);
                //Abilita i btn
                else setButton(true);
            }
        } 
        //Se difende
        else if (sPl == 0) {
            //Se difende per primo non difende niente
            if (model.getPriorita()) {
                scriviLog(model.getPlayer().getName() + " difende nulla");
                azioneCom(sCom, sPl, 0);
            }
            //Se difende per secondo subisce un danno minorato
            else {
                dmg = model.defencePl(dmg);
                if (dmg > 0) {
                    scriviLog(model.getPlayer().getName() + " difende");
                    scriviLog("Riceve " + dmg + "danni");
                    scalaHpPl(dmg);
                } else {
                    scriviLog(model.getPlayer().getName() + " difende nulla");
                    scalaHpCom(dmg);

                }
            }
        } 
        //Se attacca specialmente
        else if (sPl == 1) {
            scriviLog(model.getPlayer().getName() + " usa " + model.getPlayer().getAtkSp().getNome());
            //Se l'attacco va a segno
            if (model.abilityPl()) {
                //Calcolo danno
                dmg = model.calcoloDmgPl(true);
                //Scrvio il log
                scriviLog(model.getPlayer().getName() + " infligge " + dmg + " danni-Mana: " + model.getPlayer().getMana());
                //Imposto gli adio effect
                setAndPlayAudioEffect(this.model.getPlayer().getName(), this.specialEffectPL);
                //Scalo il mana
                scalaMana(model.getPlayer().getAtkSp().getConsumo());
                //Cose
                nextMove2(sCom, sPl, dmg, true);
            } 
            //Se il mana è insufficiente non attacca
            else {
                scriviLog("Mana Insufficente!");
                if (model.getPriorita()) azioneCom(sCom, sPl, dmg);
                else scalaHpCom(dmg);
            }
        }
        //Se è la fine del turno traccio una linea nel log
        if (!model.getPriorita()) scriviLog("-------Fine Turno "+ model.getTurni() +"-------");
    }

    /**
     * HA LO STESSO SCOPO, MA PIU' SEMPLICE
     * @param sCom scelta COM
     * @param sPl scelta PL
     * @param dmg danno
     * @param sem true = PL / false = COM
     */
    private void nextMove1(int sCom, int sPl, int dmg, boolean sem) {
        if (sem) {
            if (model.getPriorita())
                azioneCom(sCom, sPl, dmg);
        } else {
            if (!model.getPriorita())
                azionePl(sPl, sCom, dmg);
        }
    }

    /**
     * Stabilisce delle azioni determinate dai parametri
     * @param sCom scelta del COM 
     * @param sPl scelta del PL
     * @param dmg danno
     * @param sem true = PL / false = COM
     */
    private void nextMove2(int sCom, int sPl, int dmg, boolean sem) {
        //Controlla se il metodo è stato chiamato dal PL o dal COM
        if (sem) {
            //Controlla se il PL ha iniziato per primo
            if (model.getPriorita()) {
                //Controlla se la scelta non è la difesa
                if (sCom != 0) {
                    scalaHpCom(dmg);
                    nextMove1(sCom, sPl, dmg, true);
                } else
                    azioneCom(sCom, sPl, dmg);
            } else
                scalaHpCom(dmg);
        }else {
            if (!model.getPriorita()) {
                if (sPl != 0) {
                    scalaHpPl(dmg);
                    nextMove1(sCom, sPl, dmg, false);
                } else
                    azionePl(sPl, sCom, dmg);
            } else
                scalaHpPl(dmg);
        }
    }

    /**
     * Fa diminuire la vita al COM di un punto ogni 10 millisecondi. Chiama il metodo diminuisciStat per far scalare gli HP
     * @param danno danno inflitto dal PL
     */
    private void scalaHpCom(int danno) {
        setButton(false);
        int vitaR = jP_HpCom.getValue() - danno;
        int perc40 = (model.getCom().getHpMax() * 40) / 100;
        int perc20 = (model.getCom().getHpMax() * 20) / 100;
        //Chiamo il metodo diminuisciStat passando il danno fatto dal com e abbasso gli HP del PL
        model.getCom().diminuisciStat(danno, 1);

        //Fa partire l'animazione
        if(danno > 0) {
            aniIndex = checkAniIndex();
            panelAni.animation(aniIndex);
        }

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = jP_HpCom.getValue(); i >= vitaR; i--) {
                    //In base al numero di HP il colore della vita cambia
                    // <= 40 giallo
                    if (jP_HpCom.getValue() <= perc40 && jP_HpCom.getValue() > perc20) jP_HpCom.setForeground(new Color(196, 194, 0)); //Gialla
                    //Rosso
                    else if (jP_HpCom.getValue() < perc20) jP_HpCom.setForeground(new Color(195, 4, 4)); //Rosso
                    
                    jP_HpCom.setValue(i);
                    jP_HpCom.setString(String.valueOf(jP_HpCom.getValue()));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FrameGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //Se il COM ha 0 HP finisce la partita
                if (jP_HpCom.getValue() == 0) end(true);
                //Ricarica il mana se la partita non è finita
                if (!manaRicaricato) {
                    ricaricaMana();
                    manaRicaricato = true;
                }else manaRicaricato = false;
                
                setButton(true);
            }
        });
        th.start();
    }

    /**
     * Fa diminuire la vita al player di un punto ogni 10 millisecondi. Chiama il metodo diminuisciStat per far scalare gli HP
     * @param danno danno ingflitto dal COM
     */
    private void scalaHpPl(int danno) {
        int vitaR = jP_HpPl.getValue() - danno;
        int perc40 = (model.getCom().getHpMax() * 40) / 100;
        int perc20 = (model.getCom().getHpMax() * 20) / 100;
        //Chiamo il metodo diminuisciStat passando il danno fatto dal com e abbasso gli HP del PL
        model.getPlayer().diminuisciStat(danno, 1);

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = jP_HpPl.getValue(); i >= vitaR; i--) {
                    //In base al numero di HP il colore della vita cambia
                    // <= 40 giallo
                    if (jP_HpPl.getValue() <= perc40 && jP_HpPl.getValue() > perc20)
                        jP_HpPl.setForeground(new Color(197, 195, 4)); //Giallo
                    // < 20 Rosso
                    else if (jP_HpPl.getValue() < perc20)
                        jP_HpPl.setForeground(new Color(195, 4, 4)); //Rosso
                    jP_HpPl.setValue(i);
                    jP_HpPl.setString(String.valueOf(jP_HpPl.getValue()));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FrameGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //Se il PL ha 0 HP finisce la partita
                if (jP_HpPl.getValue() == 0) end(false);
                //Ricarica il mana se la partita non è finita
                if (!manaRicaricato) {
                    ricaricaMana();
                    manaRicaricato = true;
                }else manaRicaricato = false;
                
                setButton(true);
            }
        });
        th.start();
    }

    /**
     * Aumenta il value di jp_ManaPl di 20. Il value aumenta ogni 20 millisecondi
     */
    private void ricaricaMana() {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    jp_ManaPl.setValue(jp_ManaPl.getValue() + 1);
                    jp_ManaPl.setString(String.valueOf(jp_ManaPl.getValue()));
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FrameGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        th.start();
    }

    /**
     * Abbassa il valore della barra del mana. Abbassa il value della jp_ManaPl ogni 20 millisecondi
     * @param costo costro  mana abilità
     */
    private void scalaMana(int costo) {

        int manaR = jp_ManaPl.getValue() - costo;

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = jp_ManaPl.getValue(); i >= manaR; i--) {
                    jp_ManaPl.setValue(i);
                    jp_ManaPl.setString(String.valueOf(jp_ManaPl.getValue()));
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FrameGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        th.start();
    }

    /**
     * Mette tutti i componenti visibili = false. Camia l'Icon della JLabel jL_BackGround in base all'esito della battaglia
     * @param esito true = vince pl / false = vince com
     */
    private void end(boolean esito) {
        jP_Com.setVisible(false);
        jP_Pl.setVisible(false);
        jP_Settings.setVisible(false);
        jL_TxtAreaPlus_Log.setVisible(false);

        if (esito && !fine) {
            jL_BackGround.setIcon(new ImageIcon(getClass().getResource(PathStorage.L_WIN)));
            fine = true;
        } else if (!esito && !fine) {
            jL_BackGround.setIcon(new ImageIcon(getClass().getResource(PathStorage.L_DEFEAT)));
            fine = true;
        }
    }

    /**
     * Scrive nella jLabel jL_TxtAreaPlus_Log e aggiunge alla txtA_PL le nuove righe
     * @param txt stringa da aggiungere
     */
    public void scriviLog(String txt) {
        txtA_PL.add(txt);
        jL_TxtAreaPlus_Log.setText(convertToMultiline(txtA_PL.textRows() + "\n"));
    }

    /**
     * Cambia lo status dei JButton
     * @param status determina se true o false
     */
    private void setButton(boolean status) {
        jB_Atk.setEnabled(status);
        jB_Def.setEnabled(status);
        jB_Ability.setEnabled(status);
        jB_Esc.setEnabled(status);
    }

    /**
     * Utilizza i tag html per rendere una stringa multiline
     * @param orig stringa da convertire
     * @return stringa multiline
     */
    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

    /**
     * Inizializza la textAreaPlus e la label log
     */
    private void initTextAreaPlus() {
        this.fModel.createNewFont(16f);
        jL_TxtAreaPlus_Log.setFont(this.fModel.getFont());
    }

    /**
     * Inizializza il panel per le animazioni
     */
    private void initPanelAni() {
        this.aniModel = new AniModel();
        this.panelAni.setModel(aniModel);
        this.jP_ComPg.add(panelAni);
        this.jP_ComPg.add(jL_ComIcon);
    }

    /**
     * Chiama il metodo charkAnimation
     * @return un intero che determina quale tipo di animazione si sta eseguendo
     */
    private int checkAniIndex() {
        return this.model.checkAnimation();
    }

    public void setJTB_Sound(boolean value) {
        jTB_Suond.setSelected(value);
    }

    public void checkSoundEffect(String path, int volume, String nameSound) {
        if (this.fs.isJCB_SoundEffect()) {
            this.audioModel.changePathSoundEffect(path, volume, nameSound);
            this.audioModel.restartAudio();
        }
    }
    /**
     * Chiude la finestra corrente e apre il FrameHub
     */
    private void endGame() {
        this.dispose();
        MainClass.openFrameHub();
    }

    /**
     * cambia il path dell'audioModel dell'audio effect in base al nome del
     * personaggio.
     * Fa partire l'audio effect
     * 
     * @param typeAudioEffect nome del personaggio attaccante
     */
    private void setAndPlayAudioEffect(String typeAudioEffect, AudioModel audioEffect) {
        switch (typeAudioEffect) {
            //Alcuni character hanno degli audio effect personalizzati
            case "Leila" -> audioEffect.changePathSoundEffect(PathStorage.SE_FRECCIA_MAGICA, AudioModel.VOLUME_AUDIO_EFFECT, "Freccia Magica");
            case "Goku" -> audioEffect.changePathSoundEffect(PathStorage.SE_KAIOKEN, AudioModel.VOLUME_AUDIO_EFFECT, "Kaioken");
            case "Sdentato" -> audioEffect.changePathSoundEffect(PathStorage.SE_INCENDIO, AudioModel.VOLUME_AUDIO_EFFECT, "Incendio");
            case "Gollum" -> audioEffect.changePathSoundEffect(PathStorage.SE_MY_PRECIOUS, AudioModel.VOLUME_AUDIO_EFFECT, "MY PRECIOUS!!!");
            case "Gandalf" -> audioEffect.changePathSoundEffect(PathStorage.SE_WHITE_POWER, AudioModel.VOLUME_AUDIO_EFFECT, "GANDALF!");
            case "Frodo" -> audioEffect.changePathSoundEffect(PathStorage.SE_STATUS_UPGRADE, AudioModel.VOLUME_AUDIO_EFFECT, "Status upgrade");
            case "Sauron" -> audioEffect.changePathSoundEffect(PathStorage.SE_STATUS_UPGRADE, AudioModel.VOLUME_AUDIO_EFFECT, "Status upgrade");
            case "Bilbo" -> audioEffect.changePathSoundEffect(PathStorage.SE_STATUS_UPGRADE, AudioModel.VOLUME_AUDIO_EFFECT, "Status upgrade");
            case "Brontolo" -> audioEffect.changePathSoundEffect(PathStorage.SE_STATUS_UPGRADE, AudioModel.VOLUME_AUDIO_EFFECT, "Status upgrade");
            case "Shrek" -> audioEffect.changePathSoundEffect(PathStorage.SE_STATUS_UPGRADE, AudioModel.VOLUME_AUDIO_EFFECT, "Status upgrade");
            case "Dissennatore" -> audioEffect.changePathSoundEffect(PathStorage.SE_STATUS_UPGRADE, AudioModel.VOLUME_AUDIO_EFFECT, "Status upgrade");

            //Se il personaggio attaccante non è tra quelli con audio effect dedicati viene fatto partire un audio effect standard
            default -> {
                if (typeAudioEffect.equalsIgnoreCase("normal")) audioEffect.changePathSoundEffect(PathStorage.SE_ATK_NORMAL, AudioModel.VOLUME_AUDIO_EFFECT,"Attacco Normale");
                else{
                    //Randomizzo un numero da 0 a 2 e faccio partire un audio effect diverso
                    switch (new Random().nextInt(3)) {
                        case 0 -> audioEffect.changePathSoundEffect(PathStorage.SE_CLASSIC_SPECIAL_ATK_1, AudioModel.VOLUME_AUDIO_EFFECT, "Attacco speciale classico 1");
                        case 1 -> audioEffect.changePathSoundEffect(PathStorage.SE_CLASSIC_SPECIAL_ATK_2, AudioModel.VOLUME_AUDIO_EFFECT, "Attacco speciale classico 2");
                        case 2 -> audioEffect.changePathSoundEffect(PathStorage.SE_CLASSIC_SPECIAL_ATK_3, AudioModel.VOLUME_AUDIO_EFFECT, "Attacco speciale classico 3");
                    }
                }
            }
        }
        audioEffect.startAudioEffect();
    }
    
    private void openFrameLog(){
        FrameLog fLog= new FrameLog(this.txtA_PL.allCellRows());
        fLog.setLocationRelativeTo(null);
        fLog.setSize(1000, 800);
        fLog.setVisible(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jB_Ability;
    private javax.swing.JButton jB_Atk;
    private javax.swing.JButton jB_Def;
    private javax.swing.JButton jB_Esc;
    private javax.swing.JButton jB_Settings;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jL_BackGround;
    private javax.swing.JLabel jL_ComIcon;
    private javax.swing.JLabel jL_ComName;
    private javax.swing.JLabel jL_PlName;
    private javax.swing.JLabel jL_TxtAreaPlus_Log;
    private javax.swing.JPanel jP_Com;
    private javax.swing.JPanel jP_ComPg;
    private javax.swing.JProgressBar jP_HpCom;
    private javax.swing.JProgressBar jP_HpPl;
    private javax.swing.JPanel jP_Pl;
    private javax.swing.JPanel jP_Settings;
    private javax.swing.JToggleButton jTB_Suond;
    private javax.swing.JProgressBar jp_ManaPl;
    // End of variables declaration//GEN-END:variables
}