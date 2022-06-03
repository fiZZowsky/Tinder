package form;

import event.PublicEvent;

public class Profile extends javax.swing.JPanel {
    public Profile() {
        initComponents();
        init();
    }
    
    private void init(){
        PublicEvent.getInstance().getEventMain().showLoading(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new swing.PictureBox();
        imageAvatar1 = new swing.ImageAvatar();
        name = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1060, 681));
        setPreferredSize(new java.awt.Dimension(1060, 681));

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/profile_background.jpeg"))); // NOI18N

        imageAvatar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imageAvatar1.setBorderSize(0);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        name.setMaximumSize(new java.awt.Dimension(250, 40));
        name.setMinimumSize(new java.awt.Dimension(250, 40));
        name.setPreferredSize(new java.awt.Dimension(250, 40));

        surname.setMaximumSize(new java.awt.Dimension(250, 40));
        surname.setMinimumSize(new java.awt.Dimension(250, 40));
        surname.setPreferredSize(new java.awt.Dimension(250, 40));

        age.setMaximumSize(new java.awt.Dimension(250, 40));
        age.setMinimumSize(new java.awt.Dimension(250, 40));
        age.setPreferredSize(new java.awt.Dimension(250, 40));

        country.setMaximumSize(new java.awt.Dimension(250, 40));
        country.setMinimumSize(new java.awt.Dimension(250, 40));
        country.setPreferredSize(new java.awt.Dimension(250, 40));

        pic.setLayer(imageAvatar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(surname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(age, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(country, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pic.setLayer(userName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout picLayout = new javax.swing.GroupLayout(pic);
        pic.setLayout(picLayout);
        picLayout.setHorizontalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addGroup(picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(surname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(country, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        picLayout.setVerticalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(picLayout.createSequentialGroup()
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel country;
    private swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel name;
    private swing.PictureBox pic;
    private javax.swing.JLabel surname;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
