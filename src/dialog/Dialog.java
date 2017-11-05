package dialog;

import javax.swing.*;
import java.awt.*;

public abstract class Dialog {
    protected JDialog dialog = new JDialog();

    public Dialog(String TITLE) {
        dialog.setTitle(TITLE);
        setDialog();
    }

    private void setDialog() {
        dialog.setAlwaysOnTop(true);
        dialog.setLayout(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setDialogSize();
        dialog.setLocationRelativeTo(null);
    }

    private void setDialogSize() {
        final int WIDTH = 400;
        final int HEIGHT = 200;

        dialog.setSize(new Dimension(WIDTH, HEIGHT));
        dialog.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        dialog.setResizable(false);
    }

    public void show() {
        dialog.setVisible(true);
    }
}
