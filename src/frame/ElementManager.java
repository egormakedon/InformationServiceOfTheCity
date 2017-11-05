package frame;

import javax.swing.*;

public class ElementManager {
    public void addElement(JFrame mFrame, JMenuBar menuBar) {
        mFrame.setJMenuBar(menuBar);
    }

    public void addElement(JMenuBar menuBar, JMenu menu) {
        menuBar.add(menu);
    }
}
