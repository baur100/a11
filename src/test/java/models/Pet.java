package models;

import enums.Status;

public class Pet {
    private Status status;
    private long id;
    private String name;
    private String[] photoUrls;
    private Category category;
    private Tag[] tags;

    public Status getStatus() {
        return status;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public Category getCategory() {
        return category;
    }

    public Tag[] getTags() {
        return tags;
    }
}
