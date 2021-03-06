package com.example.secondcupcafe;

/**
 * Model class for setting and getting the items from the list
 * @author sanjay
 */
public class BreakfastModel {


    private String title;
    private String price;
    private String imageURL;

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BreakfastModel(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Constructor to set the elements title and price of the items coming from database.
     *
     * @param title
     * @param price
     * @param imageURL
     */
    public BreakfastModel(String title, String price, String imageURL) {
        this.title = title;
        this.price = price;
        this.imageURL = imageURL;
    }
}