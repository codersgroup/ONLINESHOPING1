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
		modelAndView.addObject("greeting", "welcome to my shop");
		return modelAndView;
	}

}
