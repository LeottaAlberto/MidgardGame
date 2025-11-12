package Views;

import Models.AudioModel;
import Models.FontModel;
import Utility.PathStorage;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FrameHub extends javax.swing.JFrame {
    
    private FrameCharacterChoice fcc; 
    private final FrameSettings fs;
    private final AudioModel audioModel;
    private final FontModel fModel;
    private final FrameInfo fi;
    private PathStorage pathStorage;
    
    //Costruttore
    public FrameHub(FrameSettings fs, AudioModel audioModel, FontModel fModell, FrameInfo fi) {
        this.setUndecorated(true);
        initComponents();
        this.fi = fi;
        this.fs = fs;
        this.audioModel = audioModel;
        this.fModel = fModell;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPN_Background = new javax.swing.JPanel();
        jPN_Title_And_Buttons = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jB_Play = new javax.swing.JButton();
        jB_Impostazioni = new javax.swing.JButton();
        jB_Exit = new javax.swing.JButton();
        jL_Title = new javax.swing.JLabel();
        jL_BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPN_Background.setBackground(new java.awt.Color(0, 0, 0));
        jPN_Background.setMinimumSize(new java.awt.Dimension(1920, 1082));
        jPN_Background.setPreferredSize(new java.awt.Dimension(1920, 1085));
        jPN_Background.setLayout(null);

        jPN_Title_And_Buttons.setOpaque(false);

        jPanel1.setDoubleBuffered(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1900, 1060));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 1060));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        jB_Play.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jB_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/buttonPlay.png"))); // NOI18N
        jB_Play.setBorderPainted(false);
        jB_Play.setContentAreaFilled(false);
        jB_Play.setFocusPainted(false);
        jB_Play.setPreferredSize(new java.awt.Dimension(470, 138));
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
        jPanel2.add(jB_Play);

        jB_Impostazioni.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jB_Impostazioni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/buttonImpostazioni.png"))); // NOI18N
        jB_Impostazioni.setBorderPainted(false);
        jB_Impostazioni.setContentAreaFilled(false);
        jB_Impostazioni.setFocusPainted(false);
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
        jPanel2.add(jB_Impostazioni);

        jB_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/buttonExit.png"))); // NOI18N
        jB_Exit.setBorderPainted(false);
        jB_Exit.setContentAreaFilled(false);
        jB_Exit.setFocusPainted(false);
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
        jPanel2.add(jB_Exit);

        jPanel1.add(jPanel2, new java.awt.GridBagConstraints());

        jL_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/titleDef.png"))); // NOI18N

        javax.swing.GroupLayout jPN_Title_And_ButtonsLayout = new javax.swing.GroupLayout(jPN_Title_And_Buttons);
        jPN_Title_And_Buttons.setLayout(jPN_Title_And_ButtonsLayout);
        jPN_Title_And_ButtonsLayout.setHorizontalGroup(
            jPN_Title_And_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPN_Title_And_ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 1930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPN_Title_And_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPN_Title_And_ButtonsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPN_Title_And_ButtonsLayout.setVerticalGroup(
            jPN_Title_And_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPN_Title_And_ButtonsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jL_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(685, Short.MAX_VALUE))
            .addGroup(jPN_Title_And_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPN_Title_And_ButtonsLayout.createSequentialGroup()
                    .addGap(245, 245, 245)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        jPN_Background.add(jPN_Title_And_Buttons);
        jPN_Title_And_Buttons.setBounds(-10, 0, 1920, 1160);

        jL_BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgHub/background.png"))); // NOI18N
        jL_BackGround.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPN_Background.add(jL_BackGround);
        jL_BackGround.setBounds(0, -10, 1920, 1090);

        getContentPane().add(jPN_Background);

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
        fs.showFrameSettings();
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
        fcc = new FrameCharacterChoice(audioModel, this.fs, this.fModel, this.fi);
        fcc.setResizable(false);
        fcc.setLocationRelativeTo(this);
        fcc.setSize(1920, 1080);
        //Apre a schermo intero la finestra
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice cc = ge.getDefaultScreenDevice();
        //cc.setFullScreenWindow(fcc);
        fcc.setVisible(true);
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
    private javax.swing.JLabel jL_BackGround;
    private javax.swing.JLabel jL_Title;
    private javax.swing.JPanel jPN_Background;
    private javax.swing.JPanel jPN_Title_And_Buttons;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
}
