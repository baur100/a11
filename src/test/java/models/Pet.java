package models;


import enums.Status;

public class Pet {
    private long id;
    private String name;
    private Status status;
    private String[] photoUrls;
    private Category category;
    private Tag[] tags;

    public Pet(String name, Status status, String[] photoUrls, Category category, Tag[] tags) {
//        this.id=id;
        this.name = name;
        this.status = status;
        this.photoUrls = photoUrls;
        this.category = category;
        this.tags = tags;
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

    public Status getStatus() {
        return status;
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
