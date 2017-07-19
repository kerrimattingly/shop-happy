package com.kerrimattingly.shophappy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kerrimattingly on 7/18/17.
 */
//@Entity
public class Category {

    //@Id
    //@GeneratedValue
    private int id;

    //@NotNull
    //@Size(min=3, max=15)
    private String name;

    //@OneToMany each one category will have many storeItems; each storeItem can only have one category
    //@JoinColumn(name = "category_id")
    private List<StoreItem> storeItems = new ArrayList<>();

    public Category() { }

    public Category(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StoreItem> getStoreItems() {
        return storeItems;
    }
}
