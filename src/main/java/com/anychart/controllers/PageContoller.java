package com.anychart.controllers;

import com.anychart.dao.FruitDAO;
import com.anychart.models.Fruit;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by igor on 9/26/16.
 */

@Controller
@RequestMapping("/")
public class PageContoller {

    @Autowired
    private FruitDAO fruitDAO;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String printWelcome(ModelMap model) {
        List<Fruit> fruits = fruitDAO.getFruits(5);
        model.addAttribute("title", "Anychart Java template");
        model.addAttribute("chartTitle", "Top 5 fruits");
        model.addAttribute("chartData", new Gson().toJson(fruits));
        return "index";
    }
}
