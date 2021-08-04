package models;

import enums.Status1;

public class Pet1 {
    private long id;
    private String name;
    private String[] photoUrls;
    private Category1 category;
    private Tag1[] tags;
    private Status1 status;

    public Pet1(String name, String[] photoUrls, Category1 category, Tag1[] tags, Status1 status) {
        this.name = name;
        this.photoUrls = photoUrls;
        this.category = category;
        this.tags = tags;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public Category1 getCategory() {
        return category;
    }

    public Tag1[] getTags() {
        return tags;
    }

    public Status1 getStatus() {
        return status;
    }
}
