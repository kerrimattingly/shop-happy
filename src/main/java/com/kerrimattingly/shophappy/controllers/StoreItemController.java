package com.kerrimattingly.shophappy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
