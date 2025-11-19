package Views;

import Models.AudioModel;
import Models.FontModel;
import Utility.PathStorage;
import Utility.FrameOpener;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import midgardgamebeta.MainClass;

public class FrameHub extends javax.swing.JFrame {
    
    private FrameCharacterChoice fcc; 
    private final FrameSettings fs;
    private final AudioModel audioModel;
    private final FontModel fModel;
    private final FrameInfo fi;
    private PathStorage pathStorage;
    
    private final SettingsJPanel settingsJPanel;
    
    //Costruttore
    public FrameHub(FrameSettings fs, AudioModel audioModel, FontModel fModell, FrameInfo fi) {
        this.setUndecorated(true);
        this.setAlwaysOnTop(false);
        initComponents();
        this.fi = fi;
        this.fs = fs;
        this.audioModel = audioModel;
        this.fModel = fModell;
        
        fs.setFrameRif(this);

        settingsJPanel = FrameOpener.jp_setting;
        this.jIF_Settings.setContentPane(this.settingsJPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jIF_Settings = new javax.swing.JInternalFrame();
        jL_Title = new javax.swing.JLabel();
        jPN_Title_And_Buttons = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jB_Impostazioni = new javax.swing.JButton();
        jB_Play = new javax.swing.JButton();
        jB_Exit = new javax.swing.JButton();
        jL_BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jIF_Settings.setBorder(null);
        jIF_Settings.setTitle("Settings");
        jIF_Settings.setMinimumSize(new java.awt.Dimension(1200, 800));
        jIF_Settings.setNormalBounds(new java.awt.Rectangle(0, 0, 1200, 800));
        jIF_Settings.setPreferredSize(new java.awt.Dimension(1200, 800));
        jIF_Settings.setVisible(false);
        jIF_Settings.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jIF_SettingsKeyReleased(evt);
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

        jL_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/titleDef.png"))); // NOI18N
        jL_Title.setMaximumSize(new java.awt.Dimension(1920, 285));
        jL_Title.setMinimumSize(new java.awt.Dimension(1920, 285));
        jL_Title.setPreferredSize(new java.awt.Dimension(1920, 285));
        getContentPane().add(jL_Title);
        jL_Title.setBounds(0, 0, 1920, 285);

        jPN_Title_And_Buttons.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPN_Title_And_Buttons.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPN_Title_And_Buttons.setOpaque(false);
        jPN_Title_And_Buttons.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel2.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jB_Impostazioni.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jB_Impostazioni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/buttonImpostazioni.png"))); // NOI18N
        jB_Impostazioni.setBorderPainted(false);
        jB_Impostazioni.setContentAreaFilled(false);
        jB_Impostazioni.setFocusPainted(false);
        jB_Impostazioni.setMargin(null);
        jB_Impostazioni.setMaximumSize(new java.awt.Dimension(500, 150));
        jB_Impostazioni.setMinimumSize(new java.awt.Dimension(500, 150));
        jB_Impostazioni.setPreferredSize(new java.awt.Dimension(500, 150));
        jB_Impostazioni.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_ImpostazioniMouseMoved(evt);
            }
        });
        jB_Impostazioni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jB_btnEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_ImpostazioniMouseExited(evt);
            }
        });
        jB_Impostazioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ImpostazioniActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 5.0;
        jPanel2.add(jB_Impostazioni, gridBagConstraints);

        jB_Play.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jB_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/buttonPlay.png"))); // NOI18N
        jB_Play.setBorderPainted(false);
        jB_Play.setContentAreaFilled(false);
        jB_Play.setFocusPainted(false);
        jB_Play.setMaximumSize(new java.awt.Dimension(1920, 150));
        jB_Play.setMinimumSize(new java.awt.Dimension(1920, 150));
        jB_Play.setPreferredSize(new java.awt.Dimension(1920, 150));
        jB_Play.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_PlayMouseMoved(evt);
            }
        });
        jB_Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jB_btnEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_PlayMouseExited(evt);
            }
        });
        jB_Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_PlayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(200, 0, 0, 0);
        jPanel2.add(jB_Play, gridBagConstraints);

        jB_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/buttonExit.png"))); // NOI18N
        jB_Exit.setBorderPainted(false);
        jB_Exit.setContentAreaFilled(false);
        jB_Exit.setFocusPainted(false);
        jB_Exit.setMaximumSize(new java.awt.Dimension(500, 150));
        jB_Exit.setMinimumSize(new java.awt.Dimension(500, 150));
        jB_Exit.setPreferredSize(new java.awt.Dimension(500, 150));
        jB_Exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_ExitMouseMoved(evt);
            }
        });
        jB_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jB_btnEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_ExitMouseExited(evt);
            }
        });
        jB_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 100.0;
        jPanel2.add(jB_Exit, gridBagConstraints);

        javax.swing.GroupLayout jPN_Title_And_ButtonsLayout = new javax.swing.GroupLayout(jPN_Title_And_Buttons);
        jPN_Title_And_Buttons.setLayout(jPN_Title_And_ButtonsLayout);
        jPN_Title_And_ButtonsLayout.setHorizontalGroup(
            jPN_Title_And_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPN_Title_And_ButtonsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPN_Title_And_ButtonsLayout.setVerticalGroup(
            jPN_Title_And_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPN_Title_And_ButtonsLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPN_Title_And_Buttons);
        jPN_Title_And_Buttons.setBounds(0, 0, 1920, 1080);

        jL_BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/background.png"))); // NOI18N
        jL_BackGround.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jL_BackGround);
        jL_BackGround.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Quando il cursore passa sopra il jB_Play viene modificata l'immagine
     * @param evt un evento
     */
    private void jB_PlayMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PlayMouseMoved
        hoverBTN(jB_Play, pathStorage.B_PLAY_HOVER);
    }//GEN-LAST:event_jB_PlayMouseMoved

    /**
     * Chiama openFrameCharChoice
     * @param evt un evento
     */
    private void jB_PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_PlayActionPerformed
        openFrameCharChoice();
    }//GEN-LAST:event_jB_PlayActionPerformed

    /**
     * Quando il cursore esce dell'hitbox del jB_Play viene modificata l'immagine
     * @param evt un evento
     */
    private void jB_PlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_PlayMouseExited
        hoverBTN(jB_Play, pathStorage.B_PLAY);
    }//GEN-LAST:event_jB_PlayMouseExited

    /**
     * Quando il cursore esce dell'hitbox del jB_Impostazioni viene modificata l'immagine
     * @param evt un evento
     */
    private void jB_ImpostazioniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_ImpostazioniMouseExited
        hoverBTN(jB_Impostazioni, pathStorage.B_SETTINGS);
    }//GEN-LAST:event_jB_ImpostazioniMouseExited

    /**
     * Quando il cursore passa sopra il jB_Impostazioni viene modificata l'immagine
     * @param evt un evento
     */
    private void jB_ImpostazioniMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_ImpostazioniMouseMoved
        hoverBTN(jB_Impostazioni, pathStorage.B_SETTINGS_HOVER);
    }//GEN-LAST:event_jB_ImpostazioniMouseMoved

    /**
     * Se il jB_Impostazioni viene cliccato viene richiamato il metodo showFrameSettings dal FrameSettings che apre quest'ultima
     * @param evt evento
     */
    private void jB_ImpostazioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ImpostazioniActionPerformed
        settingsJPanel.updateJSlider();
        settingsJPanel.showPanelSettings(this, this.jIF_Settings);
    }//GEN-LAST:event_jB_ImpostazioniActionPerformed

    /**
     * Quando si clicca su jB_Exit viene terminata l'esecuzione
     * @param evt un evento
     */
    private void jB_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jB_ExitActionPerformed

    /**
     * Quando il cursore passa sopra il jB_Exit viene modificata l'immagine
     * @param evt un evento
     */
    private void jB_ExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_ExitMouseMoved
        hoverBTN(jB_Exit, pathStorage.B_EXIT_HOVER);
    }//GEN-LAST:event_jB_ExitMouseMoved

    /**
     * Quando il cursore esce dall'hitbox jB_Impostazioni viene modificata l'immagine
     * @param evt un evento
     */
    private void jB_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_ExitMouseExited
        hoverBTN(jB_Exit, pathStorage.B_EXIT);
    }//GEN-LAST:event_jB_ExitMouseExited

    private void jB_btnEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_btnEntered
        checkSoundEffect(PathStorage.SE_BTN_HOVER, AudioModel.VOLUME_AUDIO_HOVER_EFFECT, "SE_BTN_HOVER");
    }//GEN-LAST:event_jB_btnEntered

    private void jIF_SettingsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIF_SettingsKeyReleased
        if(evt.getKeyCode() == 27) jIF_Settings.dispose();
    }//GEN-LAST:event_jIF_SettingsKeyReleased
        
    public void checkSoundEffect(String path, int volume, String nameSound){
        if(this.fs.isJCB_SoundEffect()){
            this.audioModel.changePathSoundEffect(path, volume, nameSound);
            this.audioModel.restartAudio();
        }
    }
    
    private void hoverBTN(JButton btn, String path){
        if(btn.getIcon() != new ImageIcon(getClass().getResource(path))) 
            btn.setIcon(new ImageIcon(getClass().getResource(path)));
    }
    
    /**
     * Quando il jB_Play viene cliccato viene aperto il FrameCharacterChoice e viene chiuso il frame corrente
     */
    private void openFrameCharChoice(){
        Utility.FrameOpener.openFrame(Utility.FrameOpener.fr_char_choice, true);
        this.dispose();
    }
            
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Exit;
    private javax.swing.JButton jB_Impostazioni;
    private javax.swing.JButton jB_Play;
    private javax.swing.JInternalFrame jIF_Settings;
    private javax.swing.JLabel jL_BackGround;
    private javax.swing.JLabel jL_Title;
    private javax.swing.JPanel jPN_Title_And_Buttons;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
}
