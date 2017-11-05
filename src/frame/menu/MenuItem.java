package frame.menu;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class MenuItem implements ActionListener {
    protected JMenuItem menuItem = new JMenuItem();

    public MenuItem(String TITLE) {
        menuItem.setText("<html><font style=’italic’ size = 4>" + TITLE + "</html>");
    }

    public JMenuItem getMenuItem() {
        return menuItem;
    }
}
