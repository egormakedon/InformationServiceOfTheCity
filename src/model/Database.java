package model;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Database {
    private final String user = "root";
    private final String url = "jdbc:mysql://localhost:3306/information_service_of_the_city";
    private final String password = "elzzz147";

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }
    }

    private void sendQuery(String query) {
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {

        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {

            }
        }
    }

    private void closeDB() {
        try {
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {

        }
    }

    public void addCityObject(CityObject cityObject) {
        String objectId = cityObject.getObjectId();
        String objectName = cityObject.getObjectName();
        String objectType = cityObject.getObjectType();
        String objectAddress = cityObject.getObjectAddress();
        String isOpen = cityObject.getIsOpen();
        String ownerId = cityObject.getOwnerId();

        String query = "INSERT INTO object VALUES (" + objectId + "," +
                "\"" + objectName + "\"" + "," +
                "\"" + objectType + "\"" + "," +
                "\"" + objectAddress + "\"" + "," +
                "\"" + isOpen + "\"" + "," +
                ownerId + ");";
        sendQuery(query);
    }

    public void editCityObject(CityObject cityObject) {
        String objectId = cityObject.getObjectId();
        String objectName = cityObject.getObjectName();
        String objectType = cityObject.getObjectType();
        String objectAddress = cityObject.getObjectAddress();
        String isOpen = cityObject.getIsOpen();
        String ownerId = cityObject.getOwnerId();

        String query = "UPDATE object SET " +
                "objectName" + "=" + "\"" + objectName + "\"" + "," +
                "objectType" + "=" + "\"" + objectType + "\"" + "," +
                "objectAddress" + "=" + "\"" + objectAddress + "\"" + "," +
                "isOpen" + "=" + "\"" + isOpen + "\"" + "," +
                "ownerId" + "=" + ownerId + " " +
                "WHERE objectId=" + objectId + ";";
        sendQuery(query);
    }

    public void deleteCityObject(String objectId) {
        String query = "DELETE FROM object WHERE " +
                "objectId=" + objectId +";";
        sendQuery(query);
    }

    public void addOwner(Owner owner) {
        String ownerId = owner.getOwnerId();
        String isPrivate = owner.getIsPrivate();
        String enity = owner.getEnity();
        String name = owner.getName();
        String headFIO = owner.getHeadFIO();
        String phoneNumber = owner.getPhoneNumber();
        String openDate = owner.getOpenDate();

        String query = "INSERT INTO owner VALUES (" + ownerId + "," +
                "\"" + isPrivate + "\"" + "," +
                "\"" + enity + "\"" + "," +
                "\"" + name + "\"" + "," +
                "\"" + headFIO + "\"" + "," +
                phoneNumber + "," +
                "\"" + openDate + "\"" + ");";
        sendQuery(query);
    }

    public void editOwner(Owner owner) {
        String ownerId = owner.getOwnerId();
        String isPrivate = owner.getIsPrivate();
        String enity = owner.getEnity();
        String name = owner.getName();
        String headFIO = owner.getHeadFIO();
        String phoneNumber = owner.getPhoneNumber();
        String openDate = owner.getOpenDate();

        String query = "UPDATE owner SET " +
                "isPrivate" + "=" + "\"" + isPrivate + "\"" + "," +
                "enity" + "=" + "\"" + enity + "\"" + "," +
                "name" + "=" + "\"" + name + "\"" + "," +
                "headFIO" + "=" + "\"" + headFIO + "\"" + "," +
                "phoneNumber" + "=" + phoneNumber + "," +
                "openDate" + "=" + "\"" + openDate + "\"" + " " +
                "WHERE ownerId=" + ownerId + ";";
        sendQuery(query);
    }

    public void deleteOwner(String ownerId) {
        String query = "DELETE FROM owner WHERE " +
                "ownerId=" + ownerId +";";
        sendQuery(query);
    }

    public void addObjectPopularity(ObjectPopularity objectPopularity) {
        String objectId = objectPopularity.getObjectId();
        String date = objectPopularity.getDate();
        String numberOfVisitors = objectPopularity.getNumberOfVisitors();

        String query = "INSERT INTO objectPopularity VALUES (" +
                objectId + "," +
                "\"" + date + "\"" + "," +
                numberOfVisitors + ");";
        sendQuery(query);
    }

    public void editObjectPopularity(ObjectPopularity objectPopularity) {
        String objectId = objectPopularity.getObjectId();
        String date = objectPopularity.getDate();
        String numberOfVisitors = objectPopularity.getNumberOfVisitors();

        String query = "UPDATE objectPopularity SET " +
                "numberOfVisitors" + "=" + numberOfVisitors + " " +
                "WHERE objectId=" + objectId + " " + "AND" + " " +
                "date=" + "\"" + date + "\"" + ";";
        sendQuery(query);
    }

    public void deleteObjectPopularity(String objectId, String date) {
        String query = "DELETE FROM objectPopularity WHERE objectId=" + objectId + " " +
                "AND" + " " + "date=" + "\"" + date + "\"" + ";";
        sendQuery(query);
    }

    public void addEvent(Event event) {
        String objectName = event.getObjectName();
        String date = event.getDate();
        String eventName = event.getEventName();
        String ventType = event.getEventType();

        String query = "INSERT INTO event VALUES (" +
                "\"" + objectName + "\"" + "," +
                "\"" + date + "\"" + "," +
                "\"" + eventName + "\"" + "," +
                "\"" + ventType + "\"" + ");";
        sendQuery(query);
    }

    public void editEvent(Event event) {
        String objectName = event.getObjectName();
        String date = event.getDate();
        String eventName = event.getEventName();
        String eventType = event.getEventType();

        String query = "UPDATE event SET " +
                "objectName" + "=" + "\"" + objectName + "\"" + "," +
                "date" + "=" + "\"" + date + "\"" + "," +
                "eventType" + "=" + "\"" + eventType + "\"" +
                "WHERE eventName=" + "\"" + eventName + "\"" + ";";
        sendQuery(query);
    }

    public void deleteEvent(String date, String eventName) {
        String query = "DELETE FROM event WHERE date=" + "\"" + date + "\"" + " " + "AND" +
                " " + "eventName=" + "\"" + eventName + "\"" + ";";
        sendQuery(query);
    }

    public void showObjectByCurDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String curDate = dateFormat.format(new Date());

        String query = "SELECT objectType, objectName, objectAddress FROM object " +
                "WHERE object.ownerId IN " +
                "(SELECT owner.ownerId FROM owner WHERE openDate <= " + "\"" + curDate + "\"" + ")" + " " +
                "AND isOpen = " + "\"" + "open" + "\"" + ";";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String objectType = resultSet.getString("objectType");
                String objectName = resultSet.getString("objectName");
                String objectAddress = resultSet.getString("objectAddress");

                System.out.println(curDate + " " + objectType + " " + objectName + " " + objectAddress);
            }

        } catch (SQLException e) {

        } finally {
            closeDB();
        }
    }

    public void showEventsForTwoWeeks() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        final long TWO_WEEKS = 1209600000L;
        String dateThrowTwoWeeks = dateFormat.format(new Date().getTime() + TWO_WEEKS);
        String curDate = dateFormat.format(new Date());

        String query = "SELECT e.date, e.eventName, e.objectName, obj.objectAddress " +
                "FROM event e, object obj " +
                "WHERE e.date >= " + "\"" + curDate + "\"" + " " + "AND" + " " +
                "e.date <= " + "\"" + dateThrowTwoWeeks + "\"" + " " + "AND" + " " +
                "obj.objectName = e.objectName;";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String date = resultSet.getString("e.date");
                String eventName = resultSet.getString("e.eventName");
                String objectName = resultSet.getString("e.objectName");
                String objectAddress = resultSet.getString("obj.objectAddress");

                System.out.println(date + " " + eventName + " " + objectName + " " + objectAddress);
            }

        } catch (SQLException e) {

        } finally {
            closeDB();
        }
    }

    public void showObjectByDefinitType(String objectType) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String curDate = dateFormat.format(new Date());

        String query = "SELECT * FROM object obj WHERE obj.objectType = " + "\"" + objectType + "\"" + " " + "AND" + " " +
                "obj.objectName IN (SELECT e.objectName FROM event e WHERE " +
                "e.date = " + "\"" + curDate + "\"" +");";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String objectId = resultSet.getString("obj.objectId");
                String objectName = resultSet.getString("obj.objectName");
                String objectAddress = resultSet.getString("obj.objectAddress");
                String isOpen = resultSet.getString("obj.isOpen");
                String ownerId = resultSet.getString("obj.ownerId");

                System.out.println(objectId + " " + objectName + " " + objectType + " " +
                        objectAddress + " " + isOpen + ownerId);
            }

        } catch (SQLException e) {

        } finally {
            closeDB();
        }
    }
}
