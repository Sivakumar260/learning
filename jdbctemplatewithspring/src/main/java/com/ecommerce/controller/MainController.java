package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.EProductEntity;

@Controller
public class MainController {

	@Autowired
	EProductDAO eproductDAO;
	
	@GetMapping("/list")
	public String listProducts(ModelMap map)
	{
		List<EProductEntity> list=eproductDAO.getProducts();
		map.addAttribute("list",list);
		return "listproducts";
	}
	@GetMapping("/update")
	 public String update(ModelMap map,@RequestParam(name="name")String name, @RequestParam(name="email")String email,@RequestParam(name="password")String password) {
		    
		    EProductEntity user=new EProductEntity();
		    
		    user.setName(name);
		    user.setEmail(email);
		    user.setPassword(password);

			eproductDAO.update(user);
			map.addAttribute("user",user);
			return "updateresult";
			
	 }
}
