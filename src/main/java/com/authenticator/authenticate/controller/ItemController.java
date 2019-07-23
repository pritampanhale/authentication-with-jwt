package com.authenticator.authenticate.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authenticator.authenticate.components.JwtTokenUtil;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@RequestMapping("/all")
	public List<Item> getAllItems(HttpServletRequest request) {
		String token = request.getHeader("Authorization");
		Boolean validateToken = jwtTokenUtil.validateToken(token);
		List<Item> itemList = new ArrayList<Item>();

		if(validateToken) {
			itemList.add(new Item("Juice", "Juice", 20.0));
			itemList.add(new Item("Candy", "Candy", 30.0));
			itemList.add(new Item("Chocolate", "Cadburry", 40.0));
		}
		
		return itemList;
	}
	
}

class Item{

	private String itemName;
	private String description;
	private Double price;
	
	public Item(String itemName, String desc, Double price) {
		this.itemName = itemName;
		this.description = desc;
		this.price = price;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
