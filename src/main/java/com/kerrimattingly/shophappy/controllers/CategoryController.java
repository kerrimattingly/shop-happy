package com.kerrimattingly.shophappy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kerrimattingly on 7/27/17.
 */

@Controller
@RequestMapping("category")
public class CategoryController {

    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("title", "My Categories");
        return "category/index";
    }
}
