package com.cg.MVC;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHello()
	{
		String today = new Date().toString();
		return new ModelAndView("hello","modelName",today);
	}
   
}
