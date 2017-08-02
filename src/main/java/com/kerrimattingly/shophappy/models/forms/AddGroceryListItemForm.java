package com.kerrimattingly.shophappy.models.forms;

import com.kerrimattingly.shophappy.models.GroceryList;
import com.kerrimattingly.shophappy.models.StoreItem;

import javax.validation.constraints.NotNull;

/**
 * Created by kerrimattingly on 8/1/17.
 */
public class AddGroceryListItemForm {

    @NotNull
    private int groceryListId;

    @NotNull
    private int storeItemId;

    private Iterable<StoreItem> storeItems;

    private GroceryList groceryList;

    public AddGroceryListItemForm() {}

    public AddGroceryListItemForm(Iterable<StoreItem>storeItems, GroceryList groceryList) {
        this.storeItems = storeItems;
        this.groceryList = groceryList;
    }

    public int getStoreItemId() {
        return storeItemId;
    }

    public Iterable<StoreItem> getStoreItems() {
        return storeItems;
    }
}
