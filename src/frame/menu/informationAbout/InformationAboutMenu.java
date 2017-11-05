package frame.menu.informationAbout;

import controller.Controller;
import frame.menu.Menu;

import javax.swing.*;

public class InformationAboutMenu extends Menu {
    private Controller controller;

    public InformationAboutMenu(String TITILE) {
        super(TITILE);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void addMenu() {
        JMenu menu;

        CityObjectsMenu cityObjectsMenu = new CityObjectsMenu("CityObjects");
        cityObjectsMenu.setMenu();
        cityObjectsMenu.setController(controller);
        cityObjectsMenu.setMenuItems();

        OwnersMenu ownersMenu = new OwnersMenu("Owners");
        ownersMenu.setMenu();
        ownersMenu.setController(controller);
        ownersMenu.setMenuItems();

        ObjectsPopularityMenu objectsPopularityMenu = new ObjectsPopularityMenu("ObjectsPopularity");
        objectsPopularityMenu.setMenu();
        objectsPopularityMenu.setController(controller);
        objectsPopularityMenu.setMenuItems();

        EventsMenu eventsMenu = new EventsMenu("Events");
        eventsMenu.setMenu();
        eventsMenu.setController(controller);
        eventsMenu.setMenuItems();

        menu = cityObjectsMenu.getMenu();
        this.menu.add(menu);

        menu = ownersMenu.getMenu();
        this.menu.add(menu);

        menu = objectsPopularityMenu.getMenu();
        this.menu.add(menu);

        menu = eventsMenu.getMenu();
        this.menu.add(menu);
    }
}
