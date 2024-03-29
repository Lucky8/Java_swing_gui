/**
 * Copyright (c) 2018, Ltech Dev. All rights reserved.
 * Ltech Dev 2018.
 * Developer - Lucky Ndlovu.
 */
package AppPack;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Random;

/**
 *
 * @author Lucky
 */
public class Registration extends javax.swing.JFrame {

    int xCord;
    int yCord;
    
    
    public Registration() {
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
        closeFrame = new javax.swing.JLabel();
        Minimise = new javax.swing.JLabel();
        Drag = new javax.swing.JLabel();
        pageTitle = new javax.swing.JLabel();
        RegPane = new javax.swing.JPanel();
        regTitle = new javax.swing.JLabel();
        userID = new javax.swing.JLabel();
        UserIDfield = new javax.swing.JTextField();
        generate = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surname = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        chooseGender = new javax.swing.JComboBox<>();
        register = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        confEmail = new javax.swing.JLabel();
        confEmailField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        PasswordField1 = new javax.swing.JPasswordField();
        confPassword = new javax.swing.JLabel();
        emailError = new javax.swing.JTextField();
        email2Error = new javax.swing.JTextField();
        password2Error = new javax.swing.JTextField();
        passwordError = new javax.swing.JTextField();
        PasswordField2 = new javax.swing.JPasswordField();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Minimise.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Minimise.setText("-");
        Minimise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MinimiseMouseReleased(evt);
            }
        });
        Background.add(Minimise, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, 20));

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

        pageTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pageTitle.setText("company");
        Background.add(pageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        RegPane.setBackground(new java.awt.Color(0, 51, 51));

        regTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        regTitle.setForeground(new java.awt.Color(255, 255, 255));
        regTitle.setText("Registration");

        userID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        userID.setForeground(new java.awt.Color(255, 255, 255));
        userID.setText("User ID");

        UserIDfield.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserIDfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDfieldActionPerformed(evt);
            }
        });

        generate.setForeground(new java.awt.Color(255, 255, 255));
        generate.setText("Generate ID");
        generate.setToolTipText("Generates user ID");
        generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generateMouseExited(evt);
            }
        });

        Name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");

        nameField.setToolTipText("Enter your name ");
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        surname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        surname.setForeground(new java.awt.Color(255, 255, 255));
        surname.setText("Surname");

        surnameField.setToolTipText("Enter your surname");
        surnameField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        surnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameFieldActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Gender");

        chooseGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        chooseGender.setToolTipText("Choose your gender");
        chooseGender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });

        email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email");

        emailField.setToolTipText("Enter email address");
        emailField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        confEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        confEmail.setForeground(new java.awt.Color(255, 255, 255));
        confEmail.setText("Confirm email");

        confEmailField.setToolTipText("Confirm email address");
        confEmailField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");

        PasswordField1.setToolTipText("Enter your password");
        PasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        confPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        confPassword.setForeground(new java.awt.Color(255, 255, 255));
        confPassword.setText("Confirm Password");

        emailError.setEditable(false);
        emailError.setBackground(new java.awt.Color(0, 51, 51));
        emailError.setForeground(new java.awt.Color(255, 51, 51));
        emailError.setText("error place holder");
        emailError.setBorder(null);
        emailError.setOpaque(false);

        email2Error.setEditable(false);
        email2Error.setBackground(new java.awt.Color(0, 51, 51));
        email2Error.setForeground(new java.awt.Color(255, 51, 51));
        email2Error.setText("error place holder");
        email2Error.setBorder(null);
        email2Error.setOpaque(false);

        password2Error.setEditable(false);
        password2Error.setBackground(new java.awt.Color(0, 51, 51));
        password2Error.setForeground(new java.awt.Color(255, 51, 51));
        password2Error.setText("error place holder");
        password2Error.setBorder(null);
        password2Error.setOpaque(false);

        passwordError.setEditable(false);
        passwordError.setBackground(new java.awt.Color(0, 51, 51));
        passwordError.setForeground(new java.awt.Color(255, 51, 51));
        passwordError.setText("error place holder");
        passwordError.setBorder(null);
        passwordError.setOpaque(false);

        PasswordField2.setToolTipText("Confirm password");
        PasswordField2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Back.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout RegPaneLayout = new javax.swing.GroupLayout(RegPane);
        RegPane.setLayout(RegPaneLayout);
        RegPaneLayout.setHorizontalGroup(
            RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegPaneLayout.createSequentialGroup()
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(RegPaneLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(regTitle))
                    .addGroup(RegPaneLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(surname)
                                .addComponent(Name)
                                .addGroup(RegPaneLayout.createSequentialGroup()
                                    .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                                    .addComponent(generate))
                                .addComponent(nameField)
                                .addComponent(surnameField)
                                .addComponent(UserIDfield))
                            .addComponent(gender)
                            .addComponent(chooseGender, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167)
                        .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegPaneLayout.createSequentialGroup()
                                .addComponent(confPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(password2Error, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegPaneLayout.createSequentialGroup()
                                .addComponent(password)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordError, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(confEmailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegPaneLayout.createSequentialGroup()
                                .addComponent(confEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(email2Error, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegPaneLayout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailError, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordField2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(register)
                        .addGap(292, 292, 292)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        RegPaneLayout.setVerticalGroup(
            RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generate)
                    .addComponent(email)
                    .addComponent(emailError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserIDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(confEmail)
                    .addComponent(email2Error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surname)
                    .addComponent(password)
                    .addComponent(passwordError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(confPassword)
                    .addComponent(password2Error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(RegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegPaneLayout.createSequentialGroup()
                        .addComponent(register)
                        .addGap(22, 22, 22))
                    .addComponent(Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Background.add(RegPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 920, 460));

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //closes JFrame
    private void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    private void closeFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeFrameMouseClicked
        
        //exits application
        System.exit(0);  
    }//GEN-LAST:event_closeFrameMouseClicked

    private void MinimiseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimiseMouseReleased
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_MinimiseMouseReleased

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

    private void UserIDfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDfieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameFieldActionPerformed

    private void generateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseEntered
      generate.setForeground(Color.GRAY);
    }//GEN-LAST:event_generateMouseEntered

    private void generateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseExited
        generate.setForeground(Color.WHITE);
    }//GEN-LAST:event_generateMouseExited

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
       register.setForeground(Color.GRAY);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
       register.setForeground(Color.WHITE);
    }//GEN-LAST:event_registerMouseExited

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setForeground(Color.GRAY);
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setForeground(Color.WHITE);
    }//GEN-LAST:event_BackMouseExited

    private void BackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseReleased
        close();
        
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_BackMouseReleased

    private void generateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseClicked
       
        RandomString rs = new RandomString();
        // Get the size n 
        int n = 5; 
  
        // Get and display the alphanumeric string 
        System.out.println(RandomString 
                               .getAlphaNumericString(n));
        
        UserIDfield.setText(RandomString 
                               .getAlphaNumericString(n));
    }//GEN-LAST:event_generateMouseClicked

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Drag;
    private javax.swing.JLabel Minimise;
    private javax.swing.JLabel Name;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JPasswordField PasswordField2;
    private javax.swing.JPanel RegPane;
    private javax.swing.JTextField UserIDfield;
    private javax.swing.JComboBox<String> chooseGender;
    private javax.swing.JLabel closeFrame;
    private javax.swing.JLabel confEmail;
    private javax.swing.JTextField confEmailField;
    private javax.swing.JLabel confPassword;
    private javax.swing.JLabel email;
    private javax.swing.JTextField email2Error;
    private javax.swing.JTextField emailError;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel generate;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JLabel password;
    private javax.swing.JTextField password2Error;
    private javax.swing.JTextField passwordError;
    private javax.swing.JLabel regTitle;
    private javax.swing.JLabel register;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel userID;
    // End of variables declaration//GEN-END:variables
}
