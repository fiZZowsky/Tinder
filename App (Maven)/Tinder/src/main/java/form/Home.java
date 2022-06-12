package form;

import model.Model_User_Account;
import net.miginfocom.swing.MigLayout;
/**
 * ODpowiedzialna za ekran startowy
 * 
 */
public class Home extends javax.swing.JLayeredPane {

    private Chat chat;

    public Home() {
        initComponents();
        init();
    }
/**
 * Inicjalizuje home 
 */
    private void init() {
        setLayout(new MigLayout("fillx, filly", "0[200!]5[fill, 100%]5[200!]0", "0[fill]0"));
        this.add(new Menu_Left());
        chat = new Chat();
        this.add(chat);
        this.add(new Menu_Right());
        chat.setVisible(false);
    }
/**
 * Ustawia użytkownika 
 * @param user 
 */
    public void setUser(Model_User_Account user) {
        chat.setUser(user);
        chat.setVisible(true);
    }
/**
 * Aktualizuje użytkownika 
 * @param user 
 */
    public void updateUser(Model_User_Account user) {
        chat.updateUser(user);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(1007, 688));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
