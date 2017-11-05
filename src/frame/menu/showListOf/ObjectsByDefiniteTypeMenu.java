package frame.menu.showListOf;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjectsByDefiniteTypeMenu {
    private JMenuItem menuItem = new JMenuItem("<html><font style=’italic’ size = 4>" + "ObjectsByDefiniteType" + "</html>");
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
            String objectType = JOptionPane.showInputDialog(null, "objectType");
            controller.showObjectByDefinitType(objectType);
        }
    }

    public JMenuItem getMenuItem() {
        return menuItem;
    }
}
