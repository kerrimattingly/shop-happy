package com.kerrimattingly.shophappy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
