/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MaintenenceForm.java
 *
 * Created on 28 เม.ย. 2554, 16:36:28
 */

package FFC_Form;

import ConnectDatabase.DriverDataBase;
import FileManager.FileManager;
import FileManager.FileSettingDataBaseFFCManager;
import Information.BackupInformation;
import Maintenance.Restore;
import Management.BackupInformationManager;
import javax.swing.ToolTipManager;
import auto_sync_v2.Main;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ProgressMonitor;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PeeT
 */
public class MaintenenceForm extends javax.swing.JFrame {

    Thread backupThread;

    Point start_drag;
    Point start_loc;
    /** Creates new form MaintenenceForm */
    public MaintenenceForm() {
        initComponents();
        this.setAllbg();
        this.setVisibleBackupComponent();
        this.setVisibleRestoreComponent();
        ToolTipManager.sharedInstance().setInitialDelay(100);
        setLocationRelativeTo(null);
        this.backupDialog.setLocationRelativeTo(null);
        this.restoreDialog.setLocationRelativeTo(null);
        //this.showBackUpList();
        this.backupProgressBar.setIndeterminate(true);
        this.restoreProgressBar.setIndeterminate(true);
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backupDialog = new javax.swing.JDialog();
        backupProgressBar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        restoreDialog = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        restoreProgressBar = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        backUpButton = new javax.swing.JButton();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        databaseNameTextField = new javax.swing.JTextField();
        backupPathTextField = new javax.swing.JTextField();
        databasePathTextField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();

        backupDialog.setMinimumSize(new java.awt.Dimension(330, 180));

        jLabel4.setText("กรุณารอสักครู่...");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("กำลังสำรองฐานข้อมูล");

        jLabel7.setText("0");

        jLabel8.setText("Sec.");

        jLabel9.setText("Time :");

        org.jdesktop.layout.GroupLayout backupDialogLayout = new org.jdesktop.layout.GroupLayout(backupDialog.getContentPane());
        backupDialog.getContentPane().setLayout(backupDialogLayout);
        backupDialogLayout.setHorizontalGroup(
            backupDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backupDialogLayout.createSequentialGroup()
                .add(66, 66, 66)
                .add(jLabel6)
                .addContainerGap(264, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, backupDialogLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(75, 75, 75))
            .add(backupDialogLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(backupDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4)
                    .add(backupDialogLayout.createSequentialGroup()
                        .add(jLabel9)
                        .add(27, 27, 27)
                        .add(jLabel7)
                        .add(26, 26, 26)
                        .add(jLabel8))
                    .add(backupProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(34, 34, 34))
        );
        backupDialogLayout.setVerticalGroup(
            backupDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backupDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(11, 11, 11)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(backupProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(9, 9, 9)
                .add(backupDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jLabel7)
                    .add(jLabel8))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6)
                .add(49, 49, 49))
        );

        restoreDialog.setMinimumSize(new java.awt.Dimension(330, 180));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("กำลังเรียกคืนฐานข้อมูล");

        jLabel11.setText("กรุณารอสักครู่...");

        jLabel12.setText("Time :");

        jLabel13.setText("0");

        jLabel14.setText("Sec.");

        org.jdesktop.layout.GroupLayout restoreDialogLayout = new org.jdesktop.layout.GroupLayout(restoreDialog.getContentPane());
        restoreDialog.getContentPane().setLayout(restoreDialogLayout);
        restoreDialogLayout.setHorizontalGroup(
            restoreDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(restoreDialogLayout.createSequentialGroup()
                .add(restoreDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(restoreDialogLayout.createSequentialGroup()
                        .add(97, 97, 97)
                        .add(jLabel10))
                    .add(restoreDialogLayout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(restoreDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(restoreDialogLayout.createSequentialGroup()
                                .add(jLabel12)
                                .add(32, 32, 32)
                                .add(jLabel13)
                                .add(30, 30, 30)
                                .add(jLabel14))
                            .add(jLabel11)
                            .add(restoreProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 274, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        restoreDialogLayout.setVerticalGroup(
            restoreDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(restoreDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel11)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(restoreProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(restoreDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel12)
                    .add(jLabel13)
                    .add(jLabel14))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Image/bg3.jpg")))); // NOI18N

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(780, 408));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(780, 408));

        jLayeredPane6.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Image/background_newer.jpg")))); // NOI18N

        backUpButton.setText("Back Up");
        backUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backUpButtonActionPerformed(evt);
            }
        });
        backUpButton.setBounds(540, 260, 90, 30);
        jLayeredPane6.add(backUpButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        databaseNameTextField.setText("jhcisdb");
        databaseNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseNameTextFieldActionPerformed(evt);
            }
        });
        databaseNameTextField.setBounds(150, 30, 150, 30);
        jLayeredPane8.add(databaseNameTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backupPathTextField.setBounds(150, 70, 260, 30);
        jLayeredPane8.add(backupPathTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        databasePathTextField.setText("C:\\AppServ\\MySQL\\data");
        databasePathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databasePathTextFieldActionPerformed(evt);
            }
        });
        databasePathTextField.setBounds(150, 110, 260, 30);
        jLayeredPane8.add(databasePathTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setText("Browse...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(410, 70, 90, 30);
        jLayeredPane8.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setText("Browse...");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(410, 110, 90, 30);
        jLayeredPane8.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("Database name");
        jLabel1.setBounds(40, 30, 90, 30);
        jLayeredPane8.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("Backup to");
        jLabel2.setBounds(40, 70, 90, 30);
        jLayeredPane8.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("Database Path");
        jLabel3.setBounds(40, 110, 90, 30);
        jLayeredPane8.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane8.setBounds(110, 70, 520, 170);
        jLayeredPane6.add(jLayeredPane8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Image/backupTab.png")), jLayeredPane6); // NOI18N

        jButton3.setText("Restore");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(570, 200, 110, 30);
        jLayeredPane7.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton7.setText("Remove");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.setBounds(50, 200, 100, 30);
        jLayeredPane7.add(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Image/restoreTab.png")), jLayeredPane7); // NOI18N

        jTabbedPane1.setBounds(10, 110, 880, 470);
        jLayeredPane2.add(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Image/maintenance_head2.jpg")))); // NOI18N
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(900, 100));

        jButton4.setBackground(new java.awt.Color(192, 222, 246));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/homeIcon.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/homeIcon_mouseOver.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(30, 10, 70, 70);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close-green20x20.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close-green2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(850, 10, 20, 20);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize-green20x20.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(830, 10, 20, 20);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane1.setBounds(10, 10, 880, 90);
        jLayeredPane2.add(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setBounds(150, 540, -1, -1);
        jLayeredPane2.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Image/footer_newer.jpg")))); // NOI18N
        jLayeredPane4.setBounds(10, 580, 880, 60);
        jLayeredPane2.add(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MainForm.closeForm(3);
        Service.Service.mainform.setLocation(Service.Service.frameLocation);
        Main.openMain();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void databasePathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databasePathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_databasePathTextFieldActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JFileChooser backuuPathFileChooser = new JFileChooser();
        backuuPathFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = backuuPathFileChooser.showOpenDialog(this);
        if ( result == JFileChooser.APPROVE_OPTION )
        {
            this.backupPathTextField.setText(backuuPathFileChooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JFileChooser databasePathFileChooser = new JFileChooser();
        databasePathFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = databasePathFileChooser.showOpenDialog(this);
        if ( result == JFileChooser.APPROVE_OPTION )
        {
            this.databasePathTextField.setText(databasePathFileChooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void backUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backUpButtonActionPerformed
        // TODO add your handling code here:
       String sourcePath = this.databasePathTextField.getText();
       String destinationPath = this.backupPathTextField.getText();
       String databaseName = this.databaseNameTextField.getText();
       Maintenance.BackUp backup = new Maintenance.BackUp(sourcePath,destinationPath,databaseName);
       if(!this.databaseNameTextField.getText().isEmpty()){
           if(!this.backupPathTextField.getText().isEmpty()){
               if(!this.databasePathTextField.getText().isEmpty()){
                   boolean checkDataBase = backup.checkDatabase(this.databaseNameTextField.getText(),this.databasePathTextField.getText());
                   if(!checkDataBase){
                       JOptionPane.showMessageDialog(MainForm.maintenForm, "ไม่มีฐานข้อมูลที่เลือก !!!");
                       //return;
                   }else{
                       
                       backupThread = new Thread(backup);
                       backup.getBackupthread(backupThread);
                       backupThread.start();
                       this.setEnabled(false);
                       this.backupDialog.setVisible(true);
                   }
               }else{
                   JOptionPane.showMessageDialog(this, "กรุณาระบุ Database Path");
               }
           }else{
               JOptionPane.showMessageDialog(this, "กรุณาระบุ Backup Path");
           }
        }else{
           JOptionPane.showMessageDialog(this, "กรุณาระบุ database Name");
        }
    }//GEN-LAST:event_backUpButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        int rowSelected = this.backupListTable.getSelectedRow();
       // String databaseName = this.backupListTable.getValueAt(rowSelected, 0).toString();
       // String dateBackup = this.backupListTable.getValueAt(rowSelected, 1).toString();
       // String backupPath = this.backupListTable.getValueAt(rowSelected, 2).toString();
       // Restore restore = new Restore(databaseName,dateBackup,backupPath);
       // Thread restoreThread = new Thread(restore);
      //  restore.getRestoreThread(restoreThread);
      //  restoreThread.start();
        this.setEnabled(false);
        this.restoreDialog.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

       if(this.DeleteBackup()){
           JOptionPane.showMessageDialog(this, "ลบ Backup File สำเร็จ");
        }else{
           JOptionPane.showMessageDialog(this, "ลบ Backup File ล้มเหลว");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void databaseNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_databaseNameTextFieldActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        start_drag = this.getScreenLocation(evt);
        start_loc = this.getLocation();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
         Point current = this.getScreenLocation(evt);
        Point offset = new Point((int) current.getX() - (int) start_drag.getX(),
        (int) current.getY() - (int) start_drag.getY());
        Point new_location = new Point((int) (this.start_loc.getX() + offset.getX()), (int) (this.start_loc.getY() + offset.getY()));
        Service.Service.frameLocation = new_location;
        this.setLocation(new_location);
    }//GEN-LAST:event_formMouseDragged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaintenenceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backUpButton;
    private javax.swing.JDialog backupDialog;
    private javax.swing.JTextField backupPathTextField;
    private javax.swing.JProgressBar backupProgressBar;
    private javax.swing.JTextField databaseNameTextField;
    private javax.swing.JTextField databasePathTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog restoreDialog;
    private javax.swing.JProgressBar restoreProgressBar;
    // End of variables declaration//GEN-END:variables

    private void setbackground(JComponent component, String imagePath){
        ImageIcon earth = new ImageIcon(imagePath);
        JLabel backlabel = new JLabel(earth);
        component.add(backlabel, new Integer(Integer.MIN_VALUE));
        backlabel.setBounds(0, 0, earth.getIconWidth(), earth.getIconHeight());
    }

    private void setAllbg(){
        this.setbackground(this.jLayeredPane1,".\\src\\Image\\maintenance_head2.jpg");
        this.setbackground(this.jLayeredPane2,".\\src\\Image\\bg3.jpg");
        this.setbackground(this.jLayeredPane6,".\\src\\Image\\background_newer.jpg");
        this.setbackground(this.jLayeredPane7,".\\src\\Image\\background_newer.jpg");
        this.setbackground(this.jLayeredPane4,".\\src\\Image\\footer_newer.jpg");
    }

    public void showBackUpList(){
       /* File folder = new File("C:/FFC/Backup");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
            System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
             System.out.println("Directory " + listOfFiles[i].getName());
            }
        }*/
        
        String[][] data = new String[10][3];
        String[] columnName = {"Database Name","Date Backup","Backup Path"};
        BackupInformationManager backupManager = new BackupInformationManager();
        backupManager.setFileURL("./FFC/Backup_Information.ffc");
        ArrayList<BackupInformation> allBackupInformation = backupManager.getAllInformation();
        for(int i = 0; i<allBackupInformation.size(); i++){
            for(int j=0; j<columnName.length; j++){
                switch(j){
                    case 0: data[i][j] = allBackupInformation.get(i).getdatabaseName();
                            System.out.println(allBackupInformation.get(i).getdatabaseName());
                        break;
                    case 1: data[i][j] = allBackupInformation.get(i).getDateBackup();
                            System.out.println(allBackupInformation.get(i).getDateBackup());
                        break;
                    case 2: data[i][j] = allBackupInformation.get(i).getBackupPath();
                            System.out.println(allBackupInformation.get(i).getBackupPath());
                        break;
                }
            }
        }
        DefaultTableModel tableModel = new DefaultTableModel(data,columnName);
        //this.backupListTable.setModel(tableModel);
    }

    public void setVisibleBackupDialog(boolean set){
        this.backupDialog.setVisible(set);
    }

    public void setTextTimeLabelBackup(String text){
        this.jLabel7.setText(text);
    }

    public void setVisibleRestoreDialog(boolean set){
        this.restoreDialog.setVisible(set);
    }

    public void setTextTimeLabelRestore(String text){
        this.jLabel13.setText(text);
    }

    public boolean DeleteBackup(){
//        int rowDelete = this.backupListTable.getSelectedRow();
    //    String databaseName = this.backupListTable.getValueAt(rowDelete, 0).toString();
    //    String dateBackup = this.backupListTable.getValueAt(rowDelete, 1).toString();
   //     String backupPath = this.backupListTable.getValueAt(rowDelete, 2).toString();
   //     String backupFullPath = backupPath + "\\" + databaseName + "_" + dateBackup + ".sql";
   //     System.out.println(backupFullPath);
        BackupInformationManager backupInformationManager = new BackupInformationManager();
        backupInformationManager.setFileURL("./FFC/backup_Information.ffc");
      //  backupInformationManager.deleteInformation(databaseName + "_" + dateBackup);
        FileManager fileManager = new FileManager();
      //  if(fileManager.deleteDirectory(backupFullPath)){
            //this.showBackUpList();
     //       return true;
//        }else
            return false;
    }

    Point getScreenLocation(MouseEvent e) {
    Point cursor = e.getPoint();
    Point target_location = this.getLocationOnScreen();
    return new Point((int) (target_location.getX() + cursor.getX()),
        (int) (target_location.getY() + cursor.getY()));
    }

    private void setVisibleBackupComponent(){
        this.jLayeredPane8.setVisible(false);
        this.jLabel1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jLabel3.setVisible(false);
        this.databaseNameTextField.setVisible(false);
        this.backupPathTextField.setVisible(false);
        this.databasePathTextField.setVisible(false);
        this.jButton5.setVisible(false);
        this.jButton6.setVisible(false);
        this.backUpButton.setVisible(false);
    }

    private void setVisibleRestoreComponent(){
//        this.backupListTable.setVisible(false);
        this.jButton7.setVisible(false);
        this.jButton3.setVisible(false);
    }
  
}