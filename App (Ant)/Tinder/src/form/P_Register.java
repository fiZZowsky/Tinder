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

        lbTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        cmdRegister = new javax.swing.JButton();
        cmdBackLogin = new javax.swing.JButton();
        txtRePassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbSurname = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        lbAge = new javax.swing.JLabel();
        ageSpinner = new javax.swing.JSpinner();
        lbCountry = new javax.swing.JLabel();
        CountryBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(268, 500));
        setPreferredSize(new java.awt.Dimension(268, 500));

        lbTitle.setFont(new java.awt.Font("sansserif", 0, 30)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(87, 87, 87));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Register");

        jLabel1.setText("User Name");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        cmdRegister.setText("Register");
        cmdRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegisterActionPerformed(evt);
            }
        });

        cmdBackLogin.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        cmdBackLogin.setForeground(new java.awt.Color(15, 128, 206));
        cmdBackLogin.setText("Back Login");
        cmdBackLogin.setContentAreaFilled(false);
        cmdBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackLoginActionPerformed(evt);
            }
        });

        txtRePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRePasswordActionPerformed(evt);
            }
        });

        jLabel3.setText("Confirm Password");

        lbError.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        lbError.setForeground(new java.awt.Color(255, 0, 0));
        lbError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbError.setText(" ");

        lbName.setText("Name");

        lbSurname.setText("Surname");

        lbAge.setText("Age");

        lbCountry.setText("Country");

        CountryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "Afganistan", "Albania", "Algieria", "Andora", "Angola", "Anguilla", "Antarktyda", "Antigua i Barbuda", "Arabia Saudyjska", "Argentyna", "Armenia", "Aruba", "Australia", "Austria", "Azerbejd??an", "Bahamy", "Bahrajn", "Bangladesz", "Barbados", "Belgia", "Belize", "Benin", "Bermudy", "Bhutan", "Bia??oru??", "Boliwia", "Bonaire", "Sint Eustatius i Saba", "Bo??nia i Hercegowina", "Botswana", "Brazylia", "Brunei Darussalam", "Bu??garia", "Burkina Faso", "Burundi", "Ceuta", "Chile", "Chiny", "Cura??ao", "Chorwacja", "Cypr", "Czad", "Czarnog??ra", "Czechy", "Dania", "Dominika", "Dominikana", "D??ibuti", "Egipt", "Ekwador", "Erytrea", "Estonia", "Etiopia", "Falklandy", "Fid??i Republika", "Filipiny", "Finlandia", "Francja", "Gabon", "Gambia", "Ghana", "Gibraltar", "Grecja", "Grenada", "Grenlandia", "Gruzja", "Guam", "Gujana", "Gwatemala", "Gwinea", "Gwinea R??wnikowa", "Gwinea-Bissau", "Haiti", "Hiszpania", "Honduras", "Hongkong", "Indie", "Indonezja", "Irak", "Iran", "Irlandia", "Islandia", "Izrael", "Jamajka", "Japonia", "Jemen", "Jordania", "Kajmany", "Kambod??a", "Kamerun", "Kanada", "Katar", "Kazachstan", "Kenia", "Kirgistan", "Kiribati", "Kolumbia", "Komory", "Kongo", "Korea P??n", "Korea P??d", "Kosowo", "Kostaryka", "Kuba", "Kuwejt", "Laos", "Lesotho", "Liban", "Liberia", "Libia", "Liechtenstein", "Litwa", "Luksemburg", "??otwa", "Macedonia P????nocna", "Madagaskar", "Majotta", "Makau", "Malawi", "Malediwy", "Malezja", "Mali", "Malta", "Mariany P????nocne", "Maroko", "Mauretania", "Mauritius", "Meksyk", "Melilla", "Mikronezja", "Minor", "Mo??dawia", "Mongolia", "Montserrat", "Mozambik", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Niderlandy", "Niemcy", "Niger", "Nigeria", "Nikaragua", "Niue", "Norfolk", "Norwegia", "Nowa Kaledonia", "Nowa Zelandia", "Oman", "Pakistan", "Palau", "Panama", "Papua Nowa Gwinea", "Paragwaj", "Peru", "Pitcairn", "Polinezja Francuska", "Polska", "Po??udniowa Afryka", "Po??udniowa Georgia i Po??udniowe Wyspy Sandwich", "Portugalia", "Rep.??rodkowoafrya??ska", "Rosja", "Rwanda", "Sahara Zachodnia", "Saint Barthelemy", "Rumunia", "Salwador", "Samoa", "San Marino", "Senegal", "Serbia", "Seszele", "Sierra Leone", "Singapur", "Suazi", "S??owacja", "S??owenia", "Somalia", "Sri Lanka", "St. Pierre i Miquelon", "St.Kitts i Nevis", "St.Lucia", "St.Vincent i Grenadyny", "Stany Zjednoczone", "Sudan", "Surinam", "Syria", "Szwajcaria", "Szwecja", "??wi??ta Helena", "Tad??ykistan", "Tajlandia", "Tajwan", "Tanzania", "Togo", "Tokelau", "Tonga", "Trynidad i Tobago", "Tunezja", "Turcja", "Turkmenistan", "Wyspy Turks i Caicos", "Tuvalu", "Uganda", "Ukraina", "Urugwaj", "Uzbekistan", "Vanuatu", "Wallis i Futuna", "Watykan", "Wenezuela", "W??gry", "Wielka Brytania", "Wietnam", "W??ochy", "Wschodni Timor", "Wyb.Ko??ci S??oniowej", "Wyspa Bouveta", "Wyspa Bo??ego Narodzenia", "Wyspy Cooka", "Wyspy Dziewicze", "Wyspy Heard i McDonald", "Wyspy Kokosowe (Keelinga)", "Wyspy Owcze", "Wyspy Marshalla", "Wyspy Salomona", "Wyspa Sint Maarten", "Wyspy ??w.Tomasza i Ksi??????ca", "Zambia", "Zielony Przyl??dek", "Zimbabwe", "Zjedn.Emiraty Arabskie", "Zjednoczone Kr??lestwo (Irlandia P????nocna)" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdBackLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(lbError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CountryBox, 0, 0, Short.MAX_VALUE)
                        .addComponent(ageSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addComponent(lbAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCountry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CountryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRegister)
                .addGap(12, 12, 12)
                .addComponent(cmdBackLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbError)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackLoginActionPerformed
        PublicEvent.getInstance().getEventLogin().goLogin();
    }//GEN-LAST:event_cmdBackLoginActionPerformed

    private void cmdRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegisterActionPerformed
        String name = txtName.getText().trim();
        String surname = txtSurname.getText().trim();
        int age = (Integer) ageSpinner.getValue();
        String country = String.valueOf(CountryBox.getSelectedItem());
        String userName = txtUser.getText().trim();
        String password = String.valueOf(txtPass.getPassword());
        String confirmPassword = String.valueOf(txtRePassword.getPassword());
        
        if (name.equals("")) {
            txtName.grabFocus();
        } else if (surname.equals("")) {
            txtSurname.grabFocus();
        } else if (country == "<none>") {
            CountryBox.grabFocus();
        } else if ((age <= 0) || (age > 150)) {
            ageSpinner.grabFocus();
        } else if (userName.equals("")) {
            txtUser.grabFocus();
        } else if (password.equals("")) {
            txtPass.grabFocus();
        } else if (!password.equals(confirmPassword)) {
            txtPass.grabFocus();
        } else {
            Model_Register data = new Model_Register(name, surname, age, country, userName, password);
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

    private void txtRePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRePasswordActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CountryBox;
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.JButton cmdBackLogin;
    private javax.swing.JButton cmdRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbCountry;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbSurname;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
