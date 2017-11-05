package frame.menuBar;

import controller.Controller;
import frame.ElementManager;
import frame.menu.informationAbout.InformationAboutMenu;
import frame.menu.showListOf.ShowListOfMenu;

import javax.swing.*;
import java.awt.*;

public class MenuBar {
    private Controller controller;
    private JMenuBar menuBar = new JMenuBar();

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setMenuBar() {
        setMenuBarBorder();
        setMenuBarCursor();
        setMenuBarSize();

        addMenu();
    }

    private void setMenuBarBorder() {
        menuBar.setBorder(BorderFactory.createMatteBorder(1,5,1,1, Color.RED));
    }

    private void setMenuBarCursor() {
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    private void setMenuBarSize() {
        final int WIDTH = 0;
        final int HEIGHT = 30;

        menuBar.setSize(new Dimension(WIDTH, HEIGHT));
        menuBar.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    private void addMenu() {
        ElementManager elementManager = new ElementManager();
        JMenu menu;

        InformationAboutMenu informationAboutMenu = new InformationAboutMenu("InformationAbout...");
        informationAboutMenu.setController(controller);
        informationAboutMenu.setMenu();
        informationAboutMenu.addMenu();

        ShowListOfMenu showListOfMenu = new ShowListOfMenu("ShowListOf...");
        showListOfMenu.setController(controller);
        showListOfMenu.setMenu();
        showListOfMenu.addMenu();

        menu = informationAboutMenu.getMenu();
        elementManager.addElement(menuBar, menu);

        menu = showListOfMenu.getMenu();
        elementManager.addElement(menuBar, menu);
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
}
