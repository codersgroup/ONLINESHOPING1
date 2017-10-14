package com.varunasoft.onlineshoping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.varunasoft.shopingBackend.dao.CatagoryDao;
import com.varunasoft.shopingBackend.dto.Catagory;

@Controller
public class PageController 
{
	
	@Autowired
	CatagoryDao catagoryDao;
	
	@RequestMapping(value= {"/","index","welcome","/home"} )
	public ModelAndView index()
	{
		ModelAndView modelAndView=new ModelAndView("page");
		modelAndView.addObject("title", "Home");
		modelAndView.addObject("userClickHome", true);
		modelAndView.addObject("CatagoryList",catagoryDao.list() );
		return modelAndView;
	}
	
	
	@RequestMapping(value= {"/aboutUs"} )
	public ModelAndView aboutUs()
	{
		ModelAndView modelAndView=new ModelAndView("page");
		modelAndView.addObject("title", "About Us");
		modelAndView.addObject("userClickAboutUs", true);
		return modelAndView;
	}
	
	

	
	
	@RequestMapping(value= {"contactUs"} )
	public ModelAndView contactUs()
	{
		ModelAndView modelAndView=new ModelAndView("page");
		modelAndView.addObject("title", "Contact Us");
		modelAndView.addObject("userClickContactUs", true);
		return modelAndView;
	}
	
	
	@RequestMapping(value= {"/show/all/products"} )
	public ModelAndView showAllProduct()
	{
		ModelAndView modelAndView=new ModelAndView("page");
		modelAndView.addObject("title", "All Product");
		modelAndView.addObject("CatagoryList",catagoryDao.list() );
		modelAndView.addObject("userClickAllProduct", true);
		return modelAndView;
	}
	
	
	@RequestMapping(value= {"/show/catagoies/{id}/product"} )
	public ModelAndView showIdProduct(@PathVariable("id") int id)
	{
		ModelAndView modelAndView=new ModelAndView("page");
		
	
		
		modelAndView.addObject("title",catagoryDao.getCatagory(id).getName());
		modelAndView.addObject("userClickIdProduct", true);
		modelAndView.addObject("CatagoryList",catagoryDao.list() );
		modelAndView.addObject("catagory",catagoryDao.getCatagory(id) );
		return modelAndView;
	}

}
