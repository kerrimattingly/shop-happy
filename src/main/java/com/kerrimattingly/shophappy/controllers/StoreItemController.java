package com.kerrimattingly.shophappy.controllers;

import com.kerrimattingly.shophappy.models.StoreItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by kerrimattingly on 7/9/17.
 */
@Controller
@RequestMapping("storeItem")
public class StoreItemController {

    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("title", "My Store Items");
        return "storeItem/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddStoreItemForm(Model model) {
        model.addAttribute("title", "Add Store Item");
        model.addAttribute(new StoreItem());
        //model.addAttribute("categories", categoryDao.findAll());
        return "storeItem/add";
    }

    //@RequestMapping(value="add", method = RequestMethod.POST)
    //public String processAddStoreItemForm(@ModelAttribute @Valid StoreItem newStoreItem,
                                          //Errors errors, @RequestParam int categoryId,
                                          //Model model) {
        //if (errors.hasErrors()) {
            //model.addAttribute("title", "Add Store Item");
            //return "storeItem/add";
        //}

        //Category cat = categoryDao.findOne(categoryId);
        //newStoreItem.setCategory(cat);
        //return "redirect:";
    //}
}
