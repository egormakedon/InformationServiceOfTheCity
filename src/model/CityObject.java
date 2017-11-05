package model;

import java.util.ArrayList;

public class CityObject {
    private String objectId;
    private String objectName;
    private String objectType;
    private String objectAddress;
    private String isOpen;
    private String ownerId;

    public CityObject(ArrayList<String> list) {
        objectId = list.get(0);
        objectName = list.get(1);
        objectType = list.get(2);
        objectAddress = list.get(3);
        isOpen = list.get(4);
        ownerId = list.get(5);
    }

    public String getObjectId() {
        return objectId;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getObjectType() {
        return objectType;
    }

    public String getObjectAddress() {
        return objectAddress;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public String getOwnerId() {
        return ownerId;
    }
}
