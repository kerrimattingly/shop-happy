package com.kerrimattingly.shophappy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kerrimattingly on 7/27/17.
 */
@Controller
@RequestMapping("")
public class ShopHappyController {

    @RequestMapping(value="")
    public String index(Model model) {
        return "index";
    }
}

