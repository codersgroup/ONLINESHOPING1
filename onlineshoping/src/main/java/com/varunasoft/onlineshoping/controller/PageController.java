package com.varunasoft.onlineshoping.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{
	@RequestMapping(value= {"/","index","welcome"} )
	public ModelAndView index()
	{
		ModelAndView modelAndView=new ModelAndView("page");
		modelAndView.addObject("title", "Home");
		modelAndView.addObject("userClickHome", true);
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
	
	
	@RequestMapping(value= {"product"} )
	public ModelAndView product()
	{
		ModelAndView modelAndView=new ModelAndView("page");
		modelAndView.addObject("title", "Product");
		modelAndView.addObject("userClickListOfProduct", true);
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

}
