package main;

import controller.Controller;
import frame.MainFrame;
import model.Database;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Controller controller = new Controller();
        controller.setDatabase(database);
        MainFrame mFrame = new MainFrame();
        mFrame.setController(controller);
        mFrame.setmFrame();
        mFrame.show();
    }
}
