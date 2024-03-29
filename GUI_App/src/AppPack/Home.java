/**
 * Copyright (c) 2018, Ltech Dev. All rights reserved.
 * Ltech Dev 2018.
 * Developer - Lucky Ndlovu.
 */
package AppPack;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucky
 */
public class Home extends javax.swing.JFrame 
{
    
    /**
     * Creates new form Home
     */
    public Home() 
    {
        initComponents();
    
    
    int runtime = 0;
    
    //this thread allows for multiple processes to take place simultaneously
        new Thread()
        {
            
            //this function executes the thread
            public void run()
            {   
                DisplayPane.setVisible(false);
                
                while (runtime == 0)
                {                    
                    Date d = new Date();
                    
                    miniDisplay.setText(d.toString());
                }
                
                
                
        
        
        
            }//end of run()
    
        }.start();//end of new thread()
    
    }//end of Home()
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        miniDisplay = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        logn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DisplayPane = new javax.swing.JLayeredPane();
        userID = new javax.swing.JLabel();
        userIDfield = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        unameError = new javax.swing.JTextField();
        passError = new javax.swing.JTextField();
        forgot = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        confirm = new javax.swing.JLabel();
        pageTitle = new javax.swing.JLabel();
        closeFrame = new javax.swing.JLabel();
        Drag = new javax.swing.JLabel();
        Minimise = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideBar.setBackground(new java.awt.Color(0, 51, 0));

        miniDisplay.setForeground(new java.awt.Color(153, 153, 153));

        Login.setBackground(new java.awt.Color(204, 204, 204));
        Login.setToolTipText("Click here to login");
        Login.setComponentPopupMenu(DisplayPane.getComponentPopupMenu());
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LoginMouseMoved(evt);
            }
        });
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoginMouseReleased(evt);
            }
        });

        logn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logn.setText("Login");
        logn.setToolTipText("Click here to login");
        logn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lognMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lognMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lognMouseExited(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(logn)
                .addGap(117, 117, 117))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                .addComponent(miniDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addComponent(miniDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        Background.add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 500));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        userID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        userID.setForeground(new java.awt.Color(255, 255, 255));
        userID.setText("User ID");

        userIDfield.setToolTipText("Enter your username");
        userIDfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userIDfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDfieldActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Password");

        passField.setToolTipText("Enter your password");
        passField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        unameError.setEditable(false);
        unameError.setBackground(new java.awt.Color(0, 51, 51));
        unameError.setForeground(new java.awt.Color(255, 0, 0));
        unameError.setText("error place holder");
        unameError.setBorder(null);
        unameError.setOpaque(false);
        unameError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameErrorActionPerformed(evt);
            }
        });

        passError.setEditable(false);
        passError.setBackground(new java.awt.Color(0, 51, 51));
        passError.setForeground(new java.awt.Color(255, 0, 0));
        passError.setText("error place holder");
        passError.setBorder(null);
        passError.setOpaque(false);

        forgot.setForeground(new java.awt.Color(255, 255, 255));
        forgot.setText("Forgot Password?");
        forgot.setToolTipText("Click here if forgot password");
        forgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                forgotMouseReleased(evt);
            }
        });

        register.setBackground(new java.awt.Color(0, 153, 153));
        register.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.setToolTipText("Click here to register");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registerMouseReleased(evt);
            }
        });

        confirm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Confirm");
        confirm.setToolTipText("Confirm");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmMouseExited(evt);
            }
        });

        DisplayPane.setLayer(userID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DisplayPane.setLayer(userIDfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DisplayPane.setLayer(pass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DisplayPane.setLayer(passField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DisplayPane.setLayer(unameError, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DisplayPane.setLayer(passError, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DisplayPane.setLayer(forgot, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DisplayPane.setLayer(register, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DisplayPane.setLayer(confirm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DisplayPaneLayout = new javax.swing.GroupLayout(DisplayPane);
        DisplayPane.setLayout(DisplayPaneLayout);
        DisplayPaneLayout.setHorizontalGroup(
            DisplayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPaneLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(DisplayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DisplayPaneLayout.createSequentialGroup()
                        .addGroup(DisplayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(register, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirm))
                    .addComponent(userIDfield)
                    .addComponent(passField)
                    .addGroup(DisplayPaneLayout.createSequentialGroup()
                        .addComponent(pass)
                        .addGap(41, 41, 41)
                        .addComponent(passError, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addComponent(forgot)
                    .addGroup(DisplayPaneLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(unameError)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DisplayPaneLayout.setVerticalGroup(
            DisplayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPaneLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(DisplayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unameError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userIDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(DisplayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forgot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(DisplayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DisplayPane)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DisplayPane)
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 690, 430));

        pageTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pageTitle.setText("company");
        Background.add(pageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 40));

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
        Background.add(closeFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 20, 30));

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
        Background.add(Drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 26));

        Minimise.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Minimise.setText("-");
        Minimise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MinimiseMouseReleased(evt);
            }
        });
        Background.add(Minimise, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, 20));

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMousePressed
        int xCord = evt.getX();
        int yCord = evt.getY();  
    }//GEN-LAST:event_DragMousePressed

    private void DragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMouseDragged
        //getvalues of x an y points
        
        int x_val = evt.getXOnScreen();
        int y_val = evt.getYOnScreen();
        int xCord = 0;
        int yCord = 0;
        
        this.setLocation(x_val - xCord, y_val - yCord);
    }//GEN-LAST:event_DragMouseDragged

    //closes JFrame
    private void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    
    private void closeFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeFrameMouseClicked
        System.exit(0);
        
    }//GEN-LAST:event_closeFrameMouseClicked

    private void MinimiseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimiseMouseReleased
       this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_MinimiseMouseReleased

    private void LoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseReleased
     
     DisplayPane.setVisible(true);
   
        
    }//GEN-LAST:event_LoginMouseReleased

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        
       Login.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_LoginMouseClicked

    private void userIDfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDfieldActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void unameErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameErrorActionPerformed

    private void lognMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lognMouseClicked
       Login.setBackground(Color.DARK_GRAY);
       
       DisplayPane.setVisible(true);
       
    }//GEN-LAST:event_lognMouseClicked

    private void LoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseMoved
        
        //Local mouse listener variable
        MouseListener l = null;
       
        addMouseListener(l);
       /* if l.equals();
        {
            Login.setBackground(Color.WHITE);
        }*/
        
    }//GEN-LAST:event_LoginMouseMoved

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        Login.setBackground(Color.WHITE);
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        Login.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_LoginMouseExited

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        register.setForeground(Color.GRAY);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        register.setForeground(Color.WHITE);
    }//GEN-LAST:event_registerMouseExited

    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        confirm.setForeground(Color.GRAY);
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        confirm.setForeground(Color.WHITE);
    }//GEN-LAST:event_confirmMouseExited

    private void forgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseEntered
        forgot.setForeground(Color.GRAY);
    }//GEN-LAST:event_forgotMouseEntered

    private void forgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseExited
        forgot.setForeground(Color.WHITE);
    }//GEN-LAST:event_forgotMouseExited

    private void lognMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lognMouseEntered
        
        //calls LoginMouseEntered function
        LoginMouseEntered(evt);
    }//GEN-LAST:event_lognMouseEntered

    private void lognMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lognMouseExited
       
        //calls LoginMouseExited function
        LoginMouseExited(evt);
    }//GEN-LAST:event_lognMouseExited

    private void registerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseReleased
        //closes this frame
        close();
        
        //open registration frame
        Registration reg = new Registration();
        reg.setVisible(true);
    }//GEN-LAST:event_registerMouseReleased

    private void forgotMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseReleased
        
        close();
        
        ForgotPass fp = new ForgotPass();
        fp.setVisible(true);
    }//GEN-LAST:event_forgotMouseReleased

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLayeredPane DisplayPane;
    private javax.swing.JLabel Drag;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Minimise;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel closeFrame;
    private javax.swing.JLabel confirm;
    private javax.swing.JLabel forgot;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logn;
    private javax.swing.JLabel miniDisplay;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JLabel pass;
    private javax.swing.JTextField passError;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel register;
    private javax.swing.JTextField unameError;
    private javax.swing.JLabel userID;
    private javax.swing.JTextField userIDfield;
    // End of variables declaration//GEN-END:variables
}
