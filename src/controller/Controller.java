package controller;

import model.*;

import java.util.ArrayList;

public class Controller {
    private Database database;

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void addCityObject(ArrayList<String> list) {
        CityObject cityObject = new CityObject(list);
        database.addCityObject(cityObject);
    }

    public void editCityObject(ArrayList<String> list) {
        CityObject cityObject = new CityObject(list);
        database.editCityObject(cityObject);
    }

    public void deleteCityObject(String objectId) {
        database.deleteCityObject(objectId);
    }

    public void addOwner(ArrayList<String> list) {
        Owner owner = new Owner(list);
        database.addOwner(owner);
    }

    public void editOwner(ArrayList<String> list) {
        Owner owner = new Owner(list);
        database.editOwner(owner);
    }

    public void deleteOwner(String ownerId) {
        database.deleteOwner(ownerId);
    }

    public void addObjectPopularity(ArrayList<String> list) {
        ObjectPopularity objectPopularity = new ObjectPopularity(list);
        database.addObjectPopularity(objectPopularity);
    }

    public void editObjectPopularity(ArrayList<String> list) {
        ObjectPopularity objectPopularity = new ObjectPopularity(list);
        database.editObjectPopularity(objectPopularity);
    }

    public void deleteObjectPopularity(String objectId, String date) {
        database.deleteObjectPopularity(objectId, date);
    }

    public void addEvent(ArrayList<String> list) {
        Event event = new Event(list);
        database.addEvent(event);
    }

    public void editEvent(ArrayList<String> list) {
        Event event = new Event(list);
        database.editEvent(event);
    }

    public void deleteEvent(String date, String eventName) {
        database.deleteEvent(date, eventName);
    }

    public void showObjectByCurDate() {
        database.showObjectByCurDate();
    }

    public void showEventsForTwoWeeks() {
        database.showEventsForTwoWeeks();
    }

    public void showObjectByDefinitType(String objectType) {
        database.showObjectByDefinitType(objectType);
    }
}
