package com.epsi.ecommerce.controllers;

import com.epsi.ecommerce.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showAll() {
        ModelAndView model = new ModelAndView("clients/clients");
		model.addObject("clients", clientService.getAll());

		return model;
	}
}