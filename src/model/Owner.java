package model;

import java.util.ArrayList;

public class Owner {
    private String ownerId;
    private String isPrivate;
    private String enity;
    private String name;
    private String headFIO;
    private String phoneNumber;
    private String openDate;

    public Owner(ArrayList<String> list) {
        ownerId = list.get(0);
        isPrivate = list.get(1);
        enity = list.get(2);
        name = list.get(3);
        headFIO = list.get(4);
        phoneNumber = list.get(5);
        openDate = list.get(6);
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getIsPrivate() {
        return isPrivate;
    }

    public String getEnity() {
        return enity;
    }

    public String getName() {
        return name;
    }

    public String getHeadFIO() {
        return headFIO;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOpenDate() {
        return openDate;
    }
}
