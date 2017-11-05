package frame;

import controller.Controller;
import frame.menuBar.MenuBar;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private JFrame mFrame = new JFrame();
    private Controller controller;

    public void setmFrame() {
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setmFrameSize();
        setmFrameTitle();

        addMenuBar();
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    private void setmFrameSize() {
        final int WIDTH = 1500;
        final int HEIGHT = 800;

        mFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mFrame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        mFrame.setLocationRelativeTo(null);
    }

    private void setmFrameTitle() {
        final String TITLE = "Information service of the city";
        mFrame.setTitle(TITLE);
    }

    private void addMenuBar() {
        MenuBar menuBar = new MenuBar();
        menuBar.setController(controller);
        menuBar.setMenuBar();
        JMenuBar mBar = menuBar.getMenuBar();

        ElementManager elementManager = new ElementManager();
        elementManager.addElement(mFrame, mBar);
    }

    public void show() {
        mFrame.setVisible(true);
    }
}
