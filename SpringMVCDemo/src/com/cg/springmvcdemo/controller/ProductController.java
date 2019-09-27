package com.cg.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productservice;
	@RequestMapping(value = "/myfirst", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	
	/*Sending data for drop down using map.(model and view internally also uses map)*/
	/*We can use fo: type check box and define all the options or we can use the below method*/
	@RequestMapping(value = "/addpage" ,method=RequestMethod.GET)
	public String addProduct(@ModelAttribute("model") Product pro, Map<String,Object> model) {
		List<String> types = new ArrayList<String>();
		types.add("SELECT");
		types.add("Electronics");
		types.add("Grocery");
		types.add("Home appliance");
		model.put("dataitem", types);
		
		List<String> types2 = new ArrayList<String>();
		types2.add("SELECT");
		types2.add("Automatic");
		types2.add("Manual");
		model.put("dataitem2", types2);
		return "AddProduct";
	}
	@RequestMapping(value = "/pagesubmit", method = RequestMethod.POST)
	public String addData(@Valid@ModelAttribute("model") Product pro, BindingResult result, Map<String,Object> model) {
		if(result.hasErrors()) {
			List<String> types = new ArrayList<String>();
			types.add("SELECT");
			types.add("Electronics");
			types.add("Grocery");
			types.add("Home appliance");
			model.put("dataitem", types);
			return "AddProduct";
		}
		else {
			productservice.addProduct(pro);
			return "home";
		}
	}
	@RequestMapping(value = "/showall", method = RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> myList = productservice.showProduct();
		return new ModelAndView("ShowProduct", "prodList", myList);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deletePage() {
		return "DeleteProduct";
	}
	@RequestMapping(value = "/deleteproduct", method = RequestMethod.POST)
	public String deleteData(@RequestParam("pid")int prodId) {
		//System.out.println(pro);
//		productservice.`(pro);
		System.out.println(prodId);
		productservice.removeProduct(prodId);
		return "redirect:/showall";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchPage() {
		return "Show";
	} 
	
	@RequestMapping(value = "/searchproduct", method = RequestMethod.POST)
	public ModelAndView searchPage(@RequestParam("pid") int prodId) {
		Product product = productservice.searchProduct(prodId);
		List<Product> myList = new ArrayList<Product>();
		myList.add(product);
		return new ModelAndView("Show", "prodList", myList);
	}
	
	
}
