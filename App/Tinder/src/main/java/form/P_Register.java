package form;

import event.EventMessage;
import event.PublicEvent;
import model.Model_Message;
import model.Model_Register;

public class P_Register extends javax.swing.JPanel {
    public P_Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new swing.PictureBox();
        lbTitle = new javax.swing.JLabel();
        cmdBackLogin = new javax.swing.JButton();
        lbError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        cmdRegister = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(399, 471));
        setPreferredSize(new java.awt.Dimension(399, 471));

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/login_back.jpeg"))); // NOI18N
        pic.setMinimumSize(new java.awt.Dimension(399, 471));

        lbTitle.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(87, 87, 87));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Register");

        cmdBackLogin.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        cmdBackLogin.setForeground(new java.awt.Color(15, 128, 206));
        cmdBackLogin.setText("Back Login");
        cmdBackLogin.setBorder(null);
        cmdBackLogin.setBorderPainted(false);
        cmdBackLogin.setContentAreaFilled(false);
        cmdBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdBackLogin.setFocusPainted(false);
        cmdBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackLoginActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");
        jLabel1.setMaximumSize(new java.awt.Dimension(64, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(64, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(64, 22));

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        jLabel3.setText("Confirm Password");

        cmdRegister.setText("Register");
        cmdRegister.setContentAreaFilled(false);
        cmdRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegisterActionPerformed(evt);
            }
        });

        pic.setLayer(lbTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(cmdBackLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(lbError, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(txtUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(txtPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(txtRePassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(cmdRegister, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout picLayout = new javax.swing.GroupLayout(pic);
        pic.setLayout(picLayout);
        picLayout.setHorizontalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(picLayout.createSequentialGroup()
                .addComponent(lbError)
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(picLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUser)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPass)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(txtRePassword)
                    .addComponent(cmdRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(picLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(cmdBackLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        picLayout.setVerticalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picLayout.createSequentialGroup()
                .addComponent(lbError)
                .addGap(170, 170, 170)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cmdRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdBackLogin)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackLoginActionPerformed
        PublicEvent.getInstance().getEventLogin().goLogin();
    }//GEN-LAST:event_cmdBackLoginActionPerformed

    private void cmdRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegisterActionPerformed
        String userName = txtUser.getText().trim();
        String password = String.valueOf(txtPass.getPassword());
        String confirmPassword = String.valueOf(txtRePassword.getPassword());
        if (userName.equals("")) {
            txtUser.grabFocus();
        } else if (password.equals("")) {
            txtPass.grabFocus();
        } else if (!password.equals(confirmPassword)) {
            txtPass.grabFocus();
        } else {
            Model_Register data = new Model_Register(userName, password);
            PublicEvent.getInstance().getEventLogin().register(data, new EventMessage() {
                @Override
                public void callMessage(Model_Message message) {
                    if (!message.isAction()) {
                        lbError.setText(message.getMessage());
                    } else {
                        PublicEvent.getInstance().getEventMain().initChat();
                    }
                }
            });
        }
    }//GEN-LAST:event_cmdRegisterActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBackLogin;
    private javax.swing.JButton cmdRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbTitle;
    private swing.PictureBox pic;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
