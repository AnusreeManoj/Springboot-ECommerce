package com.webapp.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.dao.EcommDao;
import com.webapp.demo.ECommerce.ECommClass;

@RestController
public class EcommController {

	@Autowired
	EcommDao dao;
	@RequestMapping("/saveProduct")
	@ResponseBody
	public void saveProduct(@RequestParam String prId, String prName,String prDescription,String prQuantity,String prPrice,String prType,ECommClass obj) {
	
	obj.setDescription(prDescription);
	obj.setProductId(prId);
	obj.setProductName(prName);
	obj.setQuantity(prQuantity);
	obj.setType(prType);
	dao.save(obj);
	System.out.print("added");
		
	}
	
	@RequestMapping("/getByType")
	@ResponseBody
	public List<ECommClass> getByType(@RequestParam String prType) {
		
		return dao.byType(prType);
		
		
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public void deleteProduct(@RequestParam String prId) {
		
		System.out.println("product deleted");
		dao.delete(prId);
		
	
}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<ECommClass> getAll() {
		
		return dao.findAll();
	}
	
	@RequestMapping("/getById")
	@ResponseBody
	public List<ECommClass> getById(@RequestParam String prId) {
		System.out.println("ecommerce by id");
		return dao.byId(prId);
		
	}
	
}