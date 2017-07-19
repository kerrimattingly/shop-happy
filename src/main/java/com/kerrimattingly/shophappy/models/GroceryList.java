package com.kerrimattingly.shophappy.models;

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
public class GroceryList {

    //@Id
    //@GeneratedValue
    private int id;

    //@NotNull
    //@Size(min=3, max=25)
    private String name;

    //@ManyToMany: many groceryLists can have many storeItems and vice versa
    private List<StoreItem> storeItems;

    public void addStoreItem(StoreItem storeItem) {
        storeItems.add(storeItem);
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
