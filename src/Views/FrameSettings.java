package Views;

import Models.AudioModel;
import Models.FontModel;
import Models.SettingsModel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;


public class FrameSettings extends javax.swing.JFrame {
    
    private Font fontGard;
    private SettingsModel model;
    private FontModel fModel;
    private FrameCharacterChoice fcc;
    private FrameGame fg;
    private JFrame fr_rif;
    
    public static final int FRAME_WIDTH = 1200;
    public static final int FRAME_HEIGHT = 800;
    
    //Costruttore
    public FrameSettings(FontModel fModel, FrameCharacterChoice fcc, FrameGame fg) {
        initComponents();
        this.fModel = fModel;
    }
    public FrameSettings(FontModel fModel, SettingsModel model) {
        initComponents();
        this.fModel = fModel;
        this.model = model;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jL_TextMusic = new javax.swing.JLabel();
        jCB_Music = new javax.swing.JCheckBox();
        jL_TextSoundEffect = new javax.swing.JLabel();
        jCB_SoundEffect = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jL_Text0 = new javax.swing.JLabel();
        jS_SetVolumeMusic = new javax.swing.JSlider();
        jL_Text40 = new javax.swing.JLabel();
        jL_TextDifficulty = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jL_TextEasy = new javax.swing.JLabel();
        jL_TextNormal = new javax.swing.JLabel();
        jS_Difficulty = new javax.swing.JSlider();
        jL_TextHard = new javax.swing.JLabel();
        jL_BackGroundSettings = new javax.swing.JLabel();

        setTitle("Settings");
        setAlwaysOnTop(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel3.setOpaque(false);

        jL_TextMusic.setBackground(new java.awt.Color(255, 255, 255));
        jL_TextMusic.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jL_TextMusic.setForeground(new java.awt.Color(255, 255, 255));
        jL_TextMusic.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_TextMusic.setText("Music:");
        jL_TextMusic.setToolTipText("");

        jCB_Music.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jCB_Music.setSelected(true);
        jCB_Music.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jCB_Music.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCB_Music.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCB_Music.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_MusicActionPerformed(evt);
            }
        });

        jL_TextSoundEffect.setBackground(new java.awt.Color(0, 0, 0));
        jL_TextSoundEffect.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jL_TextSoundEffect.setForeground(new java.awt.Color(255, 255, 255));
        jL_TextSoundEffect.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_TextSoundEffect.setText("Sound Effect:");
        jL_TextSoundEffect.setToolTipText("");

        jCB_SoundEffect.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jCB_SoundEffect.setSelected(true);
        jCB_SoundEffect.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCB_SoundEffect.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jPanel1.setOpaque(false);

        jL_Text0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_Text0.setForeground(new java.awt.Color(255, 255, 255));
        jL_Text0.setText("MIN");

        jS_SetVolumeMusic.setMaximum(6);
        jS_SetVolumeMusic.setMinimum(-40);
        jS_SetVolumeMusic.setPaintLabels(true);
        jS_SetVolumeMusic.setPaintTicks(true);
        jS_SetVolumeMusic.setToolTipText("Volume");
        jS_SetVolumeMusic.setValue(-17);
        jS_SetVolumeMusic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jS_SetVolumeMusicStateChanged(evt);
            }
        });

        jL_Text40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_Text40.setForeground(new java.awt.Color(255, 255, 255));
        jL_Text40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Text40.setText("MAX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jS_SetVolumeMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jL_Text0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_Text40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Text0, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Text40, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jS_SetVolumeMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jL_TextDifficulty.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jL_TextDifficulty.setForeground(new java.awt.Color(255, 255, 255));
        jL_TextDifficulty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_TextDifficulty.setText("Difficulty:");
        jL_TextDifficulty.setToolTipText("");

        jPanel2.setOpaque(false);

        jL_TextEasy.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jL_TextEasy.setForeground(new java.awt.Color(255, 255, 255));
        jL_TextEasy.setText("Easy");

        jL_TextNormal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jL_TextNormal.setForeground(new java.awt.Color(255, 255, 255));
        jL_TextNormal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_TextNormal.setText("Normal");

        jS_Difficulty.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jS_Difficulty.setMaximum(3);
        jS_Difficulty.setMinimum(1);
        jS_Difficulty.setToolTipText("Difficulty");
        jS_Difficulty.setValue(2);
        jS_Difficulty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jL_TextHard.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jL_TextHard.setForeground(new java.awt.Color(255, 255, 255));
        jL_TextHard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_TextHard.setText("Hard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jS_Difficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jL_TextEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_TextNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_TextHard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_TextEasy)
                    .addComponent(jL_TextNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_TextHard))
                .addGap(0, 0, 0)
                .addComponent(jS_Difficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_TextSoundEffect)
                    .addComponent(jL_TextMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_TextDifficulty))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCB_SoundEffect)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCB_Music, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCB_Music, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jL_TextMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jL_TextSoundEffect, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCB_SoundEffect, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(jL_TextDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1400, 800);

        jL_BackGroundSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/new_background_settings.png"))); // NOI18N
        jL_BackGroundSettings.setText("jLabel2");
        jL_BackGroundSettings.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jL_BackGroundSettings.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jL_BackGroundSettings.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jL_BackGroundSettings);
        jL_BackGroundSettings.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jCB_MusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_MusicActionPerformed
        if(!jCB_Music.isSelected()) {
            model.stopSound(jS_SetVolumeMusic);
        }
        else {
            jS_SetVolumeMusic.setValue((int) model.getLastValue());
            model.audioModel.setVolumeBase(model.getLastValue());
            model.startSound(jS_SetVolumeMusic);
        }
    }//GEN-LAST:event_jCB_MusicActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
        Utility.FrameOpener.fr_hub.requestFocus();
        Utility.FrameOpener.fr_hub.setVisible(true);
    }//GEN-LAST:event_formWindowLostFocus

    private void jS_SetVolumeMusicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jS_SetVolumeMusicStateChanged
        if(this.fcc != null && fcc.isVisible()){
            if(jS_SetVolumeMusic.getValue() == AudioModel.MINVOLUME) this.fcc.setJTB_Sound(true);
            else this.fcc.setJTB_Sound(false);
        }
        else if(this.fg != null && fg.isVisible()) {
            if(jS_SetVolumeMusic.getValue() == AudioModel.MINVOLUME) this.fg.setJTB_Sound(true);
            else this.fg.setJTB_Sound(false);
        } 
    }//GEN-LAST:event_jS_SetVolumeMusicStateChanged

    //Getter
    public int getValue(JSlider jS_SetVolumeMusic) {
        return model.getValue(jS_SetVolumeMusic);
    }
    public float getLastValue(){
        return model.getLastValue();
    }
    public int getJS_SetValueMusic(){
        return model.getValue(jS_SetVolumeMusic);
    }
    public boolean isJCB_SoundEffect(){
        return this.jCB_SoundEffect.isSelected();
    }
    public int getDifficulty(){
        return this.jS_Difficulty.getValue();
    }
    public void setModel(SettingsModel model){
        this.model = model;
    }
    //Setter
    public void setFrameRif(JFrame rif) {
        if(rif == null) throw new ExceptionInInitializerError("JFrame Rif is null");
        
        this.fr_rif = rif;
    }
    public void setJS_SetValueMusic(int value){
        if(value <= 6 && value >= -40) jS_SetVolumeMusic.setValue(value);
    }
    public void setSettingsObjects(){
        setCheckBox(jCB_Music);
        setCheckBox(jCB_SoundEffect);
        
        //Inizialize Slider Volume & Slider Difficulty
        jS_Difficulty.setOpaque(false);
        jS_SetVolumeMusic.setOpaque(false);
        jS_SetVolumeMusic.setMaximum(AudioModel.MAXVOLUME);
        jS_SetVolumeMusic.setMinimum(AudioModel.MINVOLUME);
        jS_SetVolumeMusic.setValue(AudioModel.mediumV);
        model.audioModel.setVolumeBase(AudioModel.mediumV);

        setLabelFont();
        
        jS_SetVolumeMusic.addChangeListener((ChangeEvent e) -> {
            model.audioModel.setVolumeBase(jS_SetVolumeMusic.getValue());
            if(jS_SetVolumeMusic.getValue() == AudioModel.MINVOLUME) {
                jCB_Music.setSelected(false);
                model.audioModel.stopBase();
            }
            else if(jCB_Music.isSelected() == false && jS_SetVolumeMusic.getValue() >= AudioModel.MINVOLUME){
                jCB_Music.setSelected(true);
                model.audioModel.startBase();
            }
        });
        jS_Difficulty.addChangeListener((ChangeEvent e) -> {
            switch(jS_Difficulty.getValue()){
                case 1 -> jS_Difficulty.setToolTipText("Difficulty Easy");
                case 2 -> jS_Difficulty.setToolTipText("Difficulty Normal");
                case 3 -> jS_Difficulty.setToolTipText("Difficulty Hard");
                
            }
        });
    }
    public void setCheckBox(JCheckBox cBox){
        if(this.fModel.createNewFont(FontModel.STARDARD_SIZE) != 0){
            cBox.setFont(this.fModel.getFont());
            cBox.setContentAreaFilled(false);
            cBox.setBorderPainted(false);
        }
    }
    private void setLabelFont() {
        if(this.fModel.createNewFont(FontModel.STARDARD_SIZE) != 0){
            jL_TextEasy.setFont(this.fModel.getFont());
            jL_TextNormal.setFont(this.fModel.getFont());
            jL_TextHard.setFont(this.fModel.getFont());
            jL_Text0.setFont(this.fModel.getFont());
            jL_Text40.setFont(this.fModel.getFont());
            jL_TextDifficulty.setFont(this.fModel.getFont());
            jL_TextMusic.setFont(this.fModel.getFont());
            jL_TextSoundEffect.setFont(this.fModel.getFont());
        }
    }
    public void setVolumeBySlider(int value){
        if(value > 6) value = 6;
        this.jS_SetVolumeMusic.setValue(value);
    }
    public void setLastValue(int value) {
        model.setLastValue(value);
    }
    public void setFCC(FrameCharacterChoice fcc){
        this.fcc = fcc;
    }
    public void setFG(FrameGame fg){
        this.fg = fg;
    }
    
    //fa partire la base
    public void audioStart() {
       model.startSound(jS_SetVolumeMusic);
    }
    //fa fermare la base
    public void audioStop() {
        model.stopSound(jS_SetVolumeMusic);
    }
    //imposta lo stato della base all'inverso della situazione corrente
    public void changeMusicState(){
        this.jCB_Music.setSelected(!jCB_Music.isSelected());
    }
    //rende visibile il frame
    public void showFrameSettings(){
        if(!model.isOpen()){
            setSettingsObjects();
            model.setOpen(true);
            if(!this.model.audioModel.getBase().isRunning()) jCB_Music.setSelected(false);
            else jCB_Music.setSelected(true);
        }
        Utility.FrameOpener.openFrame(Utility.FrameOpener.fr_settings, false);
    }
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCB_Music;
    private javax.swing.JCheckBox jCB_SoundEffect;
    public javax.swing.JLabel jL_BackGroundSettings;
    private javax.swing.JLabel jL_Text0;
    private javax.swing.JLabel jL_Text40;
    private javax.swing.JLabel jL_TextDifficulty;
    private javax.swing.JLabel jL_TextEasy;
    private javax.swing.JLabel jL_TextHard;
    private javax.swing.JLabel jL_TextMusic;
    private javax.swing.JLabel jL_TextNormal;
    private javax.swing.JLabel jL_TextSoundEffect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jS_Difficulty;
    private javax.swing.JSlider jS_SetVolumeMusic;
    // End of variables declaration//GEN-END:variables
   
}
