package com.kerrimattingly.shophappy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by kerrimattingly on 7/9/17.
 */
@Controller
public class StoreItemController {

    @RequestMapping(value="")
    @ResponseBody
    public String index(){
        return "Hello World";
    }
}
