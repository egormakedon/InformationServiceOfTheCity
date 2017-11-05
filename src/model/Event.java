package model;

import java.util.ArrayList;

public class Event {
    private String objectName;
    private String date;
    private String eventName;
    private String eventType;

    public Event(ArrayList<String> list) {
        objectName = list.get(0);
        date = list.get(1);
        eventName = list.get(2);
        eventType = list.get(3);
    }

    public String getObjectName() {
        return objectName;
    }

    public String getDate() {
        return date;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventType() {
        return eventType;
    }
}
