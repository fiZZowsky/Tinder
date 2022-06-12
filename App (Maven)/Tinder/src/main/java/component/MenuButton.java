package component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;
/**
 * Odpowiedzialna za przycisk menu
 * @author T460s i7
 */
public class MenuButton extends JButton {

    public Icon getIconSimple() {
        return iconSimple;
    }
/**
 * Ustawienie ikony
 * @param iconSimple 
 */
    public void setIconSimple(Icon iconSimple) {
        this.iconSimple = iconSimple;
    }
/**
 * Pobranie ikony ustawionej
 * @return 
 */
    public Icon getIconSelected() {
        return iconSelected;
    }
/**
 * Ustawienie ikony
 * @param iconSelected 
 */
    public void setIconSelected(Icon iconSelected) {
        this.iconSelected = iconSelected;
    }

    private Icon iconSimple;
    private Icon iconSelected;

    public MenuButton() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln);
        if (bln) {
            setIcon(iconSelected);
        } else {
            setIcon(iconSimple);
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if (isSelected()) {
            grphcs.setColor(new Color(110, 213, 255));
            grphcs.fillRect(0, getHeight() - 3, getWidth(), getHeight());
        }
    }
}
