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

public class EventsMenu extends Menu {
    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public EventsMenu(String TITILE) {
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
            EditDialog dialog = new EditDialog("Edit");
            dialog.show();
        }
    }

    class DeleteMenuItem extends MenuItem {
        public DeleteMenuItem(String TITLE) {
            super(TITLE);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            DeleteDialog dialog = new DeleteDialog("Delete");
            dialog.show();
        }
    }

    class AddDialog extends Dialog {
        private JTextField objectNameField = new JTextField();
        private JTextField dateField = new JTextField();
        private JTextField eventNameField = new JTextField();
        private JTextField eventTypeField = new JTextField();

        public AddDialog(String TITLE) {
            super(TITLE);
            dialog.setLayout(new GridLayout(5,2));
            setLabels();
            setButton();
        }

        private void setLabels() {
            JLabel objectNameLabel = new JLabel("objectName");
            JLabel dateLabel = new JLabel("date");
            JLabel eventNameLabel = new JLabel("eventName");
            JLabel eventTypeLabel = new JLabel("eventType");

            dialog.add(objectNameLabel);
            dialog.add(objectNameField);

            dialog.add(dateLabel);
            dialog.add(dateField);

            dialog.add(eventNameLabel);
            dialog.add(eventNameField);

            dialog.add(eventTypeLabel);
            dialog.add(eventTypeField);
        }

        private void setButton() {
            Button button = new Button();
            button.getButton().addActionListener(button);
            dialog.add(button.getButton());
        }

        class Button implements ActionListener {
            private JButton button = new JButton("Add");

            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> list = new ArrayList<>();
                list.add(objectNameField.getText());
                list.add(dateField.getText());
                list.add(eventNameField.getText());
                list.add(eventTypeField.getText());
                controller.addEvent(list);
            }

            public JButton getButton() {
                return button;
            }
        }
    }

    class EditDialog extends Dialog {
        private JTextField objectNameField = new JTextField();
        private JTextField dateField = new JTextField();
        private JTextField eventNameField = new JTextField();
        private JTextField eventTypeField = new JTextField();

        public EditDialog(String TITLE) {
            super(TITLE);
            dialog.setLayout(new GridLayout(5,2));
            setLabels();
            setButton();
        }

        private void setLabels() {
            JLabel objectNameLabel = new JLabel("objectName");
            JLabel dateLabel = new JLabel("date");
            JLabel eventNameLabel = new JLabel("eventName");
            JLabel eventTypeLabel = new JLabel("eventType");

            dialog.add(objectNameLabel);
            dialog.add(objectNameField);

            dialog.add(dateLabel);
            dialog.add(dateField);

            dialog.add(eventNameLabel);
            dialog.add(eventNameField);

            dialog.add(eventTypeLabel);
            dialog.add(eventTypeField);
        }

        private void setButton() {
            Button button = new Button();
            button.getButton().addActionListener(button);
            dialog.add(button.getButton());
        }

        class Button implements ActionListener {
            private JButton button = new JButton("Edit");

            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> list = new ArrayList<>();
                list.add(objectNameField.getText());
                list.add(dateField.getText());
                list.add(eventNameField.getText());
                list.add(eventTypeField.getText());
                controller.editEvent(list);
            }

            public JButton getButton() {
                return button;
            }
        }
    }

    class DeleteDialog extends Dialog {
        private JTextField dateField = new JTextField();
        private JTextField eventNameField = new JTextField();

        public DeleteDialog(String TITLE) {
            super(TITLE);
            dialog.setLayout(new GridLayout(3,2));
            setLabels();
            setButton();
        }

        private void setLabels() {
            JLabel dateLabel = new JLabel("date");
            JLabel eventNameLabel = new JLabel("eventName");

            dialog.add(dateLabel);
            dialog.add(dateField);

            dialog.add(eventNameLabel);
            dialog.add(eventNameField);
        }

        private void setButton() {
            Button button = new Button();
            button.getButton().addActionListener(button);
            dialog.add(button.getButton());
        }

        class Button implements ActionListener {
            private JButton button = new JButton("Delete");

            @Override
            public void actionPerformed(ActionEvent e) {
                String date = dateField.getText();
                String eventName = eventNameField.getText();
                controller.deleteEvent(date, eventName);
            }

            public JButton getButton() {
                return button;
            }
        }
    }
}
