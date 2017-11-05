package frame.menu.informationAbout;

import controller.Controller;
import dialog.Dialog;
import frame.menu.Menu;
import frame.menu.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ObjectsPopularityMenu extends Menu {
    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public ObjectsPopularityMenu(String TITILE) {
        super(TITILE);
    }

    public void setMenuItems() {
        addMenuItem();
        editMenuItem();
        deleteMenuItem();
    }

    private void addMenuItem() {
        AddMenuItem addMenuItem = new AddMenuItem("Add");
        JMenuItem menuItem = addMenuItem.getMenuItem();
        menuItem.addActionListener(addMenuItem);
        menu.add(menuItem);
    }

    private void editMenuItem() {
        EditMenuItem editMenuItem = new EditMenuItem("Edit");
        JMenuItem menuItem = editMenuItem.getMenuItem();
        menuItem.addActionListener(editMenuItem);
        menu.add(menuItem);
    }

    private void deleteMenuItem() {
        DeleteMenuItem deleteMenuItem = new DeleteMenuItem("Delete");
        JMenuItem menuItem = deleteMenuItem.getMenuItem();
        menuItem.addActionListener(deleteMenuItem);
        menu.add(menuItem);
    }

    class AddMenuItem extends MenuItem {
        public AddMenuItem(String TITLE) {
            super(TITLE);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            AddDialog dialog = new AddDialog("Add");
            dialog.show();
        }
    }

    class EditMenuItem extends MenuItem {
        public EditMenuItem(String TITLE) {
            super(TITLE);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            EditDialog editDialog = new EditDialog("Edit");
            editDialog.show();
        }
    }

    class DeleteMenuItem extends MenuItem {
        public DeleteMenuItem(String TITLE) {
            super(TITLE);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            DeleteDialog deleteDialog = new DeleteDialog("Delete");
            deleteDialog.show();
        }
    }

    class AddDialog extends Dialog {
        private JTextField objectIdField = new JTextField();
        private JTextField dateField = new JTextField();
        private JTextField numberOfVisitorsField = new JTextField();

        public AddDialog(String TITLE) {
            super(TITLE);
            setDialog();
        }

        private void setDialog() {
            dialog.setLayout(new GridLayout(4, 2));
            setLabels();
            setButton();
        }

        private void setLabels() {
            JLabel objectIdLabel = new JLabel("objectId");
            JLabel dateLabel = new JLabel("date");
            JLabel numberOfVisitorsLabel = new JLabel("numberOfVisitors");

            dialog.add(objectIdLabel);
            dialog.add(objectIdField);

            dialog.add(dateLabel);
            dialog.add(dateField);

            dialog.add(numberOfVisitorsLabel);
            dialog.add(numberOfVisitorsField);
        }

        private void setButton() {
            Button button = new Button();
            JButton addButton = button.getButton();
            addButton.addActionListener(button);
            dialog.add(addButton);
        }

        class Button implements ActionListener {
            private JButton button = new JButton();

            public Button() {
                setButton();
            }

            private void setButton() {
                button.setText("Add");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> list = new ArrayList<>();

                String string = objectIdField.getText();
                list.add(string);

                string = dateField.getText();
                list.add(string);

                string = numberOfVisitorsField.getText();
                list.add(string);

                controller.addObjectPopularity(list);
            }

            public JButton getButton() {
                return button;
            }
        }
    }

    class EditDialog extends Dialog {
        private JTextField objectIdField = new JTextField();
        private JTextField dateField = new JTextField();
        private JTextField numberOfVisitorsField = new JTextField();

        public EditDialog(String TITLE) {
            super(TITLE);
            setDialog();
        }

        private void setDialog() {
            dialog.setLayout(new GridLayout(4, 2));
            setLabels();
            setButton();
        }

        private void setLabels() {
            JLabel objectIdLabel = new JLabel("objectId");
            JLabel dateLabel = new JLabel("date");
            JLabel numberOfVisitorsLabel = new JLabel("numberOfVisitors");

            dialog.add(objectIdLabel);
            dialog.add(objectIdField);

            dialog.add(dateLabel);
            dialog.add(dateField);

            dialog.add(numberOfVisitorsLabel);
            dialog.add(numberOfVisitorsField);
        }

        private void setButton() {
            Button button = new Button();
            JButton editButton = button.getButton();
            editButton.addActionListener(button);
            dialog.add(editButton);
        }

        class Button implements ActionListener {
            private JButton button = new JButton("Edit");

            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> list = new ArrayList<>();

                String string = objectIdField.getText();
                list.add(string);

                string = dateField.getText();
                list.add(string);

                string = numberOfVisitorsField.getText();
                list.add(string);

                controller.editObjectPopularity(list);
            }

            public JButton getButton() {
                return button;
            }
        }
    }

    class DeleteDialog extends Dialog {
        private JTextField objectIdField = new JTextField();
        private JTextField dateField = new JTextField();


        public DeleteDialog(String TITLE) {
            super(TITLE);
            setDialog();
        }

        private void setDialog() {
            dialog.setLayout(new GridLayout(3,2));
            setLabels();
            setButton();
        }

        private void setLabels() {
            JLabel objectIdLabel = new JLabel("objectId");
            JLabel dateLabel = new JLabel("date");

            dialog.add(objectIdLabel);
            dialog.add(objectIdField);

            dialog.add(dateLabel);
            dialog.add(dateField);
        }

        private void setButton() {
            Button button = new Button();
            JButton deleteButton = button.getButton();
            deleteButton.addActionListener(button);
            dialog.add(deleteButton);
        }

        class Button implements ActionListener {
            private JButton button = new JButton("Delete");

            @Override
            public void actionPerformed(ActionEvent e) {
                String objectId = objectIdField.getText();
                String date = dateField.getText();
                controller.deleteObjectPopularity(objectId, date);
            }

            public JButton getButton() {
                return button;
            }
        }
    }
}
