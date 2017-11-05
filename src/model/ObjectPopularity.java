package model;

import java.util.ArrayList;

public class ObjectPopularity {
    private String objectId;
    private String date;
    private String numberOfVisitors;

    public ObjectPopularity(ArrayList<String> list) {
        objectId = list.get(0);
        date = list.get(1);
        numberOfVisitors = list.get(2);
    }

    public String getObjectId() {
        return objectId;
    }

    public String getDate() {
        return date;
    }

    public String getNumberOfVisitors() {
        return numberOfVisitors;
    }
}
