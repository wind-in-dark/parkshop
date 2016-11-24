package parkshop.pmcourse.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 管理员
 */
@Controller
@RequestMapping("/manage")
public class ManageCtrl {

	/*
	 * Manage Shop Owner ( 1 Shop Owner only 1 Shop)
	Approve OR Reject New Shop Owner request
	Search Shop Owner or Shop
	Blacklist(黑名单) Shop Owner(Suspended) or Shop
	Delete Shop Owner or Shop
	 */
	
	// add or reject new Shop Owner request
	 @PostMapping("/openShop")
	public String openNewShop(HttpServletRequest request, Model model){
		
		return null;
	}
	 // search shop owner
	 @GetMapping("/search/seller/{sellerId}")
	 public String searchSeller(@PathVariable int sellerId,HttpServletRequest request, Model model){
		 
		 return null;
	 }
	 // search shop 
	 @GetMapping("/search/shop/{shopId}")
	 public String searchShop(@PathVariable int shopId,HttpServletRequest request, Model model){
		 
		 return null;
	 }
	 
	 // Blacklist(黑名单) Shop Owner(Suspended) or Shop
	 @GetMapping("/blacklistShopOwner/{sellerId}")
	 public String blacklistShopOwner(@PathVariable int sellerId,HttpServletRequest request, Model model){
		 
		 return null;
	 }
	 //Delete Shop Owner or Shop
	 @GetMapping("/deleteSeller/{sellerId}")
	 public String deleteSeller(@PathVariable int sellerId,HttpServletRequest request, Model model){
		 
		 return null;
	 }
	 /*
	  * Manage Customer
		Search Customer 
		Blacklist(黑名单) Customer (Suspended)
		Delete Customer
	  */
	 
	 /*
	  *Manage Advertisement
		Top 10 Products 
		Top 5 Stores
	  */
	 
	 /*
	  * Backup Database - Daily
	  */
	 
	 
	 /*
	  * View Sales History (Daily /Weekly/ Monthly/ Yearly) 
	  */
	 
	 /*
	  * Calculate PARKnSHOP.com Income from Sales Commission (2%)
		Daily /Weekly/ Monthly/ Yearly
	  */
	 
	 /*
	  * Manage Commission(管理授权)
		Modify Commission Rates
	  */
	 
	 /*
	  * Search Order by OrderID
	  */
	 
	 
	 
	 
	 
}
