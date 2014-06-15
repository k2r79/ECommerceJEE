package com.epsi.ecommerce.controllers;

import com.epsi.ecommerce.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ClientController {

    @Autowired
    private ClientService clientService;

	@RequestMapping(method = RequestMethod.GET)
	public String showAll(ModelMap model) {
		model.addAttribute("clients", clientService.getAll());

		return "clients";
	}
}