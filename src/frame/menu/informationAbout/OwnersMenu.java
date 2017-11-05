package frame.menu.informationAbout;

import controller.Controller;
import frame.menu.Menu;
import frame.menu.MenuItem;
import dialog.Dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OwnersMenu extends Menu {
    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public OwnersMenu(String TITILE) {
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
            AddDialog addDialog = new AddDialog("Add");
            addDialog.show();
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
        private JTextField ownerIdField = null;
        private JTextField isPrivateField = null;
        private JTextField enityField = null;
        private JTextField nameField = null;
        private JTextField headFIOField = null;
        private JTextField phoneNumberField = null;
        private JTextField openDateField = null;

        public AddDialog(String TITLE) {
            super(TITLE);
            setDialog();
        }

        private void setDialog() {
            dialog.setLayout(new GridLayout(8, 2));
            setLabelsAndFields();
            setButton();
        }

        private void setLabelsAndFields() {
            JLabel ownerIdLabel = new JLabel("ownerId");
            JLabel isPrivateLabel = new JLabel("isPrivate");
            JLabel enityLabel = new JLabel("enity");
            JLabel nameLabel = new JLabel("name");
            JLabel headFIOLabel = new JLabel("headFIO");
            JLabel phoneNumberLabel = new JLabel("phoneNumber");
            JLabel openDateLabel = new JLabel("openDate");

            ownerIdField = new JTextField();
            isPrivateField = new JTextField();
            enityField = new JTextField();
            nameField = new JTextField();
            headFIOField = new JTextField();
            phoneNumberField = new JTextField();
            openDateField = new JTextField();

            dialog.add(ownerIdLabel);
            dialog.add(ownerIdField);

            dialog.add(isPrivateLabel);
            dialog.add(isPrivateField);

            dialog.add(enityLabel);
            dialog.add(enityField);

            dialog.add(nameLabel);
            dialog.add(nameField);

            dialog.add(headFIOLabel);
            dialog.add(headFIOField);

            dialog.add(phoneNumberLabel);
            dialog.add(phoneNumberField);

            dialog.add(openDateLabel);
            dialog.add(openDateField);
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

                String string = ownerIdField.getText();
                list.add(string);

                string = isPrivateField.getText();
                list.add(string);

                string = enityField.getText();
                list.add(string);

                string = nameField.getText();
                list.add(string);

                string = headFIOField.getText();
                list.add(string);

                string = phoneNumberField.getText();
                list.add(string);

                string = openDateField.getText();
                list.add(string);

                controller.addOwner(list);
            }

            public JButton getButton() {
                return button;
            }
        }
    }

    class EditDialog extends Dialog {
        private JTextField ownerIdField = null;
        private JTextField isPrivateField = null;
        private JTextField enityField = null;
        private JTextField nameField = null;
        private JTextField headFIOField = null;
        private JTextField phoneNumberField = null;
        private JTextField openDateField = null;

        public EditDialog(String TITLE) {
            super(TITLE);
            setDialog();
        }

        private void setDialog() {
            dialog.setLayout(new GridLayout(8, 2));
            setLabelsAndFields();
            setButton();
        }

        private void setLabelsAndFields() {
            JLabel ownerIdLabel = new JLabel("ownerId");
            JLabel isPrivateLabel = new JLabel("isPrivate");
            JLabel enityLabel = new JLabel("enity");
            JLabel nameLabel = new JLabel("name");
            JLabel headFIOLabel = new JLabel("headFIO");
            JLabel phoneNumberLabel = new JLabel("phoneNumber");
            JLabel openDateLabel = new JLabel("openDate");

            ownerIdField = new JTextField();
            isPrivateField = new JTextField();
            enityField = new JTextField();
            nameField = new JTextField();
            headFIOField = new JTextField();
            phoneNumberField = new JTextField();
            openDateField = new JTextField();

            dialog.add(ownerIdLabel);
            dialog.add(ownerIdField);

            dialog.add(isPrivateLabel);
            dialog.add(isPrivateField);

            dialog.add(enityLabel);
            dialog.add(enityField);

            dialog.add(nameLabel);
            dialog.add(nameField);

            dialog.add(headFIOLabel);
            dialog.add(headFIOField);

            dialog.add(phoneNumberLabel);
            dialog.add(phoneNumberField);

            dialog.add(openDateLabel);
            dialog.add(openDateField);
        }

        private void setButton() {
            Button button = new Button();
            JButton editButton = button.getButton();
            editButton.addActionListener(button);
            dialog.add(editButton);
        }

        class Button implements ActionListener {
            private JButton button = new JButton();

            public Button() {
                setButton();
            }

            private void setButton() {
                button.setText("Edit");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> list = new ArrayList<>();

                String string = ownerIdField.getText();
                list.add(string);

                string = isPrivateField.getText();
                list.add(string);

                string = enityField.getText();
                list.add(string);

                string = nameField.getText();
                list.add(string);

                string = headFIOField.getText();
                list.add(string);

                string = phoneNumberField.getText();
                list.add(string);

                string = openDateField.getText();
                list.add(string);

                controller.editOwner(list);
            }

            public JButton getButton() {
                return button;
            }
        }
    }

    class DeleteDialog extends Dialog {
        private JTextField ownerIdField = null;

        public DeleteDialog(String TITLE) {
            super(TITLE);
            setDialog();
        }

        private void setDialog() {
            dialog.setLayout(new GridLayout(2, 2));
            setLabelsAndFields();
            setButton();
        }

        private void setLabelsAndFields() {
            JLabel ownerIdLabel = new JLabel("ownerId");
            ownerIdField = new JTextField();

            dialog.add(ownerIdLabel);
            dialog.add(ownerIdField);
        }

        private void setButton() {
            Button button = new Button();
            JButton deleteButton = button.getButton();
            deleteButton.addActionListener(button);
            dialog.add(deleteButton);
        }

        class Button implements ActionListener {
            private JButton button = new JButton();

            public Button() {
                setButton();
            }

            private void setButton() {
                button.setText("Delete");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                String ownerId = ownerIdField.getText();
                controller.deleteOwner(ownerId);
            }

            public JButton getButton() {
                return button;
            }
        }
    }
}
