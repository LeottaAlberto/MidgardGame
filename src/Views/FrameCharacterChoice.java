package Views;

import Entity.Hero;
import Entity.Normal;
import Models.AudioModel;
import Models.FontModel;
import Models.GameModel;
import Views.SettingsJPanel;
import Utility.CharacterStorage;
import Utility.PathStorage;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import midgardgamebeta.MainClass;

public class FrameCharacterChoice extends javax.swing.JFrame {
    
    private final CharacterStorage chStorage= new CharacterStorage();
    private final AudioModel audioModel;
    private final FrameSettings fs;
    private final FrameInfo fi;
    private final FontModel fModel;
    
    private final SettingsJPanel settingsJPanel;

    private JLabel app;
    private Icon appIcon;
    
    private boolean plChoice = true;
    private boolean tyP,tyC; //Parametri passati per individuare la sottoclasse di entity scelta. true = hero / false = normal
    private String buttonPress = "normal";
    
    private Normal plNSelect=null,comNSelect=null;
    private Hero plHSelect=null,comHSelect=null;

    //Costruttore
    public FrameCharacterChoice(AudioModel audiModel, FrameSettings fs, FontModel fModel, FrameInfo fi) {
        initComponents();
        this.fi = fi;
        this.audioModel = audiModel;
        this.fModel = fModel;
        this.fs = fs;
        this.appIcon = new ImageIcon(getClass().getResource(PathStorage.B_LEILA));
        
        initFont();
        
        inizButton(jB_Hero);
        inizButton(jB_Normal);
        inizButton(jB_Conferma);
        inizButton(jB_Annulla);
        
        app = jL_char1;
        this.fs.setFCC(this);
        if(this.fs.getJS_SetValueMusic() == this.audioModel.getMinV()) setJTB_Sound(true);
        //SwingUtilities.invokeLater(() -> centrareFinestra());
        
        settingsJPanel = new SettingsJPanel(Utility.FrameOpener.jp_setting);
        this.jIF_Settings.setContentPane(settingsJPanel);
    }
    
    // private void centrareFinestra() {
    //     // Ottieni le dimensioni dello schermo
    //     GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    //     GraphicsDevice[] screenDevices = ge.getScreenDevices();

    //     if (screenDevices.length > 0) {
    //         GraphicsDevice screen = screenDevices[0];
    //         DisplayMode mode = screen.getDisplayMode();

    //         // Calcola la posizione x e y per centrare la finestra
    //         int posX = (mode.getWidth() - getWidth()) / 2;
    //         int posY = (mode.getHeight() - getHeight()) / 2;

    //         // Imposta la posizione della finestra
    //         setLocation(posX, posY);
    //     }
    // }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jIF_Settings = new javax.swing.JInternalFrame();
        jIF_ConfermaScelta = new javax.swing.JInternalFrame();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jL_TextIF = new javax.swing.JLabel();
        jL_imgCharactSel = new javax.swing.JLabel();
        jB_Annulla = new javax.swing.JButton();
        jB_Conferma = new javax.swing.JButton();
        jL_backgGround_PopUp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jL_ImgPL1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jL_TitleInfo = new javax.swing.JLabel();
        jL_Info = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jL_char1 = new javax.swing.JLabel();
        jL_char2 = new javax.swing.JLabel();
        jL_char3 = new javax.swing.JLabel();
        jL_char4 = new javax.swing.JLabel();
        jL_char8 = new javax.swing.JLabel();
        jL_char7 = new javax.swing.JLabel();
        jL_char6 = new javax.swing.JLabel();
        jL_char5 = new javax.swing.JLabel();
        jB_Normal = new javax.swing.JButton();
        jB_Hero = new javax.swing.JButton();
        jL_ImgEnemy = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTB_Suond = new javax.swing.JToggleButton();
        jB_Settings = new javax.swing.JButton();
        jB_Info = new javax.swing.JButton();
        jL_BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        jIF_Settings.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jIF_Settings.setTitle("Settings");
        jIF_Settings.setMinimumSize(new java.awt.Dimension(1200, 800));
        jIF_Settings.setPreferredSize(new java.awt.Dimension(1200, 800));
        jIF_Settings.setVisible(false);
        jIF_Settings.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jIF_SettingsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jIF_SettingsLayout = new javax.swing.GroupLayout(jIF_Settings.getContentPane());
        jIF_Settings.getContentPane().setLayout(jIF_SettingsLayout);
        jIF_SettingsLayout.setHorizontalGroup(
            jIF_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jIF_SettingsLayout.setVerticalGroup(
            jIF_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jIF_Settings);
        jIF_Settings.setBounds(0, 0, 1200, 800);

        jIF_ConfermaScelta.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jIF_ConfermaScelta.setTitle("Conferma");
        jIF_ConfermaScelta.setToolTipText("");
        jIF_ConfermaScelta.setMaximumSize(new java.awt.Dimension(801, 801));
        jIF_ConfermaScelta.setMinimumSize(new java.awt.Dimension(750, 750));
        jIF_ConfermaScelta.setNormalBounds(new java.awt.Rectangle(20, 450, 700, 700));
        jIF_ConfermaScelta.setPreferredSize(new java.awt.Dimension(800, 800));
        jIF_ConfermaScelta.setVisible(false);
        jIF_ConfermaScelta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jIF_ConfermaSceltaFocusLost(evt);
            }
        });
        jIF_ConfermaScelta.getContentPane().setLayout(null);

        jLayeredPane5.setLayout(new java.awt.GridBagLayout());

        jL_TextIF.setBackground(new java.awt.Color(68, 68, 68));
        jL_TextIF.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jL_TextIF.setForeground(new java.awt.Color(76, 76, 76));
        jL_TextIF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_TextIF.setText("Quindi vuoi scegliere ");
        jL_TextIF.setToolTipText("");
        jL_TextIF.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL_TextIF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jL_TextIF.setMaximumSize(new java.awt.Dimension(700, 110));
        jL_TextIF.setMinimumSize(new java.awt.Dimension(700, 110));
        jL_TextIF.setPreferredSize(new java.awt.Dimension(700, 110));
        jL_TextIF.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(-40, 30, 0, 0);
        jLayeredPane5.add(jL_TextIF, gridBagConstraints);

        jL_imgCharactSel.setMaximumSize(new java.awt.Dimension(400, 400));
        jL_imgCharactSel.setMinimumSize(new java.awt.Dimension(380, 380));
        jL_imgCharactSel.setName(""); // NOI18N
        jL_imgCharactSel.setPreferredSize(new java.awt.Dimension(400, 400));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        jLayeredPane5.add(jL_imgCharactSel, gridBagConstraints);

        jB_Annulla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/annulla_V2.png"))); // NOI18N
        jB_Annulla.setBorderPainted(false);
        jB_Annulla.setContentAreaFilled(false);
        jB_Annulla.setFocusPainted(false);
        jB_Annulla.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/annulla_V2_Sel.png"))); // NOI18N
        jB_Annulla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_AnnullaMouseMoved(evt);
            }
        });
        jB_Annulla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_AnnullaMouseExited(evt);
            }
        });
        jB_Annulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AnnullaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(100, 0, 0, 200);
        jLayeredPane5.add(jB_Annulla, gridBagConstraints);

        jB_Conferma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/confermaV2.png"))); // NOI18N
        jB_Conferma.setBorderPainted(false);
        jB_Conferma.setContentAreaFilled(false);
        jB_Conferma.setFocusPainted(false);
        jB_Conferma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/conferma_Sel.png"))); // NOI18N
        jB_Conferma.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_ConfermaMouseMoved(evt);
            }
        });
        jB_Conferma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_ConfermaMouseExited(evt);
            }
        });
        jB_Conferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ConfermaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(100, 200, 0, 0);
        jLayeredPane5.add(jB_Conferma, gridBagConstraints);

        jIF_ConfermaScelta.getContentPane().add(jLayeredPane5);
        jLayeredPane5.setBounds(-4, 6, 800, 770);

        jL_backgGround_PopUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/background_popup.png"))); // NOI18N
        jIF_ConfermaScelta.getContentPane().add(jL_backgGround_PopUp);
        jL_backgGround_PopUp.setBounds(0, 0, 800, 800);

        getContentPane().add(jIF_ConfermaScelta);
        jIF_ConfermaScelta.setBounds(20, 450, 800, 800);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jL_ImgPL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_ImgPL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/player.png"))); // NOI18N
        jPanel3.add(jL_ImgPL1, new java.awt.GridBagConstraints());

        jPanel2.setOpaque(false);

        jL_TitleInfo.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        jL_TitleInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_TitleInfo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jL_Info.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jL_Info.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Info.setToolTipText("");
        jL_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 68, 68), 6));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(738, 482));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jL_char1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgNormal/leila_Icon.png"))); // NOI18N
        jL_char1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_char1MouseMoved(evt);
            }
        });
        jL_char1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_char1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 5, 5);
        jPanel1.add(jL_char1, gridBagConstraints);

        jL_char2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgNormal/shreak_Icon.png"))); // NOI18N
        jL_char2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_char2MouseMoved(evt);
            }
        });
        jL_char2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_char2MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(jL_char2, gridBagConstraints);

        jL_char3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgNormal/brontolo_Icon.png"))); // NOI18N
        jL_char3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_char3MouseMoved(evt);
            }
        });
        jL_char3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_char3MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(jL_char3, gridBagConstraints);

        jL_char4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgNormal/sdentato_Icon.png"))); // NOI18N
        jL_char4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_char4MouseMoved(evt);
            }
        });
        jL_char4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_char4MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 15);
        jPanel1.add(jL_char4, gridBagConstraints);

        jL_char8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgNormal/dissennatore_Icon.png"))); // NOI18N
        jL_char8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_char8MouseMoved(evt);
            }
        });
        jL_char8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_char8MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 15);
        jPanel1.add(jL_char8, gridBagConstraints);

        jL_char7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgNormal/feis_Icon.png"))); // NOI18N
        jL_char7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_char7MouseMoved(evt);
            }
        });
        jL_char7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_char7MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        jPanel1.add(jL_char7, gridBagConstraints);

        jL_char6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgNormal/bilbo_Icon.png"))); // NOI18N
        jL_char6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_char6MouseMoved(evt);
            }
        });
        jL_char6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_char6MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        jPanel1.add(jL_char6, gridBagConstraints);

        jL_char5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgNormal/goku_Icon.png"))); // NOI18N
        jL_char5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_char5MouseMoved(evt);
            }
        });
        jL_char5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_char5MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 15, 0, 5);
        jPanel1.add(jL_char5, gridBagConstraints);

        jB_Normal.setBackground(new java.awt.Color(0, 0, 0));
        jB_Normal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/normalX100-70_V2.png"))); // NOI18N
        jB_Normal.setContentAreaFilled(false);
        jB_Normal.setFocusPainted(false);
        jB_Normal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/normalX100-70_V2_Sel.png"))); // NOI18N
        jB_Normal.setRolloverEnabled(false);
        jB_Normal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_NormalMouseMoved(evt);
            }
        });
        jB_Normal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTB_BtnEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_NormalMouseExited(evt);
            }
        });
        jB_Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_NormalActionPerformed(evt);
            }
        });

        jB_Hero.setBackground(new java.awt.Color(0, 0, 0));
        jB_Hero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/heroX100-70_V2.png"))); // NOI18N
        jB_Hero.setBorderPainted(false);
        jB_Hero.setContentAreaFilled(false);
        jB_Hero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/heroX100-70_V2_Sel.png"))); // NOI18N
        jB_Hero.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_HeroMouseMoved(evt);
            }
        });
        jB_Hero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTB_BtnEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_HeroMouseExited(evt);
            }
        });
        jB_Hero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_HeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jB_Normal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jL_TitleInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Hero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jL_TitleInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addComponent(jL_Info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Normal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Hero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new java.awt.GridBagConstraints());

        jL_ImgEnemy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_ImgEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/com.png"))); // NOI18N
        jPanel3.add(jL_ImgEnemy, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1920, 1080);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

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
        jPanel4.add(jTB_Suond);

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
        jPanel4.add(jB_Settings);

        jB_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgFCC/info.png"))); // NOI18N
        jB_Info.setBorderPainted(false);
        jB_Info.setContentAreaFilled(false);
        jB_Info.setFocusPainted(false);
        jB_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_InfoActionPerformed(evt);
            }
        });
        jPanel4.add(jB_Info);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(1710, 990, 180, 66);

        jL_BackGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/background.png"))); // NOI18N
        getContentPane().add(jL_BackGround);
        jL_BackGround.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jL_char1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char1MouseClicked
        if(!jIF_ConfermaScelta.isVisible()) showPopUp(jL_char1,"Leila","gandalf",chStorage.elfo,chStorage.gandalf);
    }//GEN-LAST:event_jL_char1MouseClicked

    private void jL_char2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char2MouseClicked
       if(!jIF_ConfermaScelta.isVisible()) showPopUp(jL_char2,"la Shreak","Gimli",chStorage.orco,chStorage.gimli); 
    }//GEN-LAST:event_jL_char2MouseClicked
 
    private void jL_char3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char3MouseClicked
       if(!jIF_ConfermaScelta.isVisible()) showPopUp(jL_char3,"Brontolo","Balrog",chStorage.nano,chStorage.balrog);
    }//GEN-LAST:event_jL_char3MouseClicked

    private void jL_char4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char4MouseClicked
        if(!jIF_ConfermaScelta.isVisible()) showPopUp(jL_char4,"Sdentato","Saruman",chStorage.drago,chStorage.saruman);
    }//GEN-LAST:event_jL_char4MouseClicked

    private void jL_char5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char5MouseClicked
        if(!jIF_ConfermaScelta.isVisible()) showPopUp(jL_char5,"Goku","Legolas",chStorage.umano,chStorage.legolas);
    }//GEN-LAST:event_jL_char5MouseClicked

    private void jL_char6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char6MouseClicked
        if(!jIF_ConfermaScelta.isVisible()) showPopUp(jL_char6,"Bilbo","Frodo",chStorage.hobbit,chStorage.frodo);
    }//GEN-LAST:event_jL_char6MouseClicked

    private void jL_char7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char7MouseClicked
        if(!jIF_ConfermaScelta.isVisible()) showPopUp(jL_char7,"Feis","Gollum",chStorage.troll,chStorage.gollum);
    }//GEN-LAST:event_jL_char7MouseClicked

    /* Hover */
    private void jL_char1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char1MouseMoved
        iconSelected();
        checkSide(1);
    }//GEN-LAST:event_jL_char1MouseMoved

    private void jL_char2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char2MouseMoved
        iconSelected();
        checkSide(2);
    }//GEN-LAST:event_jL_char2MouseMoved

    private void jL_char3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char3MouseMoved
        iconSelected();
        checkSide(3); 
    }//GEN-LAST:event_jL_char3MouseMoved

    private void jL_char4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char4MouseMoved
        iconSelected(); 
        checkSide(4);
    }//GEN-LAST:event_jL_char4MouseMoved

    private void jL_char5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char5MouseMoved
        iconSelected();  
        checkSide(5);
    }//GEN-LAST:event_jL_char5MouseMoved

    private void jL_char6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char6MouseMoved
        iconSelected();
        checkSide(6);
    }//GEN-LAST:event_jL_char6MouseMoved

    private void jL_char7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char7MouseMoved
        iconSelected();
        checkSide(7);
    }//GEN-LAST:event_jL_char7MouseMoved

    private void jL_char8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char8MouseMoved
        iconSelected(); 
        checkSide(8);
    }//GEN-LAST:event_jL_char8MouseMoved

    private void jB_AnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AnnullaActionPerformed
        jL_TextIF.setText("Quindi vuoi scegliere ");
        jIF_ConfermaScelta.dispose();
    }//GEN-LAST:event_jB_AnnullaActionPerformed

    private void jB_ConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ConfermaActionPerformed
        openFrameGame();
    }//GEN-LAST:event_jB_ConfermaActionPerformed
    
    private void jL_char8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_char8MouseClicked
        if(!jIF_ConfermaScelta.isVisible()) showPopUp(jL_char8,"il dissennatore","Sauron",chStorage.nazgul,chStorage.sauron); 
    }//GEN-LAST:event_jL_char8MouseClicked

    private void jB_NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_NormalActionPerformed
        setnormalImage();
        buttonPress = "normal";
        app = jL_char1;
        appIcon= new ImageIcon(getClass().getResource(PathStorage.B_LEILA));
        jL_TitleInfo.setText(convertToMultiline("Nome: " + "\nHP: " + "\nAttacco: " + "\nSpecial: " + "\nDifesa: " + "\nPrecisione: " + "\nMana: " + "\nRazza: "));
    }//GEN-LAST:event_jB_NormalActionPerformed

    private void jB_NormalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_NormalMouseMoved
        jB_Normal.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_NORMAL_HOVER)));
    }//GEN-LAST:event_jB_NormalMouseMoved

    private void jB_NormalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_NormalMouseExited
        jB_Normal.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_NORMAL)));
    }//GEN-LAST:event_jB_NormalMouseExited

    private void jB_HeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_HeroActionPerformed
        setHeroImage();
        buttonPress = "hero";
        app = jL_char1;
        appIcon=new ImageIcon(getClass().getResource(PathStorage.B_GANDALF));
        jL_TitleInfo.setText(convertToMultiline("Nome: " + "\nHP: " + "\nAttacco: " + "\nSpecial: " + "\nDifesa: " + "\nPrecisione: " + "\nMana: "));
    }//GEN-LAST:event_jB_HeroActionPerformed

    private void jB_HeroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_HeroMouseMoved
        jB_Hero.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_HERO_HOVER)));
    }//GEN-LAST:event_jB_HeroMouseMoved

    private void jB_HeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_HeroMouseExited
        jB_Hero.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_HERO)));
    }//GEN-LAST:event_jB_HeroMouseExited

    private void jB_ConfermaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_ConfermaMouseMoved
        if(jB_Conferma.getIcon() != new ImageIcon(getClass().getResource(PathStorage.B_CONFERMA_HOVER))) 
            jB_Conferma.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_CONFERMA_HOVER)));
    }//GEN-LAST:event_jB_ConfermaMouseMoved

    private void jB_ConfermaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_ConfermaMouseExited
        jB_Conferma.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_CONFERMA)));
    }//GEN-LAST:event_jB_ConfermaMouseExited

    private void jB_AnnullaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_AnnullaMouseMoved
        if(jB_Annulla.getIcon() != new ImageIcon(getClass().getResource(PathStorage.B_ANNULLA)))
            jB_Annulla.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_ANNULLA_HOVER)));
    }//GEN-LAST:event_jB_AnnullaMouseMoved

    private void jB_AnnullaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_AnnullaMouseExited
        jB_Annulla.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_ANNULLA)));
    }//GEN-LAST:event_jB_AnnullaMouseExited

    private void jTB_SuondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTB_SuondActionPerformed
        if(!jTB_Suond.isSelected()) {
            //fs.setJS_SetValueMusic((int)fs.getLastValue());
            fs.setVolumeBySlider((int)fs.getLastValue());
            fs.changeMusicState();
            fs.audioStart();
        }
        else{
            fs.setLastValue(fs.getJS_SetValueMusic());
            fs.setVolumeBySlider(audioModel.getMinV());
            fs.changeMusicState();
            fs.audioStop();
        }

    }//GEN-LAST:event_jTB_SuondActionPerformed

    private void jB_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SettingsActionPerformed
        settingsJPanel.showPanelSettings(this, this.jIF_Settings);
        //fs.showFrameSettings(this);
    }//GEN-LAST:event_jB_SettingsActionPerformed

    private void jTB_BtnEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTB_BtnEntered
        checkSoundEffect(PathStorage.SE_BTN_HOVER, AudioModel.VOLUME_AUDIO_HOVER_EFFECT, "SE_BTN_HOVER");
    }//GEN-LAST:event_jTB_BtnEntered

    private void jB_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_InfoActionPerformed
        Utility.FrameOpener.openFrame(fi, true);
    }//GEN-LAST:event_jB_InfoActionPerformed

    private void jIF_ConfermaSceltaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jIF_ConfermaSceltaFocusLost
        jIF_ConfermaScelta.dispose();
    }//GEN-LAST:event_jIF_ConfermaSceltaFocusLost

    private void jIF_SettingsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIF_SettingsKeyPressed
        if(evt.getKeyCode() == 27) jIF_Settings.dispose();
    }//GEN-LAST:event_jIF_SettingsKeyPressed

    /**
     * @param playerN normal scelto dal player
     * @param comN    nomrmal scelto dal com
     * @param playerH hero scelto dal player
     * @param comH hero scelto dal com
     * @return vettore di due celle con icona del com e del player
     */
    private Icon[] getImgNomi(Normal playerN, Normal comN,Hero playerH, Hero comH){
        Icon vett[]= new Icon[2];

        if(comH==null){
            if(comN.getName().equalsIgnoreCase("leila")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_LEILA_COM));
            if(comN.getName().equalsIgnoreCase("shreak")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_SHREAK_COM));
            if(comN.getName().equalsIgnoreCase("brontolo")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_BRONTOLO_COM));
            if(comN.getName().equalsIgnoreCase("sdentato")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_SDENTATO_COM));
            if(comN.getName().equalsIgnoreCase("goku")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_GOKU_COM));
            if(comN.getName().equalsIgnoreCase("bilbo")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_BILBO_COM));
            if(comN.getName().equalsIgnoreCase("feis")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_FEIS_COM));
            if(comN.getName().equalsIgnoreCase("dissing")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_DISSENNATORE_COM));
        }else{
            if(comH.getName().equalsIgnoreCase("gandalf")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_GANDALF_COM));
            if(comH.getName().equalsIgnoreCase("gimli")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_GIMLI_COM));
            if(comH.getName().equalsIgnoreCase("balrog")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_BALROG_COM));
            if(comH.getName().equalsIgnoreCase("saruman")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_SARUMAN_COM));
            if(comH.getName().equalsIgnoreCase("legolas")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_LEGOLAS_COM));
            if(comH.getName().equalsIgnoreCase("frodo")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_FRODO_COM));
            if(comH.getName().equalsIgnoreCase("gollum")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_GOLLUM_COM));
            if(comH.getName().equalsIgnoreCase("sauron")) vett[0]=new ImageIcon(getClass().getResource(PathStorage.N_SAURON_COM));
        }
        
        if(playerH==null){
            if(playerN.getName().equalsIgnoreCase("leila")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_LEILA_PL));
            if(playerN.getName().equalsIgnoreCase("shreak")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_SHREAK_PL));
            if(playerN.getName().equalsIgnoreCase("brontolo")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_BRONTOLO_PL));
            if(playerN.getName().equalsIgnoreCase("sdentato")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_SDENTATO_PL));
            if(playerN.getName().equalsIgnoreCase("goku")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_GOKU_PL));
            if(playerN.getName().equalsIgnoreCase("bilbo")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_BILBO_PL));
            if(playerN.getName().equalsIgnoreCase("feis")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_FEIS_PL));
            if(playerN.getName().equalsIgnoreCase("dissing")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_DISSENNATORE_PL));
        }else{
            if(playerH.getName().equalsIgnoreCase("gandalf")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_GANDALF_PL));
            if(playerH.getName().equalsIgnoreCase("gimli")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_GIMLI_PL));
            if(playerH.getName().equalsIgnoreCase("balrog")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_BALROG_PL));
            if(playerH.getName().equalsIgnoreCase("saruman")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_SARUMAN_PL));
            if(playerH.getName().equalsIgnoreCase("legolas")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_LEGOLAS_PL));
            if(playerH.getName().equalsIgnoreCase("frodo")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_FRODO_PL));
            if(playerH.getName().equalsIgnoreCase("gollum")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_GOLLUM_PL));
            if(playerH.getName().equalsIgnoreCase("sauron")) vett[1]=new ImageIcon(getClass().getResource(PathStorage.N_SAURON_PL));
        }
        
        return vett;
    }
    /**
     * se gli effeti sonori sono attivi fa partire l'audio
     * @param path  percorso
     * @param volume volume
     * @param nameSound nome suono
     */
    public void checkSoundEffect(String path, int volume, String nameSound){
        if(this.fs.isJCB_SoundEffect()){
            this.audioModel.changePathSoundEffect(path, volume, nameSound);
            this.audioModel.restartAudio();
        }
    }
    //imposta un'icona diversa quando il cursone è sopra una label
    private void setHover(JLabel side,String imgFull,String imgSel,JLabel lChar,Normal ch1,Hero ch2){
        if(side.getIcon() != new ImageIcon(getClass().getResource(imgFull))){ 
            typeSelection(side,imgFull,imgSel,lChar.getIcon(), lChar);
            showInfoChar(ch1,ch2);
        }
    }
     /**
     * in relazione con pos attribuisce i giusti valori a le variabili
     * @param pos inidca la posizione nella griglia
     */
    private void checkSide(int pos){
        String img1="";
        String img2="";
        String imgSel1="";
        String imgSel2="";
        JLabel lChar=null;
        Normal ch1=null;
        Hero ch2=null;
        
        if (pos==1){
            lChar=jL_char1;
            ch1=chStorage.elfo;
            ch2=chStorage.gandalf;
            imgSel1=PathStorage.B_LEILA_HOVER;imgSel2=PathStorage.B_GANDALF_HOVER;
            if(plChoice){img1=PathStorage.L_LEILA_PL;img2=PathStorage.L_GANDALF_PL;}
            else {img1=PathStorage.L_LEILA_COM;img2=PathStorage.L_GANDALF_COM;}
        }else if(pos==2){
            lChar=jL_char2;
            ch1=chStorage.orco;
            ch2=chStorage.gimli;
            imgSel1=PathStorage.B_SHREAK_HOVER;imgSel2=PathStorage.B_GIMLI_HOVER;
            if(plChoice){img1=PathStorage.L_SHREAK_PL;img2=PathStorage.L_GIMLI_PL;}
            else {img1=PathStorage.L_SHREAK_COM;img2=PathStorage.L_GIMLI_COM;}
        }else if(pos==3){
            lChar=jL_char3;
            ch1=chStorage.nano;
            ch2=chStorage.balrog;
            imgSel1=PathStorage.B_BRONTOLO_HOVER;imgSel2=PathStorage.B_BALROG_HOVER;
            if(plChoice){img1=PathStorage.L_BRONTOLO_PL;img2=PathStorage.L_BALROG_PL;}
            else {img1=PathStorage.L_BRONTOLO_COM;img2=PathStorage.L_BALROG_COM;}
        }else if(pos==4){
            lChar=jL_char4;
            ch1=chStorage.drago;
            ch2=chStorage.saruman;
            imgSel1=PathStorage.B_SDENTATO_HOVER;imgSel2=PathStorage.B_SARUMAN_HOVER;
            if(plChoice){img1=PathStorage.L_SDENTATO_PL;img2=PathStorage.L_SARUMAN_PL;}
            else {img1=PathStorage.L_SDENTATO_COM;img2=PathStorage.L_SARUMAN_COM;}
        }else if(pos==5){
            lChar=jL_char5;
            ch1=chStorage.umano;
            ch2=chStorage.legolas;
            imgSel1=PathStorage.B_GOKU_HOVER;imgSel2=PathStorage.B_LEGOLAS_HOVER;
            if(plChoice){img1=PathStorage.L_GOKU_PL;img2=PathStorage.L_LEGOLAS_PL;}
            else {img1=PathStorage.L_GOKU_COM;img2=PathStorage.L_LEGOLAS_COM;}
        }else if(pos==6){
            lChar=jL_char6;
            ch1=chStorage.hobbit;
            ch2=chStorage.frodo;
            imgSel1=PathStorage.B_BILBO_HOVER;imgSel2=PathStorage.B_FRODO_HOVER;
            if(plChoice){img1=PathStorage.L_BILBO_PL;img2=PathStorage.L_FRODO_PL;}
            else {img1=PathStorage.L_BILBO_COM;img2=PathStorage.L_FRODO_COM;}
        }else if(pos==7){
            lChar=jL_char7;
            ch1=chStorage.troll;
            ch2=chStorage.gollum;
            imgSel1=PathStorage.B_FEIS_HOVER;imgSel2=PathStorage.B_GOLLUM_HOVER;
            if(plChoice){img1=PathStorage.L_FEIS_PL;img2=PathStorage.L_GOLLUM_PL;}
            else {img1=PathStorage.L_FEIS_COM;img2=PathStorage.L_GOLLUM_COM;}
        }else if(pos==8){
            lChar=jL_char8;
            ch1=chStorage.nazgul;
            ch2=chStorage.sauron;
            imgSel1=PathStorage.B_DISSENNATORE_HOVER;imgSel2=PathStorage.B_SAURON_HOVER;
            if(plChoice){img1=PathStorage.L_DISSENNATORE_PL;img2=PathStorage.L_SAURON_PL;}
            else {img1=PathStorage.L_DISSENNATORE_COM;img2=PathStorage.L_SAURON_COM;}
        }
        
        if(plChoice){
            if(buttonPress.equalsIgnoreCase("normal")) setHover(jL_ImgPL1,img1,imgSel1,lChar,ch1,ch2); 
            if(buttonPress.equalsIgnoreCase("hero")) setHover(jL_ImgPL1,img2,imgSel2,lChar,ch1,ch2);
        }else{
            if(buttonPress.equalsIgnoreCase("normal")) setHover(jL_ImgEnemy,img1,imgSel1,lChar,ch1,ch2); 
            if(buttonPress.equalsIgnoreCase("hero")) setHover(jL_ImgEnemy,img2,imgSel2,lChar,ch1,ch2);
        }
    }
    
    /**
     * imposta l'hover dei pulsanti hero e normal
     */
    private void iconSelected(){
       
        if(buttonPress.equalsIgnoreCase("normal"))
            app.setIcon(appIcon);
            
        else if(buttonPress.equalsIgnoreCase("hero"))
            app.setIcon(appIcon);
            
        
    }
    
    private void typeSelection(JLabel side,String imgFull,String imgSel,Icon img, JLabel charact){
        if(!jIF_ConfermaScelta.isVisible()){
            charact.setIcon(new ImageIcon(getClass().getResource(imgSel))); 
            side.setIcon(new ImageIcon(getClass().getResource(imgFull)));
            app = charact;
            appIcon=img;
        }
    }
    /**
     * mostra le informazione nella label del personaggio scelto 
     * @param normal oggetto normal
     * @param hero oggetto hero
     */
    private void showInfoChar(Normal normal,Hero hero){
        if(buttonPress.equalsIgnoreCase("hero")){
            jL_TitleInfo.setText(convertToMultiline("Nome: " + "\nHP: " + "\nAttacco: " + "\nSpecial: " + "\nDifesa: " + "\nPrecisione: " + "\nMana: "));
            jL_Info.setText(convertToMultiline(stringHero(hero))); 
        }
        else if(buttonPress.equalsIgnoreCase("normal")){
            jL_TitleInfo.setText(convertToMultiline("Nome: " + "\nHP: " + "\nAttacco: " + "\nSpecial: " + "\nDifesa: " + "\nPrecisione: " + "\nMana: " + "\nRazza: "));
            jL_Info.setText(convertToMultiline(stringNormal(normal)));
        }
    }
    //ToSring hero
    private String stringHero(Hero hero){
        return hero.getName() + "\n" + hero.getHp() + "\n" + hero.getAtk() + "\n" + hero.getAtkSp().getNome() + "\n" + hero.getDef() + "\n" + hero.getPrec() + "\n" + hero.getMana();

    }
    //ToString Normal
    private String stringNormal(Normal norm) {
        return norm.getName() + "\n" + norm.getHp() + "\n" + norm.getAtk() + "\n" + norm.getAtkSp().getNome() + "\n" + norm.getDef() + "\n" + norm.getPrec() + "\n" + norm.getMana() + "\n" + norm.getRazza();

    }
    /**
     * mostra il pop-up per la conferma
     * @param charact label personaggio scelto
     * @param name1 nome hero
     * @param name2 nome normal
     * @param ch1 oggetto normal
     * @param ch2 oggetto hero
     */
    private void showPopUp(JLabel charact,String name1,String name2,Normal ch1,Hero ch2) {
        jIF_ConfermaScelta.setLocation((this.getWidth()/2 - jIF_ConfermaScelta.getWidth()/2), (this.getHeight()/2 - jIF_ConfermaScelta.getHeight()/2));
        jIF_ConfermaScelta.setSize(800, 800);
        if(buttonPress.equalsIgnoreCase("hero")) setPopUpObject(name2,ch1,ch2);
        else if(buttonPress.equalsIgnoreCase("normal")) setPopUpObject(name1,ch1,ch2);
        
        jIF_ConfermaScelta.setLocation((this.getWidth()/2 - jIF_ConfermaScelta.getWidth()/2), (this.getHeight()/2 - jIF_ConfermaScelta.getHeight()/2));
        jIF_ConfermaScelta.setSize(800, 800);
        jIF_ConfermaScelta.show();
    }
    
    //Setter
    private void setPopUpObject( String mess,Normal ch1, Hero ch2){
        if(plChoice) jL_TextIF.setText(convertToMultiline(jL_TextIF.getText() + mess + " come tuo personaggio?"));
        else jL_TextIF.setText(convertToMultiline("Vuoi scegliere" + mess + " come tuo avversario?"));
        
        if(buttonPress.equalsIgnoreCase("normal")){
            if(plChoice) plNSelect= new Normal(ch1);
            else comNSelect= new Normal(ch1);
            jL_imgCharactSel.setIcon(ch1.getImg());
        }
        else{
            if(plChoice) plHSelect = new Hero(ch2);
            else comHSelect = new Hero(ch2);
            jL_imgCharactSel.setIcon(ch2.getImg());
        }
    }
    private void setHeroImage(){
        jL_char1.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_GANDALF)));
        jL_char2.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_GIMLI)));
        jL_char3.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_BALROG)));
        jL_char4.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_SARUMAN)));
        jL_char5.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_LEGOLAS)));
        jL_char6.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_FRODO)));
        jL_char7.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_GOLLUM)));
        jL_char8.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_SAURON)));
    }
    private void setnormalImage(){
        jL_char1.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_LEILA)));
        jL_char2.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_SHREAK)));
        jL_char3.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_BRONTOLO)));
        jL_char4.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_SDENTATO)));
        jL_char5.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_GOKU)));
        jL_char6.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_BILBO)));
        jL_char7.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_FEIS)));
        jL_char8.setIcon(new ImageIcon(getClass().getResource(PathStorage.B_DISSENNATORE)));
    }
    
    /**   
     * inizializza un jButton
     * @param jButton button da inizializzare
     */
    public final void inizButton(JButton jButton) {
       jButton.setContentAreaFilled(false);
       jButton.setBorderPainted(false);
    }
    
    /**
     * Inizializza e setta il font ai componenti del frame
     */
    private void initFont() {
        this.fModel.createNewFont(FontModel.STARDARD_SIZE);
        jL_Info.setFont(this.fModel.getFont());
        jL_TitleInfo.setFont(this.fModel.getFont());
        jL_TextIF.setFont(this.fModel.getFont());
        jL_imgCharactSel.setFont(this.fModel.getFont());
        jL_TitleInfo.setFont(this.fModel.getFont());
    }
    
    /**
     * cambia lo stato del jTB_Sound in base al value
     * @param value true / false set toggle del btn
     */
    public void setJTB_Sound(boolean value){
       jTB_Suond.setSelected(value);
    }
    
    /**
     * usa i tag html e permette il multiline su un testo
     * @param orig testo
     * @return testo convertito
     */
    public static String convertToMultiline(String orig){
        return "<html>" + orig.replaceAll("\n", "<br>");
    }
    
    /**
     * Apre il FrameGame
     */
    private void openFrameGame(){
        if(plChoice) plChoice=false;
        else{
            Icon[] nomi=getImgNomi(plNSelect,comNSelect,plHSelect,comHSelect);
            
            GameModel gameModel= new GameModel();
            Utility.FrameOpener.fr_game.setModel(gameModel);
            gameModel.setPersScelti(plNSelect,comNSelect,plHSelect,comHSelect);
            Utility.FrameOpener.fr_game.setDefaultValue();

            
            Utility.FrameOpener.fr_game.setGameIcons(nomi[0], nomi[1]);
            
            Utility.FrameOpener.openFrame(Utility.FrameOpener.fr_game, true);
            this.dispose();
        }
        jIF_ConfermaScelta.dispose();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCharacterChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCharacterChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCharacterChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCharacterChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Annulla;
    private javax.swing.JButton jB_Conferma;
    private javax.swing.JButton jB_Hero;
    private javax.swing.JButton jB_Info;
    private javax.swing.JButton jB_Normal;
    private javax.swing.JButton jB_Settings;
    private javax.swing.JInternalFrame jIF_ConfermaScelta;
    private javax.swing.JInternalFrame jIF_Settings;
    private javax.swing.JLabel jL_BackGround;
    private javax.swing.JLabel jL_ImgEnemy;
    private javax.swing.JLabel jL_ImgPL1;
    private javax.swing.JLabel jL_Info;
    private javax.swing.JLabel jL_TextIF;
    private javax.swing.JLabel jL_TitleInfo;
    private javax.swing.JLabel jL_backgGround_PopUp;
    private javax.swing.JLabel jL_char1;
    private javax.swing.JLabel jL_char2;
    private javax.swing.JLabel jL_char3;
    private javax.swing.JLabel jL_char4;
    private javax.swing.JLabel jL_char5;
    private javax.swing.JLabel jL_char6;
    private javax.swing.JLabel jL_char7;
    private javax.swing.JLabel jL_char8;
    private javax.swing.JLabel jL_imgCharactSel;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jTB_Suond;
    // End of variables declaration//GEN-END:variables

    
}