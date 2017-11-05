package frame.menu.showListOf;

import controller.Controller;
import frame.menu.Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjectsByDateMenu {
    private JMenuItem menuItem = new JMenuItem("<html><font style=’italic’ size = 4>" + "ObjectsByCurDate" + "</html>");
    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setListener() {
        Listener listener = new Listener();
        menuItem.addActionListener(listener);
    }

    class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.showObjectByCurDate();
        }
    }

    public JMenuItem getMenuItem() {
        return menuItem;
    }
}
