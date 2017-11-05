package frame.menu.showListOf;

import controller.Controller;
import frame.menu.Menu;

import javax.swing.*;

public class ShowListOfMenu extends Menu {
    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public ShowListOfMenu(String TITILE) {
        super(TITILE);
    }

    public void addMenu() {
        JMenuItem menuItem;

        ObjectsByDateMenu objectsByDateMenu = new ObjectsByDateMenu();
        objectsByDateMenu.setController(controller);
        objectsByDateMenu.setListener();

        EventsForTwoWeeksMenu eventsForTwoWeeksMenu = new EventsForTwoWeeksMenu();
        eventsForTwoWeeksMenu.setController(controller);
        eventsForTwoWeeksMenu.setListener();

        ObjectsByDefiniteTypeMenu objectsByDefiniteTypeMenu = new ObjectsByDefiniteTypeMenu();
        objectsByDefiniteTypeMenu.setController(controller);
        objectsByDefiniteTypeMenu.setListener();

        menuItem = objectsByDateMenu.getMenuItem();
        this.menu.add(menuItem);

        menuItem = eventsForTwoWeeksMenu.getMenuItem();
        this.menu.add(menuItem);

        menuItem = objectsByDefiniteTypeMenu.getMenuItem();
        this.menu.add(menuItem);
    }
}