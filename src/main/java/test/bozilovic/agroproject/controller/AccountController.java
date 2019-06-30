package test.bozilovic.agroproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import test.bozilovic.agroproject.model.Account;
import test.bozilovic.agroproject.service.AccountServiceImpl;

@Controller
public class AccountController {
	
	@Autowired
	AccountServiceImpl service;

	@PostMapping("/accounts/{account_id}/farms")
	public String farms(ModelMap model, @PathVariable Long account_id) {
		Account account = service.findAccountById(account_id);
		model.addAttribute("farms", account.getFarms());
		return "farms";
	}
}
