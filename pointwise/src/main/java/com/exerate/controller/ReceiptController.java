package com.exerate.controller;


import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exerate.model.Receipt;
import com.exerate.repository.ReceiptRepository;

@RestController
@RequestMapping("/")
@EnableOAuth2Client
public class ReceiptController {
	@Autowired
	private ReceiptRepository receiptRepository;


	@GetMapping()
	public String WelcomeToUsers(Principal principal) {
		return "Hi "+principal.getName()+" Welcome to receipt module!";
	}
	
	@PostMapping("/add")
	public String addRecipt(@RequestBody Receipt receipt) {
		receiptRepository.save(receipt);
		return "A new recipt generated successfuly with id:" + receipt.getCustomerId();
	}

	@GetMapping("/get-all")
	public List<Receipt> getAllRecipt() {
		return receiptRepository.findAll();
	}

	@GetMapping("/{CustomerId}")
	public Receipt getAllRecipt(@PathVariable("CustomerId") String id) {

		return receiptRepository.findByCustomerId(id);
	}

}
