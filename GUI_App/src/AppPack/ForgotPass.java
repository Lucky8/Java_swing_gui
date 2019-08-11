/**
 * Copyright (c) 2018, Ltech Dev. All rights reserved.
 * Ltech Dev 2018.
 * Developer - Lucky Ndlovu.
 */
package AppPack;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author Lucky
 */
public class ForgotPass extends javax.swing.JFrame {

    int xCord;
    int yCord;
    
    public ForgotPass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Minimise = new javax.swing.JLabel();
        closeFrame = new javax.swing.JLabel();
        Drag = new javax.swing.JLabel();
        pageTitle = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        formTitle = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimise.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Minimise.setText("-");
        Minimise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MinimiseMouseReleased(evt);
            }
        });
        Background.add(Minimise, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 20, 30));

        closeFrame.setBackground(new java.awt.Color(255, 255, 255));
        closeFrame.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        closeFrame.setText("X");
        closeFrame.setToolTipText("Click to exit...");
        closeFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeFrame.setMaximumSize(new java.awt.Dimension(16, 30));
        closeFrame.setMinimumSize(new java.awt.Dimension(16, 30));
        closeFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeFrameMouseClicked(evt);
            }
        });
        Background.add(closeFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 20, 30));

        Drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragMouseDragged(evt);
            }
        });
        Drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragMousePressed(evt);
            }
        });
        Background.add(Drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 26));

        pageTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pageTitle.setText("company");
        Background.add(pageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        background.setBackground(new java.awt.Color(0, 51, 0));

        formTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        formTitle.setForeground(new java.awt.Color(204, 204, 204));
        formTitle.setText("Password Retrieval");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(formTitle)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formTitle)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        Background.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 250));

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 0, 0));
        Back.setText("<");
        Back.setToolTipText("Previous page");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackMouseReleased(evt);
            }
        });
        Background.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MinimiseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimiseMouseReleased
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_MinimiseMouseReleased

    private void closeFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeFrameMouseClicked

        //exits application
        System.exit(0);
    }//GEN-LAST:event_closeFrameMouseClicked

    private void DragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMouseDragged
        //getvalues of x an y points

        int x_val = evt.getXOnScreen();
        int y_val = evt.getYOnScreen();

        this.setLocation(x_val - xCord, y_val - yCord);
    }//GEN-LAST:event_DragMouseDragged

    private void DragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMousePressed
        xCord = evt.getX();
        yCord = evt.getY();
    }//GEN-LAST:event_DragMousePressed

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setForeground(Color.GREEN);
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setForeground(Color.BLACK);
    }//GEN-LAST:event_BackMouseExited

    //closes JFrame
    private void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    private void BackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseReleased
        close();
        
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_BackMouseReleased

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
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Drag;
    private javax.swing.JLabel Minimise;
    private javax.swing.JPanel background;
    private javax.swing.JLabel closeFrame;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel pageTitle;
    // End of variables declaration//GEN-END:variables
}
