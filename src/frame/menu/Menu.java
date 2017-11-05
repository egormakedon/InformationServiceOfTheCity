package frame.menu;

import javax.swing.*;

public abstract class Menu {
    protected JMenu menu = new JMenu();
    final String TITLE;

    public Menu(String TITILE) {
        this.TITLE = "<html><font style=’italic’ size = 4>" + TITILE + "</html>";
    }

    public void setMenu() {
        setMenuTitle();
    }

    private void setMenuTitle() {
        menu.setText(TITLE);
    }

    public JMenu getMenu() {
        return menu;
    }
}