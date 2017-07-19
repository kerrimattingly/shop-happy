package com.kerrimattingly.shophappy.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kerrimattingly on 7/18/17.
 */
//@Entity
public class Store {

    //@Id
    //GeneratedValue
    private int id;

    //@NotNull
    //@Size(min=3, max=25)
    private String name;

    //@ManyToMany: many stores can have many storeItems and vice versa
    private List<StoreItem> storeItems;

    public void addStoreItem(StoreItem storeItem) {
        storeItems.add(storeItem);
    }

    public Store() { }

    public Store(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public List<StoreItem> getStoreItems() {
        return storeItems;
    }
}
