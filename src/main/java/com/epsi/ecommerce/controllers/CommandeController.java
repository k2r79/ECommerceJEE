package com.epsi.ecommerce.controllers;

import com.epsi.ecommerce.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/commandes")
public class CommandeController {

    @Autowired
    private CommandeService commandeService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showAll() {
        ModelAndView model = new ModelAndView("commandes/commandes");
        model.addObject("commandes", commandeService.getAll());

        return model;
    }
}