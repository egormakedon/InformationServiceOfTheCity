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

public class CityObjectsMenu extends Menu {
    private Controller controller;

    public CityObjectsMenu(String TITILE) {
        super(TITILE);
    }

    public void setMenuItems() {
        addMenuItem();
        editMenuItem();
        deleteMenuItem();
    }

    public void setController(Controller controller) {
        this.controller = controller;
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
        private JTextField objectIdField = null;
        private JTextField objectNameField = null;
        private JTextField objectTypeField = null;
        private JTextField objectAddressField = null;
        private JTextField isOpenField = null;
        private JTextField ownerIdField = null;

        public AddDialog(String TITLE) {
            super(TITLE);
            setDialog();
        }

        private void setDialog() {
            dialog.setLayout(new GridLayout(7, 2));
            setLabelsAndFields();
            setButton();
        }

        private void setLabelsAndFields() {
            JLabel objectIdLabel = new JLabel("objectId");
            JLabel objectNameLabel = new JLabel("objectName");
            JLabel objectTypeLabel = new JLabel("objectType");
            JLabel objectAddressLabel = new JLabel("objectAddress");
            JLabel isOpenLabel = new JLabel("isOpen");
            JLabel ownerIdLabel = new JLabel("ownerId");

            objectIdField = new JTextField();
            objectNameField = new JTextField();
            objectTypeField = new JTextField();
            objectAddressField = new JTextField();
            isOpenField = new JTextField();
            ownerIdField = new JTextField();

            dialog.add(objectIdLabel);
            dialog.add(objectIdField);

            dialog.add(objectNameLabel);
            dialog.add(objectNameField);

            dialog.add(objectTypeLabel);
            dialog.add(objectTypeField);

            dialog.add(objectAddressLabel);
            dialog.add(objectAddressField);

            dialog.add(isOpenLabel);
            dialog.add(isOpenField);

            dialog.add(ownerIdLabel);
            dialog.add(ownerIdField);
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

                string = objectNameField.getText();
                list.add(string);

                string = objectTypeField.getText();
                list.add(string);

                string = objectAddressField.getText();
                list.add(string);

                string = isOpenField.getText();
                list.add(string);

                string = ownerIdField.getText();
                list.add(string);

                controller.addCityObject(list);
            }

            public JButton getButton() {
                return button;
            }
        }
    }

    class EditDialog extends Dialog {
        private JTextField objectIdField = null;
        private JTextField objectNameField = null;
        private JTextField objectTypeField = null;
        private JTextField objectAddressField = null;
        private JTextField isOpenField = null;
        private JTextField ownerIdField = null;

        public EditDialog(String TITLE) {
            super(TITLE);
            setDialog();
        }

        private void setDialog() {
            dialog.setLayout(new GridLayout(7, 2));
            setLabelsAndFields();
            setButton();
        }

        private void setLabelsAndFields() {
            JLabel objectIdLabel = new JLabel("objectId");
            JLabel objectNameLabel = new JLabel("objectName");
            JLabel objectTypeLabel = new JLabel("objectType");
            JLabel objectAddressLabel = new JLabel("objectAddress");
            JLabel isOpenLabel = new JLabel("isOpen");
            JLabel ownerIdLabel = new JLabel("ownerId");

            objectIdField = new JTextField();
            objectNameField = new JTextField();
            objectTypeField = new JTextField();
            objectAddressField = new JTextField();
            isOpenField = new JTextField();
            ownerIdField = new JTextField();

            dialog.add(objectIdLabel);
            dialog.add(objectIdField);

            dialog.add(objectNameLabel);
            dialog.add(objectNameField);

            dialog.add(objectTypeLabel);
            dialog.add(objectTypeField);

            dialog.add(objectAddressLabel);
            dialog.add(objectAddressField);

            dialog.add(isOpenLabel);
            dialog.add(isOpenField);

            dialog.add(ownerIdLabel);
            dialog.add(ownerIdField);
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

                String string = objectIdField.getText();
                list.add(string);

                string = objectNameField.getText();
                list.add(string);

                string = objectTypeField.getText();
                list.add(string);

                string = objectAddressField.getText();
                list.add(string);

                string = isOpenField.getText();
                list.add(string);

                string = ownerIdField.getText();
                list.add(string);

                controller.editCityObject(list);
            }

            public JButton getButton() {
                return button;
            }
        }
    }

    class DeleteDialog extends Dialog {
        private JTextField objectIdField = null;

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
            JLabel objectIdLabel = new JLabel("objectId");
            objectIdField = new JTextField();

            dialog.add(objectIdLabel);
            dialog.add(objectIdField);
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
                String objectId = objectIdField.getText();
                controller.deleteCityObject(objectId);
            }

            public JButton getButton() {
                return button;
            }
        }
    }
}
