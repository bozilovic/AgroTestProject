package test.bozilovic.agroproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import test.bozilovic.agroproject.model.Farm;
import test.bozilovic.agroproject.service.FarmServiceImpl;

@Controller
public class FarmController {

	private FarmServiceImpl service;
	
	@Autowired
	public FarmController(FarmServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping("/farms")
	public String getAllFarms(ModelMap model) {
		model.addAttribute("farms", service.getAllFarms());
		return "/farms";
	}
	
	@PostMapping("/farms/{account_id}")
	public String getFarmsbyAccountId(ModelMap model, @PathVariable Long account_id) {
		List<Farm> farms = service.getFarmsByAccountId(account_id);
		model.addAttribute("farms", farms);
		return "/farms";
	}
}
