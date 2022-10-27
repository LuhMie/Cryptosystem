package cryptosystem;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Decryption extends javax.swing.JFrame {

    AESAlgorithm aesAlgo;
    DESAlgorithm DesAlgo;
    
    public Decryption() {
        initComponents();
        jLayeredPane1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        preview = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        filePath = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Algorithm = new javax.swing.JComboBox<>();
        encTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpb1 = new javax.swing.JProgressBar();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(696, 619));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(51, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRYPTOSYSTEM FOR SECURING MEDICAL IMAGES");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "by OLAJIDE EBENEZER OLUMIDE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        jPanel2.setBackground(java.awt.SystemColor.windowBorder);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Image Decryption", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        preview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preview.setText("Image Preview");
        preview.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jButton1.setText("Browse");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        filePath.setEditable(false);
        filePath.setEnabled(false);
        filePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePathActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Decryption Analysis", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Decrypt");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select an Algorithm For Decryption:");

        Algorithm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "AES", "DES" }));
        Algorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgorithmActionPerformed(evt);
            }
        });

        encTime.setEditable(false);
        encTime.setEnabled(false);
        encTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encTimeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Decryption Time: ");

        jLayeredPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Algorithm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(encTime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpb1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(Algorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encTime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jpb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Algorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(encTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jButton4.setText("Next >>");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("<< Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(11, 11, 11))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filePath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(2, 2, 2)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(filePath.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Select image file");
        }
        else{
            jLayeredPane1.setVisible(true);
            jButton4.setVisible(false);
            jButton5.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void encTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encTimeActionPerformed

    private void AlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgorithmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlgorithmActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            String algo = Algorithm.getSelectedItem().toString();
            jpb1.setValue(10);
            if("Select".equals(algo)){
                JOptionPane.showMessageDialog(null,"Please Select and algorithm to decrypt");
                jpb1.setValue(0);
            }
            else{
                FileInputStream file = new FileInputStream(filePath.getText());
                String decpath = "C:\\Users\\OLUMIDE\\Desktop\\Decrypt.jpg";
                jpb1.setValue(20);
                FileOutputStream outStream = new FileOutputStream(decpath);
                byte k[] = null;
                String userKey = (String) JOptionPane.showInputDialog("Secret Key");
                jpb1.setValue(30);
                long startTime = System.nanoTime();
                if("AES".equals(algo))
                {
                    if(userKey.equals("abcdef1234567890")){
                        k = userKey.getBytes();
                        jpb1.setValue(40);
                    }
                    else if(userKey.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Secret Key");
                        jpb1.setValue(10);
                    }
                    else if(userKey.length()!=16){
                        JOptionPane.showMessageDialog(null,"The key length for AES should be exactly 16");
                        jpb1.setValue(10);
                    }
                    else if(userKey!="abcdef1234567890"){
                        JOptionPane.showMessageDialog(null, "Wrong Key supplied");
                        jpb1.setValue(10);
                    }
                }
                else{
                    if(userKey.equals("12345678")){
                        k = userKey.getBytes();
                        jpb1.setValue(40);
                    }
                    else if(userKey.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Secret Key");
                        jpb1.setValue(10);
                    }
                    else if(userKey.length()!=8){
                        JOptionPane.showMessageDialog(null,"The key length for DES should be exactly 8");
                        jpb1.setValue(10);
                    }
                    else if(userKey!="12345678"){
                        JOptionPane.showMessageDialog(null, "Wrong Key supplied");
                        jpb1.setValue(10);
                    }
                }
                SecretKeySpec key = new SecretKeySpec(k,algo);
                Cipher enc = Cipher.getInstance(algo);
                enc.init(Cipher.DECRYPT_MODE,key);
                CipherOutputStream cos = new CipherOutputStream(outStream,enc);
                byte buf[] = new byte[1024];
                int read;
                jpb1.setValue(90);
                JOptionPane.showMessageDialog(null,"Image decrypted successfully");
                jpb1.setValue(100);
                while((read=file.read(buf))!=-1){
                    cos.write(buf,0,read);
                }
                file.close();
                outStream.flush();
                cos.close();
                jpb1.setValue(100);
                long elapsedTime = System.nanoTime() - startTime;
                double finalTime = (double)elapsedTime/1000000000;
                DecimalFormat df = new DecimalFormat("0.00");
                encTime.setText((df.format(finalTime)) + "s \n");
                JOptionPane.showMessageDialog(null, "Click OK to preview the image.");
                preview.setIcon(null);
                String encimgg = "C:\\Users\\OLUMIDE\\Desktop\\Decrypt.jpg";
                ImageIcon imgIco = new ImageIcon(encimgg);
                Image imgFit = imgIco.getImage();
                Image imggFit = imgFit.getScaledInstance(preview.getWidth(), preview.getHeight(), Image.SCALE_SMOOTH);
                preview.setIcon(new ImageIcon(imggFit));
            }
        }
        catch(HeadlessException | IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void filePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePathActionPerformed

    }//GEN-LAST:event_filePathActionPerformed
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("i Extension supported","jpg","jpeg","png");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String sIm = f.getAbsolutePath();
        filePath.setText(sIm);
        String encimg = "src\\cryptosystem\\encimage.jpg";
        preview.setText(null);
        ImageIcon imIco = new ImageIcon(encimg);
        Image imFit = imIco.getImage();
        Image imgFit = imFit.getScaledInstance(preview.getWidth(), preview.getHeight(), Image.SCALE_SMOOTH);
        preview.setIcon(new ImageIcon(imgFit));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        home n = new home();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Decryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Algorithm;
    private javax.swing.JTextField encTime;
    private javax.swing.JTextField filePath;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jpb1;
    private javax.swing.JLabel preview;
    // End of variables declaration//GEN-END:variables
}
