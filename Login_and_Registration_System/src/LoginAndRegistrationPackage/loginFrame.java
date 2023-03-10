/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginAndRegistrationPackage;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class loginFrame extends javax.swing.JFrame {

    /**
     * Creates new form loginFrame
     */
    public loginFrame() {
        initComponents();
        Connection();
    }
    
    // Initilize variables for database connection
    Connection connection;
    PreparedStatement prepared_Statement;
    ResultSet result_Set;
    
    public void Connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //com.mysql.jdbc.Driver
            connection = DriverManager.getConnection("jdbc:mysql://localhost/teknolohiyadb", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        sidePanelLogo = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        subHeaderLabel = new javax.swing.JLabel();
        subHeaderLabel1 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        loginLogo = new javax.swing.JLabel();
        signUpBtn1 = new javax.swing.JButton();
        showPassChckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setSize(new java.awt.Dimension(720, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setRequestFocusEnabled(false);

        sidePanel.setBackground(new java.awt.Color(0, 0, 0));

        sidePanelLogo.setForeground(new java.awt.Color(255, 255, 255));
        sidePanelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sidePanelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginAndRegistrationPackage/Logo V3.png"))); // NOI18N

        headerLabel.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Teknolohiya Software\n");

        subHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subHeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        subHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subHeaderLabel.setText("Teknolohiya | Copyright 2022\n\n\n");

        subHeaderLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subHeaderLabel1.setForeground(new java.awt.Color(255, 255, 255));
        subHeaderLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subHeaderLabel1.setText("Teknolohiya Software Version 1");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanelLogo)
            .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(subHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(subHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(sidePanelLogo)
                .addGap(140, 140, 140)
                .addComponent(headerLabel)
                .addGap(16, 16, 16)
                .addComponent(subHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subHeaderLabel1)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginAndRegistrationPackage/24 pixel.png"))); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setMaximumSize(new java.awt.Dimension(25, 25));
        exitBtn.setMinimumSize(new java.awt.Dimension(25, 25));
        exitBtn.setPreferredSize(new java.awt.Dimension(25, 25));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usernameLabel.setText("Username");

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLabel.setText("Password");

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        loginBtn.setBackground(new java.awt.Color(14, 19, 23));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        loginBtn.setForeground(java.awt.Color.white);
        loginBtn.setText("Log in");
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBtn.setIconTextGap(5);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        loginLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginAndRegistrationPackage/loginLogo.png"))); // NOI18N

        signUpBtn1.setBackground(new java.awt.Color(14, 19, 23));
        signUpBtn1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        signUpBtn1.setForeground(java.awt.Color.white);
        signUpBtn1.setText("Sign up");
        signUpBtn1.setBorder(null);
        signUpBtn1.setBorderPainted(false);
        signUpBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signUpBtn1.setIconTextGap(5);
        signUpBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpBtn1MouseClicked(evt);
            }
        });

        showPassChckBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        showPassChckBox.setText("Show Password");
        showPassChckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassChckBoxMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(loginLogo))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(showPassChckBox)
                                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameField)
                                        .addComponent(passwordField)
                                        .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(signUpBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 58, Short.MAX_VALUE))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(loginLogo)
                .addGap(49, 49, 49)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPassChckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // Exit Button
        System.exit(0);
        
    }//GEN-LAST:event_exitBtnMouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // Login Button
        
        // Intialize variables
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
        try { 
            prepared_Statement = connection.prepareStatement("SELECT * FROM user_account_table");
            result_Set = prepared_Statement.executeQuery();
            
            while(result_Set.next()) {
                
                // Initialize variables to get username and password
                String USERNAME = result_Set.getString("Username");
                String PASSWORD = result_Set.getString("Password");
                
                // Conditional Statement
                if(username.equals(USERNAME) && password.equals(PASSWORD)) {
                    JOptionPane.showMessageDialog(rootPane, "Successfully Logged In!", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);                     
                }else if(!username.equals(USERNAME) && password.equals(PASSWORD)) {
                    JOptionPane.showMessageDialog(rootPane, "Incorrect Username!", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                }else if(username.equals(USERNAME) && !password.equals(PASSWORD)) {
                   JOptionPane.showMessageDialog(rootPane, "Incorrect Password!", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                }
                  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        
    }//GEN-LAST:event_loginBtnMouseClicked

    private void signUpBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtn1MouseClicked
        // Sign up button
        registrationFrame registrationForm = new registrationFrame();
        registrationForm.show();
        dispose();
        
        
    }//GEN-LAST:event_signUpBtn1MouseClicked

    private void showPassChckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassChckBoxMouseClicked
        // Show password check box button
        
        if(showPassChckBox.isSelected()) {
            passwordField.setEchoChar((char)0);
        }else {
            passwordField.setEchoChar('*');
        }
        
    }//GEN-LAST:event_showPassChckBoxMouseClicked
    
    
    
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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel exitBtn;
    public javax.swing.JLabel headerLabel;
    public javax.swing.JButton loginBtn;
    public javax.swing.JLabel loginLogo;
    public static javax.swing.JPanel loginPanel;
    public javax.swing.JPasswordField passwordField;
    public javax.swing.JLabel passwordLabel;
    public static javax.swing.JCheckBox showPassChckBox;
    public static javax.swing.JPanel sidePanel;
    public javax.swing.JLabel sidePanelLogo;
    public javax.swing.JButton signUpBtn1;
    public javax.swing.JLabel subHeaderLabel;
    public javax.swing.JLabel subHeaderLabel1;
    public javax.swing.JTextField usernameField;
    public javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
