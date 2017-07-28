package com.kerrimattingly.shophappy.controllers;

import com.kerrimattingly.shophappy.models.Store;
import com.kerrimattingly.shophappy.models.StoreItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kerrimattingly on 7/27/17.
 */
@Controller
@RequestMapping("store")
public class StoreController {

    @RequestMapping(value="")
    public String index(Model model){

        model.addAttribute("title", "My Stores");
        return "store/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddStoreForm(Model model) {
        model.addAttribute("title", "Add Store");
        model.addAttribute(new Store());
        //model.addAttribute("stores", storeDao.findAll());
        return "store/add";
    }
}
