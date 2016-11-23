package parkshop.pmcourse.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/*
 * 登陆注册类
 */
@Controller
public class SignInUp {
	
	 @PostMapping("/signIn")
		public String signIn(HttpServletRequest request, Model model){
			/*
			 * if customer then goods page
			 * if seller then shop page
			 * if manager then manager page
			 */
			return null;
		}
	 @PostMapping("/signUp")
	 public String signUp(HttpServletRequest request, Model model){
		 /*
		  * if customer then goods page
		  * if seller then shop page
		  * if manager then manager page
		  */
		 return null;
	 }

}
