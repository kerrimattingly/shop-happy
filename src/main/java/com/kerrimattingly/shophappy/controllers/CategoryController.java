package com.kerrimattingly.shophappy.controllers;

import com.kerrimattingly.shophappy.models.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute(new Category());
        model.addAttribute("title", "Add Category");
        return "category/add";

    }
}
