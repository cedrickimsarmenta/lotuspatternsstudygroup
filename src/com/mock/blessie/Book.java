package com.mock.blessie;

/**
 * Created by blessie on 07/06/2017.
 */
public class Book {
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return title + ": " + description;
    }
}
