package parkshop.pmcourse.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CareerBlogIndex {

	 @GetMapping("/")
	    public String welcome(Model model,HttpServletRequest request) {
	    	// do someThing
	    	
	        return "index";
	    }
}
