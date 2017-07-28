package com.kerrimattingly.shophappy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by kerrimattingly on 7/18/17.
 */
//@Entity
public class StoreItem {

    //@Id
    //@GeneratedValue
    private int id;

    //@NotNull
    //@Size(min=3, max=25)
    private String name;

    //@NotNull
    //@Size(min=1, message = "Description must not be empty")
    private String description;

    //@NotNull
    private double price;

    //there can be many storeItem for one category: ManyToOne
    private Category category;

    //there can be many storeItem in many groceryLists: ManyToMany
    private List<GroceryList> groceryLists;

    //there can be many storeItem in many stores: ManyToMany
    private List<Store> stores;

    public StoreItem(String name, String description, double price, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public StoreItem() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
